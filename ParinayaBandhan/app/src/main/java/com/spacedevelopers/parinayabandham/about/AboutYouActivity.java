package com.spacedevelopers.parinayabandham.about;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.google.gson.JsonObject;
import com.spacedevelopers.parinayabandham.Responses.SaveAboutResponse;
import com.spacedevelopers.parinayabandham.models.AboutReq;
import com.spacedevelopers.parinayabandham.models.SaveAbout;
import com.spacedevelopers.parinayabandham.network.ApiController;
import com.spacedevelopers.parinayabandham.network.ApiService;
import com.spacedevelopers.parinayabandham.utility.SharedPrefs;
import com.spacedevelopers.parinayabandhan.R;
import com.spacedevelopers.parinayabandhan.databinding.ActivityAboutYouBinding;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

   public class AboutYouActivity extends AppCompatActivity {
    ActivityAboutYouBinding binding;
      // Spinner communitySpinner, religionSpinner, thisprofileisforSpinner, genderSpinner;
       SharedPrefs sharedPrefs = SharedPrefs.getInstance(AboutYouActivity.this);
       TextView mobileno, mailid,user,userhint,textViewResult;
       EditText mobilenoedittxt, emailedittext, dob, name;
       String selectedCaste, selectedProfilecreatedfor, selectedReligion, selectedGender;
       int backupselectpc, backupselCast, backupReligion;
       String mobilesave,emailsave;

AppCompatButton nextButton;
String communityId ;
int communityIndex=0;
       @Override
       protected void onCreate(Bundle savedInstanceState) {
           super.onCreate(savedInstanceState);
       binding=ActivityAboutYouBinding.inflate(getLayoutInflater());
       setContentView(binding.getRoot());
           textViewResult = findViewById(R.id.mobilenum);
           mobilenoedittxt = findViewById(R.id.mobilenoet);
    user=findViewById(R.id.usertxt);
    userhint=findViewById(R.id.usertextid);
           dob = findViewById(R.id.dob);
           name = findViewById(R.id.edittext_full_name);
         mailid=findViewById(R.id.emailidtxt);
         emailedittext=findViewById(R.id.emailidet);
         nextButton=findViewById(R.id.nextbtn);

//       /*    religionSpinner = findViewById(R.id.religionSpinner);
//
//           genderSpinner = findViewById(R.id.genderspinner);
//           communitySpinner = findViewById(R.id.CommunitySpinner);
//           thisprofileisforSpinner = findViewById(R.id.profilefor);*/
           //  religionSpinner.setBackgroundDrawable(getResources().getDrawable(R.drawable.ic_arrow_drop_down_black_24dp));
           String userKey = sharedPrefs.getString("userKey");

           getDropDowndata();
           getStoredResp(selectedCaste);
           boolean defaultvalue = false;
           Intent receivedIntent = getIntent();
           boolean receivedBooleanValue = receivedIntent.getBooleanExtra("ismobilenokey", defaultvalue);
           Log.e("tag", "is mobile number is =" + receivedBooleanValue);
           Log.e("Value =caste ", "" + backupselCast);
           Log.e("userid", "id" + userKey);

           if (receivedBooleanValue == true) {
               mobilenoedittxt.setVisibility(View.INVISIBLE);

               mailid.setVisibility(View.VISIBLE);
               emailedittext.setVisibility(View.VISIBLE);
               nextButton.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       saveaboutAPIEmail();
                   }
               });


           } else {

               mailid.setVisibility(View.INVISIBLE);
               emailedittext.setVisibility(View.INVISIBLE);

               mobilenoedittxt.setVisibility(View.VISIBLE);
               textViewResult.setVisibility(View.VISIBLE);

               nextButton.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       saveaboutAPINum();
                   }
               });

               }






       }
       @Override
       protected void onResume() {
           super.onResume();

           // Perform actions when the activity is resumed
           // Retrieve the selected caste from SharedPreferences


           Log.e("Value =caste ", "" + backupselCast);

           // Any other code you want to execute after the value is retrieved
       }
       ArrayList<GetDropDownResponse.Castedatum> castedatumArrayList=new ArrayList<>();
       ArrayList<GetDropDownResponse.ReligionDatum> religionDatumArrayList=new ArrayList<>();
       ArrayList<GetDropDownResponse.Createdbydatum> createdbydatumArrayList=new ArrayList<>();
       ArrayList<String> genderArraylist=new ArrayList<String>();
       public void getDropDowndata() {
           String userKEY = sharedPrefs.getString("userKey");
           AboutReq req = new AboutReq(userKEY);
           ApiController apiController = ApiController.getInstance();
           ApiService apiService = apiController.getMyApi();
         //  ApiService apiService1 =ApiController.getInstance().getMyApi();
           JsonObject jsonObject  = new JsonObject();
           jsonObject.addProperty("user", SharedPrefs.getInstance(AboutYouActivity.this).getString("userKey"));

           Call<GetDropDownResponse> castecall =apiService.getDataDropdown(jsonObject);

           castecall.enqueue(new Callback<GetDropDownResponse>() {
               @Override
               public void onResponse(Call<GetDropDownResponse> call, Response<GetDropDownResponse> response) {
                   if (response.isSuccessful()) {
                       GetDropDownResponse dropDownResponse = response.body();


                       // Check if mobile number is empty
                    /*   if (TextUtils.isEmpty(dropDownResponse.getMobile())) {
                           textViewResult.setText("Mobile Number");
                       }
                       // Check if email is empty
                       else if (TextUtils.isEmpty(dropDownResponse.getEmail())) {
                           textViewResult.setText("Email");
                       }
                       // Both mobile and email are not empty
                       else {
                           textViewResult.setText("Mobile Number: " + dropDownResponse.getMobile() +
                                   "\nEmail: " + dropDownResponse.getEmail());
                       }*/


                       if (!TextUtils.isEmpty(dropDownResponse.getMobile())) {
                           // Mobile number is not empty
                           textViewResult.setText("Email");
                           userhint.setText("Mobile Number");
                           Log.e("tag", "Mobile is present");
                       } else if (!TextUtils.isEmpty(dropDownResponse.getEmail())) {
                           // Email is not empty, and mobile number is empty
                           textViewResult.setText("Mobile Number");
                           userhint.setText("Email Id");
                           Log.e("tag", "Email is present");
                       } else {
                           // Both mobile and email are empty
                           Log.e("tag", "Both are present");
                       }

                       boolean  ismobileVerfied =true;
                       boolean isEmailVerified=true;

                       if(ismobileVerfied){
                           mobilesave=dropDownResponse.getUser();
                       } else if (isEmailVerified) {
                           emailsave=dropDownResponse.getUser();
                       }


                       if (dropDownResponse.getUser() != null) {
                           String user = dropDownResponse.getUser();


                           // Check if it's a valid email address
                           if (isEmailValid(user)) {
                               // Handle the case where it's a valid email address
                               // ...
                               emailsave=user;

                           }

                           // Check if it's a valid phone number
                           if (isPhoneNumberValid(user)) {
                               // Handle the case where it's a valid phone number
                               // ...
                               mobilesave = user;
                           }
                       }


                       dropDownResponse.getUser();
                  binding.usertxt.setText( dropDownResponse.getUser());
              castedatumArrayList  = new ArrayList<>();
              if(dropDownResponse!=null && dropDownResponse.getCastedata()!=null) {
                         castedatumArrayList.addAll(dropDownResponse.getCastedata());
                       }
                           List<GetDropDownResponse.Castedatum> casteData = dropDownResponse.getCastedata();

                           ArrayList<String> casteNames = new ArrayList<>();
                           ArrayList<Integer> casteid = new ArrayList<>();
                          casteNames.add("select");

                           for (GetDropDownResponse.Castedatum caste : castedatumArrayList) {
                               casteNames.add((caste.getCasteName()));
                                 // selPos =castedatumArrayList.indexOf(caste.getCasteName())+1;
                                 // selectedcommunity=castedatumArrayList.indexOf(caste.getId())+1;
                               casteid.add((caste.getId()));
                           }
                          binding.CommunitySpinner.setAdapter( new ArrayAdapter<>(AboutYouActivity.this,R.layout.list_units,casteNames));

                      binding.CommunitySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                           @Override
                           public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                               if (position > 0){

                                   int selectedId = castedatumArrayList.get(position-1).getId();

                                   if (selectedId != -1) {
                                       backupselCast = selectedId;

                                   }
                               }
                               else {
                                   backupselCast = -1;// Reset to -1 if "Select" is chosen
                                   Log.e("","");
                                   ((TextView) parentView.getSelectedView()).setError("Please select a valid Religion");
                               }
                           }

                           @Override
                           public void onNothingSelected(AdapterView<?> parentView) {
                               backupselCast=-1;
                           }
                       });
                   }
               }

               @Override
               public void onFailure(Call<GetDropDownResponse> call, Throwable t) {
                   Toast.makeText(AboutYouActivity.this, "network error", Toast.LENGTH_SHORT).show();
               }
           });

           
           Call<GetDropDownResponse> religioncall =apiService.getDataDropdown(jsonObject);
                religioncall .enqueue(new Callback<GetDropDownResponse>() {
               @Override
               public void onResponse(Call<GetDropDownResponse> call, Response<GetDropDownResponse> response) {
                   if (response.isSuccessful()) {
                       GetDropDownResponse dropDownResponse = response.body();
                             religionDatumArrayList = new ArrayList<>();
                           if(dropDownResponse!=null && dropDownResponse.getReligionData()!=null) {
                               religionDatumArrayList.addAll(dropDownResponse.getReligionData());
                           }
                          // List<GetDropDownResponse.ReligionDatum> religionData = dropDownResponse.getReligionData();
                           // Extract caste names from the casteData list
                           ArrayList<String> religionNames = new ArrayList<>();
                       ArrayList<Integer> religionIds = new ArrayList<>();
                       religionNames.add("select");

                           for (GetDropDownResponse.ReligionDatum religionDatum : religionDatumArrayList ) {
                               religionNames.add(religionDatum.getReligionName());
                             religionIds.add(religionDatum.getId());
                           // selectreligion= religionIds.indexOf(religionDatum.getId());

                           }

                           binding.religionSpinner.setAdapter( new ArrayAdapter<>(AboutYouActivity.this,R.layout.list_units,religionNames));
                     binding.religionSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                           @Override
                           public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {

                               if (position > 0){

                                   int selectedId = religionDatumArrayList.get(position-1).getId();
                               //     ((TextView) parentView.getSelectedView()).setError(null);


                               //  int selectedId = religionIds.get(position);
                               if (selectedId != -1) {

                                   //    sharedPrefs.saveInt("religionkey", selectedId);
                                   backupReligion = selectedId;

                               }
                           }
                                  else {
                                         backupReligion = -1;// Reset to -1 if "Select" is chosen
                                     Log.e("","");
                                         ((TextView) parentView.getSelectedView()).setError("Please select a valid Religion");
                                     }

                                 }

                         @Override
                         public void onNothingSelected(AdapterView<?> parent) {
                                backupReligion =-1;
                         }
                     });
                       }
               }

               @Override
               public void onFailure(Call<GetDropDownResponse> call, Throwable t) {
                   Toast.makeText(AboutYouActivity.this, "network error", Toast.LENGTH_SHORT).show();
               }
           });

           Call<GetDropDownResponse> profileforcall =apiService.getDataDropdown(jsonObject);
           profileforcall .enqueue(new Callback<GetDropDownResponse>() {
               @Override
               public void onResponse(Call<GetDropDownResponse> call, Response<GetDropDownResponse> response) {
                   if (response.isSuccessful()) {
                       GetDropDownResponse dropDownResponse = response.body();
                          createdbydatumArrayList = new ArrayList<>();
                           if(dropDownResponse!=null && dropDownResponse.getCreatedbydata()!=null) {
                              createdbydatumArrayList.addAll(dropDownResponse.getCreatedbydata());
                           }
                           List<GetDropDownResponse.Createdbydatum> profile = dropDownResponse.getCreatedbydata();
                           // Extract caste names from the casteData list
                           ArrayList<String> profilefor = new ArrayList<>();
                       ArrayList<Integer> profieId = new ArrayList<>();
                       profilefor.add("select");

                           int  profselpos =0;
                           int selectedProfileId2=0;
                           for (GetDropDownResponse.Createdbydatum profilecreatedfor  : createdbydatumArrayList ) {
                               profilefor.add(profilecreatedfor.getName());
                               profieId.add(profilecreatedfor.getId());

                           }

                               binding.profilefor.setAdapter(new ArrayAdapter<>(AboutYouActivity.this, R.layout.list_units, profilefor));
                               binding.profilefor.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                   @Override
                                   public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                       if(position>0) {
                                           int selectedprofile = createdbydatumArrayList.get(position-1).getId();

                                           if (selectedprofile != -1) {
                                               backupselectpc = selectedprofile;
                                           }
                                       }
                                        else{
                                            backupselectpc=-1;
                                        }
                                   }

                                   @Override
                                   public void onNothingSelected(AdapterView<?> parent) {
                                       backupselectpc = -1;
                                   }
                               });

                   }
               }

               @Override
               public void onFailure(Call<GetDropDownResponse> call, Throwable t) {
                   Toast.makeText(AboutYouActivity.this, "network error", Toast.LENGTH_SHORT).show();
               }
           });



           Call<GetDropDownResponse>  gender =apiService.getDataDropdown(jsonObject);
           gender.enqueue(new Callback<GetDropDownResponse>() {

               @Override
               public void onResponse(Call<GetDropDownResponse> call, Response<GetDropDownResponse> response) {
                   if (response.isSuccessful()) {
                       GetDropDownResponse dropDownResponse = response.body();
                       if (dropDownResponse != null) {
                           genderArraylist.addAll(dropDownResponse.getGenderData());
                           List<String> genderData = dropDownResponse.getGenderData();

                           if (genderData != null) {
                               ArrayList<String> genderList = new ArrayList<>();
                               genderList.add("select");
                               int genSelPos=0;
                               for (String gender: genderArraylist) {
                                   genderList.add(gender);
                                 //  genSelPos=genderArraylist.indexOf(gender)-1;

                               }
                                final int selectgender=genderList.indexOf(gender);
                               binding.genderspinner.setAdapter( new ArrayAdapter<>(AboutYouActivity.this,R.layout.list_units,genderList));
                             //  binding.genderspinner.setSelection(genSelPos);
                               binding.genderspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                   @Override
                                   public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                      if(position==selectgender){
                                          int selgen= Integer.parseInt(genderList.get(position-1));

                                      }

                                   }

                                   @Override
                                   public void onNothingSelected(AdapterView<?> parent) {

                                   }
                               });

                           }
                           }
                       }

                   }


               @Override
               public void onFailure(Call<GetDropDownResponse> call, Throwable t) {
                   Toast.makeText(AboutYouActivity.this, "network error", Toast.LENGTH_SHORT).show();
               }
           });
       }


       private boolean isEmailValid(String email) {
           // Define a simple email pattern
           String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

           // Check if the email matches the pattern
           return email.matches(emailPattern);
       }

       private boolean isPhoneNumberValid(String phoneNumber) {
           // Define a simple phone number pattern (you may need to adjust this based on your requirements)
           String phonePattern = "\\d{10}";

           // Check if the phone number matches the pattern
           return phoneNumber.matches(phonePattern);
       }


       public  void saveaboutAPINum(){

           ApiController apiController = ApiController.getInstance();
           ApiService apiService = apiController.getMyApi();
       /*   MultipartBody.Builder builder = new MultipartBody.Builder()
                   .setType(MultipartBody.FORM);*/

        String mobilenum="";
           String gender = "";
           int religion = 0;
           int community = 0;
           int pcfor=0;

           mobilenum=binding.mobilenum.getText().toString();

           try {
               gender = binding.genderspinner.getSelectedItem().toString();
           } catch (Exception e) {
               e.printStackTrace();
           }
           try {
               pcfor = Integer.parseInt(binding.profilefor.getSelectedItem().toString());
           } catch (Exception e) {
               e.printStackTrace();
           }
            Log.e("Tag","profile Id is  from save about ="+pcfor);

           String userKey = sharedPrefs.getString("userKey");
           JsonObject jsonObject  = new JsonObject();
           jsonObject.addProperty("user", SharedPrefs.getInstance(AboutYouActivity.this).getString("userKey"));
           jsonObject.addProperty("gender", gender);
           if(backupselectpc !=-1){
           jsonObject.addProperty("pc",backupselectpc);}

           jsonObject.addProperty("phone",mobilenoedittxt.getText().toString());
           jsonObject.addProperty("name", name.getText().toString());
           jsonObject.addProperty("date_of_birth", dob.getText().toString());
           if(backupReligion!=-1){
           jsonObject.addProperty("religion", backupReligion);}
           if(backupselCast!=-1) {
               jsonObject.addProperty("caste", backupselCast);
           }

          // jsonObject.add("phone", );

          /* builder.addFormDataPart("user", userKey)

                   .addFormDataPart("gender", gender)
                   .addFormDataPart("pc", pcfor)
                   .addFormDataPart("phone",)
                   .addFormDataPart("name", name.getText().toString())
                   .addFormDataPart("date_of_birth", dob.getText().toString())
                   .addFormDataPart("religion", religion)
                   .addFormDataPart("caste", community)
                   .build();*/
         //String userid = sharedPrefs.getString("userKey");
        // SaveAbout aboutReq=new SaveAbout(userId,gender,pc,phonenum,email,name,dob,religion,caste);

       Call<SaveAboutResponse> call =apiService.saveAbout(jsonObject);
      call.enqueue(new Callback<SaveAboutResponse>() {
    @Override
    public void onResponse(Call<SaveAboutResponse> call, Response<SaveAboutResponse> response) {
        SaveAboutResponse obj=response.body();
         if(response.isSuccessful()) {
           //  Toast.makeText(AboutYouActivity.this, "Data saved move to next step", Toast.LENGTH_SHORT).show();
             Toast.makeText(AboutYouActivity.this, obj.getMessage(), Toast.LENGTH_SHORT).show();
            Log.d("tag","Save about response"+obj) ;
             Log.e("tag"," Data saved  about you details ...");
         }
         else{
             Toast.makeText(AboutYouActivity.this,obj.getMessage() , Toast.LENGTH_SHORT).show();
         }


    }

    @Override
    public void onFailure(Call<SaveAboutResponse> call, Throwable t) {
        t.printStackTrace();
        Toast.makeText(AboutYouActivity.this, "Network error ", Toast.LENGTH_SHORT).show();

    }
});

     }

       public  void saveaboutAPIEmail(){

           ApiController apiController = ApiController.getInstance();
           ApiService apiService = apiController.getMyApi();
        /*   MultipartBody.Builder builder = new MultipartBody.Builder()
                   .setType(MultipartBody.FORM);*/
           String email="";
           String gender = "";
           int religion =0;
           int community=0 ;
           int pc =0;

           email=binding.mobilenum.getText().toString();


           try {
               gender = binding.genderspinner.getSelectedItem().toString();
           } catch (Exception e) {
               e.printStackTrace();
           }

           String userKey = sharedPrefs.getString("userKey");


           JsonObject jsonObject  = new JsonObject();
           jsonObject.addProperty("user", SharedPrefs.getInstance(AboutYouActivity.this).getString("userKey"));
           jsonObject.addProperty("gender", gender);
           if(backupselectpc!=-1) {
               jsonObject.addProperty("pc", backupselectpc);
           }
           jsonObject.addProperty("email",emailedittext.getText().toString());
           jsonObject.addProperty("name", name.getText().toString());
           jsonObject.addProperty("date_of_birth", dob.getText().toString());

           if(backupReligion!=-1){
               Log.e("msg","religion id "+backupReligion);

               jsonObject.addProperty("religion", backupReligion);
           }
           if(backupselCast!=-1) {
               jsonObject.addProperty("caste", backupselCast);
           }

     /*      builder.addFormDataPart("user", userKey)
                   .addFormDataPart("gender", gender)
                   .addFormDataPart("pc",  pc)
                   .addFormDataPart("email",emailedittext.getText().toString())
                   .addFormDataPart("name", name.getText().toString())
                   .addFormDataPart("date_of_birth", dob.getText().toString())
                   .addFormDataPart("religion", religion)
                   .addFormDataPart("caste", community)
                   .build();*/
           //String userid = sharedPrefs.getString("userKey");
           // SaveAbout aboutReq=new SaveAbout(userId,gender,pc,phonenum,email,name,dob,religion,caste);

           Call<SaveAboutResponse>  call =apiService.saveAbout(jsonObject);
           call.enqueue(new Callback<SaveAboutResponse>() {
               @Override
               public void onResponse(Call<SaveAboutResponse> call, Response<SaveAboutResponse> response) {
                SaveAboutResponse resp= response.body();
                  Log.e("Response","Save about response is "+resp.getMessage());
                  String message=resp.getMessage();
                   if(response.isSuccessful()) {
                       Log.e("tag",""+response.body());
                       Log.e("tag"," Data saved  about you deatsils ...");
                       Toast.makeText(AboutYouActivity.this,resp.getMessage(), Toast.LENGTH_SHORT).show();
                   }
                   else {
                       Toast.makeText(AboutYouActivity.this, ""+message, Toast.LENGTH_SHORT).show();
                   }
               }

               @Override
               public void onFailure(Call<SaveAboutResponse> call, Throwable t) {
                   t.printStackTrace();
                   Toast.makeText(AboutYouActivity.this, ""+t, Toast.LENGTH_SHORT).show();
                   Toast.makeText(AboutYouActivity.this, "Network error ", Toast.LENGTH_SHORT).show();

               }
           });

       }
       private void getStoredResp(String selectedCaste) {
           // Do something with the selected caste value in yourMethod()
           // This method is called when an item is selected in the spinner
           if (selectedCaste != null && !selectedCaste.isEmpty()) {
               // Example: Display a toast message with the selected caste
               Toast.makeText(AboutYouActivity.this, "Selected Caste: " + selectedCaste, Toast.LENGTH_SHORT).show();
           } else {
               // Handle the case where no caste is selected
               Toast.makeText(AboutYouActivity.this, "Please select a caste", Toast.LENGTH_SHORT).show();

           }
   }


       }

package com.parinayabandham.about;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.gson.JsonObject;
import com.parinayabandham.Responses.SaveAboutPatner;
import com.parinayabandham.databinding.ActivityAboutPatnerBinding;
import com.parinayabandham.network.ApiController;
import com.parinayabandham.network.ApiService;
import com.parinayabandham.utility.SharedPrefs;
import com.skydoves.powerspinner.OnSpinnerItemSelectedListener;

import java.util.ArrayList;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AboutPatner extends AppCompatActivity {
    ActivityAboutPatnerBinding binding;

   AppCompatButton registerBtn;
  private int backupageFrom =-1;
  int backupageTo=-1;
   private long backupHeightTo=-1;
   long BackupHeightFrom =-1;
   long backupEducation=-1;
       long    backupjob=-1;
          long backupcaste=-1;
          long backupreligion = -1;
SharedPrefs sharedPrefs=SharedPrefs.getInstance(AboutPatner.this);

CheckBox checkBox;
    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityAboutPatnerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getPatnerDetails();

        registerBtn=binding.continuebtn;
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                savePatnerDetails();
            }
        });

    }


    ArrayList<AboutPatnerResponse.AgeDatum> ageDatumArrayList =new ArrayList<>();
    ArrayList<AboutPatnerResponse.Castedatum> castedatumArrayList= new ArrayList<>();
    ArrayList<AboutPatnerResponse.HeighstEducationDatum> heighstEducationDatumArrayList = new ArrayList<>();
    ArrayList<AboutPatnerResponse.OccupationDatum> occupationDatumArrayList = new ArrayList<>();
    ArrayList<AboutPatnerResponse.Heightdatum> heightdatumArrayList = new ArrayList<>();
    ArrayList<AboutPatnerResponse.Religiondatum> religiondatumArrayList = new ArrayList<>();
    public void getPatnerDetails(){
        ApiService apiService= ApiController.getInstance().getMyApi();
        JsonObject jsonObject= new JsonObject();
        jsonObject.addProperty("profile_id", SharedPrefs.getInstance(AboutPatner.this).getLong("profileidaboutkey"));


        ArrayList<String> agefrom = new ArrayList<>();
        ArrayList<String> ageTo = new ArrayList<>();
        binding.fromAgeSpinner.setItems(agefrom);
        binding.toAgeSpinner.setItems(ageTo);

        binding.fromHeightSpinner.setEnabled(false);
        binding.toAgeSpinner.setEnabled(false);
        Call<AboutPatnerResponse>  agecall = apiService.getPatnerdetails(jsonObject);
          agecall.enqueue(new Callback<AboutPatnerResponse>() {
              @Override
              public void onResponse(Call<AboutPatnerResponse> call, Response<AboutPatnerResponse> response) {
                  AboutPatnerResponse resp =response.body();
                  if(response.isSuccessful()){
                      ageDatumArrayList  = new ArrayList<>();
                  if(resp!=null && resp.getAgeData()!=null) {
                     ageDatumArrayList.addAll(resp.getAgeData());
                  }

                  agefrom.clear();
                  ageTo.clear();
                    //  ArrayList<Long> ageidfrom = new ArrayList<>();
                      for (AboutPatnerResponse.AgeDatum ageDatum : ageDatumArrayList)
                      {
                          agefrom.add(String.valueOf(ageDatum.getFromTo()));
                          ageTo.add(String.valueOf(ageDatum.getFromTo()));
                      }
                      binding.fromAgeSpinner.setItems(agefrom);
                      binding.fromHeightSpinner.setEnabled(true);
                      binding.toAgeSpinner.setItems(ageTo);
                      binding.toAgeSpinner.setEnabled(true);
                      binding.fromAgeSpinner.setOnSpinnerItemSelectedListener(new OnSpinnerItemSelectedListener<String>() {
                          @Override
                          public void onItemSelected(int position, @Nullable String itemAtpositon, int selectedIndex, String item) {

                              if (ageDatumArrayList != null && selectedIndex >= 0 && selectedIndex < ageDatumArrayList.size()) {

                                  backupageFrom = ageDatumArrayList.get(selectedIndex).getId();

                                  Log.e("Tag", "selected age from ID: " + backupageFrom);

                              }
                          }
                      });

                      binding.toAgeSpinner.setOnSpinnerItemSelectedListener(new OnSpinnerItemSelectedListener<String>() {
                          @Override
                          public void onItemSelected(int position, @Nullable String itemAtpositon, int selectedIndex, String item) {

                              if (ageDatumArrayList != null && selectedIndex >= 0 && selectedIndex < ageDatumArrayList.size()) {

                                  backupageTo = ageDatumArrayList.get(selectedIndex).getId();

                                  Log.e("Tag", "selected age to ID: " + backupageTo);

                              }
                          }
                      });

                  }
              }

              @Override
              public void onFailure(Call<AboutPatnerResponse> call, Throwable t) {
               t.printStackTrace();



              }
          });

         ArrayList<String> job=new ArrayList<>();
           binding.occupationspinner.setItems(job);
           binding.occupationspinner.setEnabled(false);
          Call<AboutPatnerResponse>  occupationcall=apiService.getPatnerdetails(jsonObject);
          occupationcall.enqueue(new Callback<AboutPatnerResponse>() {
          @Override
          public void onResponse(Call<AboutPatnerResponse> call, Response<AboutPatnerResponse> response) {
              AboutPatnerResponse resp =response.body();
              occupationDatumArrayList=new ArrayList<>();
              if(response.isSuccessful()) {
                  if (resp.getOccupationData() != null) {
                      occupationDatumArrayList.addAll(resp.getOccupationData());

                  }

                  job.clear();

                  for(AboutPatnerResponse.OccupationDatum occupationDatum: occupationDatumArrayList){
                      job.add(occupationDatum.getEmployeedIn());

                  }

                  binding.occupationspinner.setItems(job);
                  binding.occupationspinner.setEnabled(true);
                   binding.occupationspinner.setOnSpinnerItemSelectedListener(new OnSpinnerItemSelectedListener<String>() {
                       @Override
                       public void onItemSelected(int i, @Nullable String sel, int i1, String t1) {
                         backupjob = occupationDatumArrayList.get(i1).getId();

                         Log.e("TAG","JOB ID"+backupjob);

                       }
                   });

              }
          }

          @Override
          public void onFailure(Call<AboutPatnerResponse> call, Throwable t) {
               t.printStackTrace();
          }
      });

      /*  binding.occupationspinner.setOnSpinnerItemSelectedListener(new OnSpinnerItemSelectedListener<String>() {
            @Override
            public void onItemSelected(int position, @Nullable String itemAtpositon, int selectedIndex, String item) {
                if(occupationDatumArrayList !=  null && position >=0 && position< occupationDatumArrayList.size()) {
                    AboutPatnerResponse.OccupationDatum selectedjob = occupationDatumArrayList.get(position);
                    if(selectedjob != null) {
                        long  selectedjobid =selectedjob.getId();

                        SharedPrefs.getInstance(getApplicationContext()).saveLong("jobkey",selectedjobid);
                        backupjob = selectedjobid;
                        Log.e("","selected job"+  SharedPrefs.getInstance(getApplicationContext()).getLong("jobkey"));


                    }
                    else {
                        backupjob =-1;

                    }


                }
            }

        });*/
        ArrayList<String> education=new ArrayList<>();
        binding.qualificationspinner.setItems(education);
        binding.qualificationspinner.setEnabled(false);
Call<AboutPatnerResponse> educationcall = apiService.getPatnerdetails(jsonObject);

  educationcall.enqueue(new Callback<AboutPatnerResponse>() {
    @Override
    public void onResponse(Call<AboutPatnerResponse> call, Response<AboutPatnerResponse> response) {
          AboutPatnerResponse respo =response.body();

        heighstEducationDatumArrayList= new ArrayList<>();


          if(response.isSuccessful()){
              if (respo.getHeighstEducationData() != null) {

                  heighstEducationDatumArrayList.addAll(respo.getHeighstEducationData());
              }

                  education.clear();

             // ArrayList<String>  education = new ArrayList<>();
              for (AboutPatnerResponse.HeighstEducationDatum heighstEducationDatum: heighstEducationDatumArrayList) {

                  education.add(heighstEducationDatum.getName());

              }

              boolean isFirstEducationSelection = true;
              binding.qualificationspinner.setItems(education);
              binding.qualificationspinner.setEnabled(true);
              binding.qualificationspinner.setOnSpinnerItemSelectedListener(new OnSpinnerItemSelectedListener<String>() {
                  @Override
                  public void onItemSelected(int i, @Nullable String sel, int i1, String t1) {
                      backupEducation = heighstEducationDatumArrayList.get(i1).getId();

                     Log.e("TAG","education ID="+backupEducation);


                  }
              });

          }
    }

    @Override
    public void onFailure(Call<AboutPatnerResponse> call, Throwable t) {
 t.printStackTrace();
    }
});

  // ===============================Education  spinner============

      /*  binding.qualificationspinner.setEnabled(true);
        binding.qualificationspinner.setItems(education);
        binding.qualificationspinner.setOnSpinnerItemSelectedListener(new OnSpinnerItemSelectedListener<String>() {
            @Override
            public void onItemSelected(int position, @Nullable String s, int i1, String t1) {
                if(heighstEducationDatumArrayList != null && position>=0 && position< heighstEducationDatumArrayList.size()) {
                    // AboutPatnerResponse.HeighstEducationDatum selectedEducation =heighstEducationDatumArrayList.get(position);

                    backupEducation=  heighstEducationDatumArrayList.get(i1).getId();
                    //long  newselectedEducationId = selectedEducation.getId();
                    //  backupEducation = newselectedEducationId;
                    Log.e("Tag","newselectedEducationId"+backupEducation);

                }

            }

        });*/



        ArrayList<String> religion=new ArrayList<>();
        binding.patnerreligionspinner.setItems(religion);
        binding.patnerreligionspinner.setEnabled(false);
        Call<AboutPatnerResponse> religioncall = apiService.getPatnerdetails(jsonObject);
        religioncall.enqueue(new Callback<AboutPatnerResponse>() {
            @Override
            public void onResponse(Call<AboutPatnerResponse> call, Response<AboutPatnerResponse> response) {
                AboutPatnerResponse response1 =response.body();


                if(response.isSuccessful()){
                    religiondatumArrayList=new ArrayList<>();
                    if (response1.getReligiondata() != null) {
                        religiondatumArrayList.addAll(response1.getReligiondata());
                    }

                    religion.clear();

                    for (AboutPatnerResponse.Religiondatum religiondatum: religiondatumArrayList) {
                        religion.add(religiondatum.getReligionName());
                    }


                    binding.patnerreligionspinner.setItems(religion);
                    binding.patnerreligionspinner.setEnabled(true);
                    binding.patnerreligionspinner.setOnSpinnerItemSelectedListener(new OnSpinnerItemSelectedListener<String>() {
                        @Override
                        public void onItemSelected(int i, @Nullable String sel, int i1, String t1) {
                            backupreligion =religiondatumArrayList.get(i1).getId();

                            Log.e("TAG","religion ID="+backupreligion);


                        }
                    });

                }
            }
            @Override
            public void onFailure(Call<AboutPatnerResponse> call, Throwable t) {
                t.printStackTrace();
            }
        });

            ArrayList<String>  caste = new ArrayList<>();
          binding.patnercastespinner.setItems(caste);
          binding.patnercastespinner.setEnabled(false);
        Call<AboutPatnerResponse> castecall = apiService.getPatnerdetails(jsonObject);
        castecall.enqueue(new Callback<AboutPatnerResponse>() {
            @Override
            public void onResponse(Call<AboutPatnerResponse> call, Response<AboutPatnerResponse> response) {
                AboutPatnerResponse response1 =response.body();
                if(response.isSuccessful()){

                    castedatumArrayList=new ArrayList<>();

                    if (response1.getCastedata() != null) {

                        castedatumArrayList.addAll(response1.getCastedata());
                    }
                 caste.clear();
                   //  ArrayList<Long> casteid = new ArrayList<>();
                    for (AboutPatnerResponse.Castedatum castedatum: castedatumArrayList) {

                        caste.add(castedatum.getCasteName());
                       // casteid.add(castedatum.getId());
                    }
                    binding.patnercastespinner.setItems(caste);
                    binding.patnercastespinner.setEnabled(true);



                }
            }
            @Override
            public void onFailure(Call<AboutPatnerResponse> call, Throwable t) {
                t.printStackTrace();
            }
        });


        ArrayList<String> heightfrom = new ArrayList<>();
        ArrayList<String>  heightTo = new ArrayList<>();
        binding.fromHeightSpinner.setItems(heightfrom);
        binding.toHeightSpinner.setItems(heightTo);
        binding.fromHeightSpinner.setEnabled(false);
        binding.toHeightSpinner.setEnabled(false);
        Call<AboutPatnerResponse> heightcallAPI = apiService.getPatnerdetails(jsonObject);
        heightcallAPI.enqueue(new Callback<AboutPatnerResponse>() {
            @Override
            public void onResponse(Call<AboutPatnerResponse> call, Response<AboutPatnerResponse> response) {
                AboutPatnerResponse resp =response.body();
                if(response.isSuccessful()){
                    heightdatumArrayList  = new ArrayList<>();
                    if(resp!=null && resp.getHeightdata()!=null) {
                        heightdatumArrayList.addAll(resp.getHeightdata());
                    }

                    heightfrom.clear();
                    heightTo.clear();
                    //  ArrayList<Long> ageidfrom = new ArrayList<>();
                    for (AboutPatnerResponse.Heightdatum heightdatum : heightdatumArrayList)
                    {
                        heightfrom.add(String.valueOf(heightdatum.getName()));
                        heightTo.add(String.valueOf(heightdatum.getName()));
                    }
                    binding.fromHeightSpinner.setItems(heightfrom);
                    binding.fromHeightSpinner.setEnabled(true);
                    binding.toHeightSpinner.setItems(heightTo);
                    binding.toHeightSpinner.setEnabled(true);
                    binding.fromHeightSpinner.setOnSpinnerItemSelectedListener(new OnSpinnerItemSelectedListener<String>() {
                        @Override
                        public void onItemSelected(int position, @Nullable String itemAtpositon, int selectedIndex, String item) {

                            if ( heightdatumArrayList!= null && selectedIndex >= 0 && selectedIndex < heightdatumArrayList.size()) {
                                   BackupHeightFrom = heightdatumArrayList.get(selectedIndex).getId();
                                   Log.e("Tag", "selected height from ID: " + BackupHeightFrom);

                            }
                        }
                    });



                    binding.toHeightSpinner.setOnSpinnerItemSelectedListener(new OnSpinnerItemSelectedListener<String>() {
                        @Override
                        public void onItemSelected(int position, @Nullable String itemAtpositon, int selectedIndex, String item) {

                            if ( heightdatumArrayList!= null && selectedIndex >= 0 && selectedIndex < heightdatumArrayList.size()) {

                                backupHeightTo = heightdatumArrayList.get(selectedIndex).getId();

                                Log.e("Tag", "selected height to ID: " + backupHeightTo);

                            }
                        }
                    });

                }
            }

            @Override
            public void onFailure(Call<AboutPatnerResponse> call, Throwable t) {
                t.printStackTrace();



            }
        });

        ArrayList<String>  casteofpatner=new ArrayList<>();
         binding.patnercastespinner.setItems(casteofpatner);
         binding.patnercastespinner.setEnabled(false);
        Call<AboutPatnerResponse>  patnercaste=apiService.getPatnerdetails(jsonObject);
        patnercaste.enqueue(new Callback<AboutPatnerResponse>() {
            @Override
            public void onResponse(Call<AboutPatnerResponse> call, Response<AboutPatnerResponse> response) {
                AboutPatnerResponse resp =response.body();
                castedatumArrayList=new ArrayList<>();
                if(response.isSuccessful()) {
                    if (resp.getCastedata() != null) {
                        castedatumArrayList.addAll(resp.getCastedata());
                    }
                    casteofpatner.clear();
                    for(AboutPatnerResponse.Castedatum castedatum: castedatumArrayList){
                        casteofpatner.add(castedatum.getCasteName());
                    }


                    binding.patnercastespinner.setItems(casteofpatner);
                    binding.patnercastespinner.setEnabled(true);
                    binding.patnercastespinner.setOnSpinnerItemSelectedListener(new OnSpinnerItemSelectedListener<String>() {
                        @Override
                        public void onItemSelected(int i, @Nullable String sel, int i1, String t1) {
                            backupcaste = castedatumArrayList.get(i1).getId();

                            Log.e("TAG"," "+backupcaste);



                        }
                    });

                }
            }

            @Override
            public void onFailure(Call<AboutPatnerResponse> call, Throwable t) {
                t.printStackTrace();
            }
        });
        binding.patnercastespinner.setEnabled(true);
        binding.patnercastespinner.setOnSpinnerItemSelectedListener(new OnSpinnerItemSelectedListener<String>() {
            @Override
            public void onItemSelected(int i, @Nullable String sel, int i1, String t1) {
                backupcaste = castedatumArrayList.get(i1).getId();
                Log.e("TAG"," "+backupcaste);




            }
        });


    }
    public void  casteSpinner(int position){
        binding.patnercastespinner.setOnSpinnerItemSelectedListener(new OnSpinnerItemSelectedListener<String>() {
            @Override
            public void onItemSelected(int position, @Nullable String selectedReligionName, int indexsel, String selitem) {
                if(castedatumArrayList != null && position >=0  && position < castedatumArrayList.size())
                {
                    AboutPatnerResponse.Castedatum selectedCaste = castedatumArrayList.get(indexsel);
                    if(selectedCaste != null){
                        backupcaste =  selectedCaste.getId();
                        //   backupcaste =selectedCasteId;
                        Log.d("Tag", "caste ID: " + backupcaste);

                    }
                    else{
                        backupcaste =-1;
                    }
                }
            }

        });
    }

    public void spinnereducation(int position){
        if (heighstEducationDatumArrayList != null && position >= 0 && position < heighstEducationDatumArrayList.size()) {
            AboutPatnerResponse.HeighstEducationDatum selectedEducation = heighstEducationDatumArrayList.get(position);
            if (selectedEducation != null) {
                long selectedEducationId = selectedEducation.getId();
                backupEducation = selectedEducationId;

                // Update the shared preference value whenever a new item is selected
                sharedPrefs.saveLong("edukey", selectedEducationId);

                Log.d("Tag", "Eduaction ID: " + sharedPrefs.getLong("edukey"));
            } else {
                backupEducation = -1;
            }
        }

    }




    public void savePatnerDetails(){
        ApiService service=ApiController.getInstance().getMyApi();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("profile_id", SharedPrefs.getInstance(AboutPatner.this).getLong("profileidaboutkey"));



        if(backupageFrom !=-1 && backupageFrom !=0 ){

        jsonObject.addProperty("age_from", backupageFrom);}
        if(backupageTo !=-1 &&  backupageTo != 0){
        jsonObject.addProperty("age_to",backupageTo);}
        if(BackupHeightFrom !=-1 && BackupHeightFrom !=0 ){
        jsonObject.addProperty("height_from",BackupHeightFrom);}
        if(backupHeightTo !=-1 &&  backupHeightTo !=0){
        jsonObject.addProperty("height_to",backupHeightTo);}
        if( backupEducation !=-1 &&  backupEducation !=0){
        jsonObject.addProperty("partner_highest_education",backupEducation);}
        if( backupjob !=-1 &&  backupjob !=0){
        jsonObject.addProperty("partner_occupation",backupjob);}
        if(  backupreligion !=-1 &&  backupreligion !=0){
        jsonObject.addProperty("partner_religion",backupreligion);}
            if( backupcaste  !=-1 &&  backupcaste !=0){
        jsonObject.addProperty("partner_caste",backupcaste);}

     checkBox = binding.checkbox;
             if (!checkBox.isChecked()) {
                Toast.makeText(this, "Please Accept The Terms And Conditions", Toast.LENGTH_SHORT).show();
                return;
            }
            binding.checkbox.isChecked();

        Call<SaveAboutPatner>  saveAboutPatnerCall = service.saveAboutPatner(jsonObject);

         saveAboutPatnerCall.enqueue(new Callback<SaveAboutPatner>() {
             @Override
             public void onResponse(Call<SaveAboutPatner> call, Response<SaveAboutPatner> response) {


                 if(response.isSuccessful()){
                     SaveAboutPatner obj= response.body();
                     Toast.makeText(AboutPatner.this, "Successfully Registered", Toast.LENGTH_SHORT).show();
                     Log.e("Tag","Response"+obj);
                     Log.e("Tag","Response"+obj.getMessage());


                 }
             }

             @Override
             public void onFailure(Call<SaveAboutPatner> call, Throwable t) {
                 t.printStackTrace();

             }
         });




    }



}
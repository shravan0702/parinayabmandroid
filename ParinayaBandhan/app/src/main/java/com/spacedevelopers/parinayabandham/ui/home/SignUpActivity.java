package com.spacedevelopers.parinayabandham.ui.home;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.spacedevelopers.parinayabandham.Responses.SendOtpResponse;
import com.spacedevelopers.parinayabandham.models.SendOtp;
import com.spacedevelopers.parinayabandham.network.ApiController;
import com.spacedevelopers.parinayabandham.network.ApiService;
import com.spacedevelopers.parinayabandham.utility.CommonUtils;
import com.spacedevelopers.parinayabandham.utility.SharedPrefs;
import com.spacedevelopers.parinayabandhan.R;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class SignUpActivity extends AppCompatActivity {
AppCompatButton sendotpbtn;
ImageView signupscreen;
EditText mobile_et;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        init();
    }


    public void init(){
    sendotpbtn=findViewById(R.id.sendotpbutton);
    signupscreen=findViewById(R.id.signupscreen);
    mobile_et=findViewById(R.id.mobile);
    sendotpbtn.setOnClickListener(new View.OnClickListener() {


     @Override
     public void onClick(View v) {
         String input = mobile_et.getText().toString().trim();

         if (isvalidInput(input)) {
             SharedPrefs sharedPrefs = SharedPrefs.getInstance(SignUpActivity.this);
             sharedPrefs.saveString("mobileKey", input);
               sendOtpAPI(mobile_et.getText().toString());


         } else {
             Toast.makeText(SignUpActivity.this, "Please enter a valid mobile number or email address", Toast.LENGTH_SHORT).show();
         }
     }
 });

    }
    public boolean isvalidInput(String input){
        if (isMobileNumber(input) || isEmail(input)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isMobileNumber(String input) {
        // Mobile number pattern: 10 digits
        String mobileNumberPattern = "\\d{10}";
        return input.matches(mobileNumberPattern);
    }

    private static boolean isEmail(String input) {
        // Email address pattern
        String emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

       public void sendOtpAPI(String input){
        SendOtp request = new SendOtp(input);
        ApiService service = ApiController.getInstance().getMyApi();
CommonUtils.showLoading(SignUpActivity.this, "Please Wait", false);
        Call<SendOtpResponse> call = service.sendOTP(request);

        call.enqueue(new Callback<SendOtpResponse>() {
            @Override
            public void onResponse(Call<SendOtpResponse> call, Response<SendOtpResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    SendOtpResponse obj = response.body();
                    Log.e("Response ", "Api Response " + obj);
                    SharedPrefs sharedPrefs = SharedPrefs.getInstance(SignUpActivity.this);
                    sharedPrefs.saveString("userKey", obj.getUser());
                    Log.e("Tag", "userkey" + obj.getUser());
                    Toast.makeText(SignUpActivity.this, "Otp Sent Successfully", Toast.LENGTH_SHORT).show();
                    //CommonUtils.showLoading(SignUpActivity.this, "Please Wait", false);
                    Intent intent = new Intent(SignUpActivity.this, Otp_Verification_Activity.class);
                    startActivity(intent);


                }
            }

            @Override
            public void onFailure(Call<SendOtpResponse> call, Throwable t) {
                Toast.makeText(SignUpActivity.this, "Api call failure", Toast.LENGTH_SHORT).show();
                Log.e("Tag","Message"+t);
            }
        });



    }

    @Override
    protected void onPause() {
        super.onPause();
      CommonUtils.hideLoading();
    }

}
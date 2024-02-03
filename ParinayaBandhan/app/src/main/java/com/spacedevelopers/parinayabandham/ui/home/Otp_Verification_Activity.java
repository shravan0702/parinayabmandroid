package com.spacedevelopers.parinayabandham.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.spacedevelopers.parinayabandham.HomeActivity;
import com.spacedevelopers.parinayabandham.Responses.OtpResponse;
import com.spacedevelopers.parinayabandham.Responses.ProfileData;
import com.spacedevelopers.parinayabandham.Responses.VerifyOtpResponse;
import com.spacedevelopers.parinayabandham.utility.CommonUtils;
import com.spacedevelopers.parinayabandhan.R;

import androidx.appcompat.widget.AppCompatButton;

import android.os.CountDownTimer;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.goodiebag.pinview.Pinview;
import com.spacedevelopers.parinayabandham.models.VerifyOtpReq;
import com.spacedevelopers.parinayabandham.network.ApiController;
import com.spacedevelopers.parinayabandham.network.ApiService;
import com.spacedevelopers.parinayabandham.utility.SharedPrefs;


import java.lang.reflect.Type;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class Otp_Verification_Activity extends AppCompatActivity {
    AppCompatButton verifybtn;
    ImageView verifyscreen,logo;

    TextView txt_enter_otp_sent_to, tv_resend_otp_timer, txt_re_send,next_to_sendotp;


    Pinview pinview_4_digits;
    boolean istrue=false;
    SharedPrefs sharedPrefs = SharedPrefs.getInstance(Otp_Verification_Activity.this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);
        pinview_4_digits=findViewById(R.id.pinview_4_digits);
        txt_enter_otp_sent_to = findViewById(R.id.txt_enter_otp_sent_to);
        tv_resend_otp_timer = findViewById(R.id.tv_resend_otp_timer);
        txt_re_send = findViewById(R.id.txt_re_send);
        pinview_4_digits = findViewById(R.id.pinview_4_digits);
        next_to_sendotp=findViewById(R.id.next_to_sendotp);
        startTimer(60000, 1000);
        verifyscreen=findViewById(R.id.otpscreen);
        logo=findViewById(R.id.logootp);

        String text = "Re-send";

        SpannableString content = new SpannableString(text);
        content.setSpan(new UnderlineSpan(), 0, text.length(), 0);
        txt_re_send.setText(content);
        String userid = sharedPrefs.getString("userKey");
        Log.e("tag","mobile number"+userid);

        next_to_sendotp.setText(userid);
        verifybtn=findViewById(R.id.otpbutton);


        verifybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verifyOTP(userid, Long.parseLong(pinview_4_digits.getValue()));
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        CommonUtils.hideLoading();
    }

    public void startTimer(final long finish, long tick) {
        txt_re_send.setEnabled(false);
        txt_re_send.setClickable(false);
        new CountDownTimer(finish, tick) {
            public void onTick(long millisUntilFinished) {
                long remainedSecs = millisUntilFinished / 1000;
                String stringTime = String.format("%02d:%02d", (remainedSecs / 60), (remainedSecs % 60));
                tv_resend_otp_timer.setText(stringTime);// manage it according to you
            }
            public void onFinish() {
                tv_resend_otp_timer.setText("00:00");
                txt_re_send.setEnabled(true);
                txt_re_send.setClickable(true);


                txt_re_send.setTextColor(getResources().getColor(R.color.lightpink));
                cancel();
            }
        }.start();
    }
    public void isValid() {
        // Implement your logic to determine if the OTP is valid
        // For example, you might check a status code or a flag in the response
        // or any other criteria based on your API design

        return ;
    }

    public void verifyOTP(String mobilenum,long otp){
         String userid = sharedPrefs.getString("userKey");
        next_to_sendotp.setText(userid);
        VerifyOtpReq request = new VerifyOtpReq(userid,otp);
        ApiService service = ApiController.getInstance().getMyApi();

        Call<OtpResponse> call=service.verifyOtp(request);
        CommonUtils.showLoading(this,"Loading...",false);
        call.enqueue(new Callback<OtpResponse>() {
            public void onResponse(Call<OtpResponse> call, Response<OtpResponse> response) {
                if (response.isSuccessful()) {
                    OtpResponse object = response.body();
                    if (object != null) {
                        JsonElement profileData = object.getProfileData();

                        Toast.makeText(Otp_Verification_Activity.this, "Otp Verified Successfully ", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Otp_Verification_Activity.this, PasswordActivity.class);
                        startActivity(i);
                        // Now you can work with the list of ProfileData objects
                        if (profileData != null) {
                            if (profileData.isJsonArray()) {

                            } else if (profileData.isJsonObject()) {
                                // Handle object case
                                JsonObject profileDataObject = profileData.getAsJsonObject();



                                // Process the object as needed
                            }

                        } else {
                            // Handle the case where profileDataList is null or empty
                            Toast.makeText(Otp_Verification_Activity.this, "UNEXCEPTED TYPE", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        // Handle the case where the response body is null
                        Toast.makeText(Otp_Verification_Activity.this, "profile data is null ", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    // Handle unsuccessful response
                    Toast.makeText(Otp_Verification_Activity.this, "Unsuccessful", Toast.LENGTH_SHORT).show();
                }
            }


            @Override
            public void onFailure(Call<OtpResponse> call, Throwable t) {
                t.printStackTrace();
                Toast.makeText(Otp_Verification_Activity.this, "Network Error ", Toast.LENGTH_SHORT).show();
                Log.e("Tag","Message"+t);

            }
        });

    }

      /*  public void resendOtp(){

        txt_re_send.setEnabled(true);
        txt_re_send.setClickable(true);

        SignUpActivity signUpActivity=new SignUpActivity();
        signUpActivity.sendOtpAPI(sharedPrefs.getString("mobileKey"));

       }*/



}
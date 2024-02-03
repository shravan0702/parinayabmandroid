package com.spacedevelopers.parinayabandham.ui.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.spacedevelopers.parinayabandham.Responses.PasswordResponse;
import com.spacedevelopers.parinayabandham.Responses.VerifyOtpResponse;
import com.spacedevelopers.parinayabandham.about.AboutYouActivity;
import com.spacedevelopers.parinayabandham.models.PasswordReq;
import com.spacedevelopers.parinayabandham.models.VerifyOtpReq;
import com.spacedevelopers.parinayabandham.network.ApiController;
import com.spacedevelopers.parinayabandham.network.ApiService;
import com.spacedevelopers.parinayabandham.utility.SharedPrefs;
import com.spacedevelopers.parinayabandhan.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PasswordActivity extends AppCompatActivity {
 EditText enterpswd,confirmhidepwd;
    ImageView viewpswd,hidepswd;
    AppCompatButton updatepswd;
    SharedPrefs sharedPrefs = SharedPrefs.getInstance(PasswordActivity.this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        enterpswd=findViewById(R.id.enterpassword);
        updatepswd=findViewById(R.id.pswdbutton);
        confirmhidepwd=findViewById(R.id.confirmpassword);
updatepswd.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String password = enterpswd.getText().toString();
        String confirmPassword = confirmhidepwd.getText().toString();
        sharedPrefs = SharedPrefs.getInstance(PasswordActivity.this);

        String userid = sharedPrefs.getString("userKey");
        // Validate if passwords are not empty and match
        if (!TextUtils.isEmpty(password) && password.equals(confirmPassword)) {
            // Call the updatePassword method
            updatePassword(userid, password);
        } else {
            // Show a toast message indicating password mismatch or empty passwords
            Toast.makeText(PasswordActivity.this, "Passwords do not match or are empty", Toast.LENGTH_SHORT).show();
        }
    }

    });


init();
hidePswd();
showpassword();
    }
    public void init(){

        viewpswd=findViewById(R.id.reg_password_show);
        hidepswd=findViewById(R.id.reg_password_hide);

    }

    public void hidePswd() {

        viewpswd.setImageResource(R.drawable.hideeye);
        viewpswd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (enterpswd.getTransformationMethod().equals(HideReturnsTransformationMethod.getInstance())) {
                    //If password is visible then hide it
                    enterpswd.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    //change icon
                    viewpswd.setImageResource(R.drawable.eyeicon);
                } else {
                    enterpswd.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    viewpswd.setImageResource(R.drawable.hideeye);
                }

            }
        });
    }

    public void showpassword(){
        hidepswd = findViewById(R.id.reg_password_hide);
        hidepswd.setImageResource(R.drawable.eyeicon);
        hidepswd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (confirmhidepwd.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
                    //If password is HIDE then SHOW it
                    confirmhidepwd.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    //change icon
                    hidepswd.setImageResource(R.drawable.hideeye);
                } else {
                    confirmhidepwd.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    hidepswd.setImageResource(R.drawable.eyeicon);
                }
            }
        });
    }

   private void updatePassword(String userId, String password) {
  String  userid = sharedPrefs.getString("userKey");
    PasswordReq req= new PasswordReq(userId,password);
    ApiService service = ApiController.getInstance().getMyApi();
    Call<PasswordResponse> call=service.setPassword(req);
    call.enqueue(new Callback<PasswordResponse>() {
        @Override
        public void onResponse(Call<PasswordResponse> call, Response<PasswordResponse> response) {
            if (response.isSuccessful()) {
                PasswordResponse apiResponse = response.body();
                Log.e("","Response"+apiResponse);
                boolean ismobile = true;

                  if( ismobile== apiResponse.isIsMobile()) {

                      boolean  ismobileno = apiResponse.isIsMobile();
                      Toast.makeText(PasswordActivity.this, "Password Updated Successfully", Toast.LENGTH_SHORT).show();


                  }

                boolean  ismobileno = apiResponse.isIsMobile();
                Intent intent = new Intent(PasswordActivity.this, AboutYouActivity.class);
                intent.putExtra("ismobilenokey",ismobileno);

                startActivity(intent);

            } else {

                Toast.makeText(PasswordActivity.this, "Error updating password", Toast.LENGTH_SHORT).show();

            }

        }

        @Override
        public void onFailure(Call<PasswordResponse> call, Throwable t) {

            Toast.makeText(PasswordActivity.this, "Network error", Toast.LENGTH_SHORT).show();


        }
    });
        }
}
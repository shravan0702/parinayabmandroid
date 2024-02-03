package com.spacedevelopers.parinayabandham.network;

import com.google.gson.JsonObject;
import com.spacedevelopers.parinayabandham.Responses.OtpResponse;
import com.spacedevelopers.parinayabandham.Responses.PasswordResponse;
import com.spacedevelopers.parinayabandham.Responses.SaveAboutResponse;
import com.spacedevelopers.parinayabandham.Responses.SendOtpResponse;
import com.spacedevelopers.parinayabandham.Responses.VerifyOtpResponse;
import com.spacedevelopers.parinayabandham.about.AboutSelf;
import com.spacedevelopers.parinayabandham.about.GetDropDownResponse;
import com.spacedevelopers.parinayabandham.models.AboutReq;
import com.spacedevelopers.parinayabandham.models.PasswordReq;
import com.spacedevelopers.parinayabandham.models.SaveAbout;
import com.spacedevelopers.parinayabandham.models.SaveAboutProfile;
import com.spacedevelopers.parinayabandham.models.SendOtp;
import com.spacedevelopers.parinayabandham.models.VerifyOtpReq;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {

    @POST("sendOtp")
    Call<SendOtpResponse> sendOTP(@Body SendOtp sendOtp);

    @POST("otpVerification")
    Call<OtpResponse> verifyOtp(@Body VerifyOtpReq verifyOtpReq);

    @POST("updatePassword")
    Call<PasswordResponse> setPassword(@Body PasswordReq setpswd);

    @POST("getAboutProfileData")
    Call<GetDropDownResponse> getCaste(@Body AboutReq request);

    @POST("getAboutProfileData")
    Call<GetDropDownResponse> getDataDropdown(@Body JsonObject request);

    @POST("getAboutProfileData")
    Call<GetDropDownResponse> getReligiondata(@Body AboutReq request);

    @POST("getAboutProfileData")
    Call<GetDropDownResponse> getProfileFor(@Body AboutReq request);

    @POST("getAboutProfileData")
    Call<GetDropDownResponse> getGender(@Body AboutReq request);

    @POST("saveAboutProfile")
    Call<SaveAboutResponse>  saveAbout(@Body JsonObject saveAbout);



}

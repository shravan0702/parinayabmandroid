package com.parinayabandham.Responses;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class VerifyOtpResponse implements Serializable
{

    @SerializedName("next_step")
    @Expose
    private String nextStep;
    @SerializedName("profile_data")
    @Expose
    private String profileData;
    @SerializedName("status")
    @Expose
    private boolean status;
    @SerializedName("isVerified")
    @Expose
    private long isVerified;
    @SerializedName("user")
    @Expose
    private String user;
    @SerializedName("message")
    @Expose
    private String message;
    private final static long serialVersionUID = -2815773373852522578L;

    /**
     * No args constructor for use in serialization
     *
     */
    public VerifyOtpResponse() {
    }

    /**
     *
     * @param isVerified
     * @param nextStep
     * @param profileData
     * @param message
     * @param user
     * @param status
     */
    public VerifyOtpResponse(String nextStep, String profileData, boolean status, long isVerified, String user, String message) {
        super();
        this.nextStep = nextStep;
        this.profileData = profileData;
        this.status = status;
        this.isVerified = isVerified;
        this.user = user;
        this.message = message;
    }

    public String getNextStep() {
        return nextStep;
    }

    public void setNextStep(String nextStep) {
        this.nextStep = nextStep;
    }

    public String getProfileData() {
        return profileData;
    }

    public void setProfileData(String profileData) {
        this.profileData = profileData;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public long getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(long isVerified) {
        this.isVerified = isVerified;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VerifyOtpResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nextStep");
        sb.append('=');
        sb.append(((this.nextStep == null)?"<null>":this.nextStep));
        sb.append(',');
        sb.append("profileData");
        sb.append('=');
        sb.append(((this.profileData == null)?"<null>":this.profileData));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(this.status);
        sb.append(',');
        sb.append("isVerified");
        sb.append('=');
        sb.append(this.isVerified);
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}



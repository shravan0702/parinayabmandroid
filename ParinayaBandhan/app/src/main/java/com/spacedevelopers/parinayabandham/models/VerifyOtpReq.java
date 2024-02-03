package com.spacedevelopers.parinayabandham.models;


import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VerifyOtpReq implements Serializable
{

    @SerializedName("user")
    @Expose
    private String user;
    @SerializedName("otp")
    @Expose
    private long otp;
    private final static long serialVersionUID = -9070927926382905534L;

    /**
     * No args constructor for use in serialization
     *
     */
    public VerifyOtpReq() {
    }

    /**
     *
     * @param otp
     * @param user
     */
    public VerifyOtpReq(String user, long otp) {
        super();
        this.user = user;
        this.otp = otp;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public long getOtp() {
        return otp;
    }

    public void setOtp(long otp) {
        this.otp = otp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VerifyOtpReq.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("otp");
        sb.append('=');
        sb.append(this.otp);
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }


}
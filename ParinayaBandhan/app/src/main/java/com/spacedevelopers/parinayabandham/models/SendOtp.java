
package com.spacedevelopers.parinayabandham.models;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class SendOtp implements Serializable
{

    @SerializedName("user_name")
    @Expose
    private String userName;
    private final static long serialVersionUID = 2314022700969440612L;

    /**
     * No args constructor for use in serialization
     *
     */
    public SendOtp() {
    }

    /**
     *
     * @param userName
     */
    public SendOtp(String userName) {
        super();
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SendOtp.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("userName");
        sb.append('=');
        sb.append(((this.userName == null)?"<null>":this.userName));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}


package com.spacedevelopers.parinayabandham.models;


import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class AboutReq implements Serializable
{

    @SerializedName("user")
    @Expose
    private String user;
    private final static long serialVersionUID = 3783370982813791255L;

    /**
     * No args constructor for use in serialization
     *
     */
    public AboutReq() {
    }

    /**
     *
     * @param user
     */
    public AboutReq(String user) {
        super();
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AboutReq.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
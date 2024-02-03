
package com.parinayabandham.Responses;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Reqbanners {

    @SerializedName("profile_id")
    @Expose
    private String profileId;

    public Reqbanners(String profileId) {
        this.profileId = profileId;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Reqbanners.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("profileId");
        sb.append('=');
        sb.append(this.profileId);
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

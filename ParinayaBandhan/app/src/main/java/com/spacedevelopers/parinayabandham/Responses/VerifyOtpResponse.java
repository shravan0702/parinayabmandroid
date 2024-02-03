package com.spacedevelopers.parinayabandham.Responses;


import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;

public class VerifyOtpResponse {
    @SerializedName("next_step")
    private String nextStep;

    @SerializedName("profile_data")
    private JsonElement profileDataList;  // Change the data type to List<ProfileData>

    @SerializedName("status")
    private boolean status;

    @SerializedName("isVerified")
    private int isVerified;

    @SerializedName("user")
    private String user;

    @SerializedName("message")
    private String message;

    public static class ProfileData {
        @SerializedName("id")
        private int id;

        @SerializedName("profile_id")
        private String profileId;

        @SerializedName("referal_id")
        private String referalId;

        // Add other fields as needed...

        @SerializedName("has_paid")
        private String hasPaid;

        // Getters and setters for all fields...

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getProfileId() {
            return profileId;
        }

        public void setProfileId(String profileId) {
            this.profileId = profileId;
        }

        public String getReferalId() {
            return referalId;
        }

        public void setReferalId(String referalId) {
            this.referalId = referalId;
        }

        public String getHasPaid() {
            return hasPaid;
        }

        public void setHasPaid(String hasPaid) {
            this.hasPaid = hasPaid;
        }
    }

    // Getters and setters for all fields...

    public String getNextStep() {
        return nextStep;
    }

    public void setNextStep(String nextStep) {
        this.nextStep = nextStep;
    }

    public JsonElement getProfileDataList() {
        return profileDataList;
    }

    public void setProfileDataList(JsonElement profileDataList) {
        this.profileDataList = profileDataList;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(int isVerified) {
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
}

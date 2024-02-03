package com.spacedevelopers.parinayabandham.Responses;
import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SaveAboutResponse implements Serializable
{

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("next_step")
    @Expose
    private String nextStep;
    @SerializedName("status")
    @Expose
    private boolean status;
    @SerializedName("profile_id")
    @Expose
    private long profileId;
    private final static long serialVersionUID = 4694627077763760443L;

    /**
     * No args constructor for use in serialization
     *
     */
    public SaveAboutResponse() {
    }

    /**
     *
     * @param profileId
     * @param nextStep
     * @param message
     * @param status
     */
    public SaveAboutResponse(String message, String nextStep, boolean status, long profileId) {
        super();
        this.message = message;
        this.nextStep = nextStep;
        this.status = status;
        this.profileId = profileId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNextStep() {
        return nextStep;
    }

    public void setNextStep(String nextStep) {
        this.nextStep = nextStep;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public long getProfileId() {
        return profileId;
    }

    public void setProfileId(long profileId) {
        this.profileId = profileId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SaveAboutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("nextStep");
        sb.append('=');
        sb.append(((this.nextStep == null)?"<null>":this.nextStep));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(this.status);
        sb.append(',');
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

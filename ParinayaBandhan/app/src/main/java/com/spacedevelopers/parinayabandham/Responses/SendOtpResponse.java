package com.spacedevelopers.parinayabandham.Responses;



import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class SendOtpResponse implements Serializable
{


    @SerializedName("status")
    @Expose
    private boolean status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("next_step")
    @Expose
    private String nextStep;
    @SerializedName("user")
    @Expose
    private String user;
    private final static long serialVersionUID = -5725464337108847530L;

    /**
     * No args constructor for use in serialization
     *
     */
    public SendOtpResponse() {
    }

    /**
     *
     * @param nextStep
     * @param message
     * @param user
     * @param status
     */
    public SendOtpResponse(boolean status, String message, String nextStep, String user) {
        super();
        this.status = status;
        this.message = message;
        this.nextStep = nextStep;
        this.user = user;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SendOtpResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("status");
        sb.append('=');
        sb.append(this.status);
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("nextStep");
        sb.append('=');
        sb.append(((this.nextStep == null)?"<null>":this.nextStep));
        sb.append(',');
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
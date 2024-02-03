package com.parinayabandham.Responses;


        import java.io.Serializable;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;


public class SaveAboutFamilyResponse implements Serializable
{

    @SerializedName("status")
    @Expose
    private boolean status;
    @SerializedName("message")
    @Expose
    private String message;
    private final static long serialVersionUID = -4819735089521447399L;

    /**
     * No args constructor for use in serialization
     *
     */
    public SaveAboutFamilyResponse() {
    }

    /**
     *
     * @param message
     * @param status
     */
    public SaveAboutFamilyResponse(boolean status, String message) {
        super();
        this.status = status;
        this.message = message;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SaveAboutFamilyResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("status");
        sb.append('=');
        sb.append(this.status);
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


package com.parinayabandham.about;



import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class SaveAboutFamily implements Serializable
{

    @SerializedName("profile_id")
    @Expose
    private long profileId;
    @SerializedName("father_name")
    @Expose
    private String fatherName;
    @SerializedName("mother_name")
    @Expose
    private String motherName;
    @SerializedName("sisters")
    @Expose
    private long sisters;
    @SerializedName("brothers")
    @Expose
    private long brothers;
    @SerializedName("father_occupation")
    @Expose
    private long fatherOccupation;
    @SerializedName("mother_occupation")
    @Expose
    private long motherOccupation;
    private final static long serialVersionUID = 6446779049237395140L;

    /**
     * No args constructor for use in serialization
     *
     */
    public SaveAboutFamily() {
    }

    /**
     *
     * @param fatherName
     * @param fatherOccupation
     * @param brothers
     * @param profileId
     * @param motherName
     * @param sisters
     * @param motherOccupation
     */
    public SaveAboutFamily(long profileId, String fatherName, String motherName, long sisters, long brothers, long fatherOccupation, long motherOccupation) {
        super();
        this.profileId = profileId;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.sisters = sisters;
        this.brothers = brothers;
        this.fatherOccupation = fatherOccupation;
        this.motherOccupation = motherOccupation;
    }

    public long getProfileId() {
        return profileId;
    }

    public void setProfileId(long profileId) {
        this.profileId = profileId;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public long getSisters() {
        return sisters;
    }

    public void setSisters(long sisters) {
        this.sisters = sisters;
    }

    public long getBrothers() {
        return brothers;
    }

    public void setBrothers(long brothers) {
        this.brothers = brothers;
    }

    public long getFatherOccupation() {
        return fatherOccupation;
    }

    public void setFatherOccupation(long fatherOccupation) {
        this.fatherOccupation = fatherOccupation;
    }

    public long getMotherOccupation() {
        return motherOccupation;
    }

    public void setMotherOccupation(long motherOccupation) {
        this.motherOccupation = motherOccupation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SaveAboutFamily.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("profileId");
        sb.append('=');
        sb.append(this.profileId);
        sb.append(',');
        sb.append("fatherName");
        sb.append('=');
        sb.append(((this.fatherName == null)?"<null>":this.fatherName));
        sb.append(',');
        sb.append("motherName");
        sb.append('=');
        sb.append(((this.motherName == null)?"<null>":this.motherName));
        sb.append(',');
        sb.append("sisters");
        sb.append('=');
        sb.append(this.sisters);
        sb.append(',');
        sb.append("brothers");
        sb.append('=');
        sb.append(this.brothers);
        sb.append(',');
        sb.append("fatherOccupation");
        sb.append('=');
        sb.append(this.fatherOccupation);
        sb.append(',');
        sb.append("motherOccupation");
        sb.append('=');
        sb.append(this.motherOccupation);
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
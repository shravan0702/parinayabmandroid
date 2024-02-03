
package com.spacedevelopers.parinayabandham.about;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Castedatum implements Serializable
{

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("religion")
    @Expose
    private long religion;
    @SerializedName("caste_name")
    @Expose
    private String casteName;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("created_by")
    @Expose
    private long createdBy;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("modified_by")
    @Expose
    private long modifiedBy;
    private final static long serialVersionUID = -8998897035615967266L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Castedatum() {
    }

    /**
     * 
     * @param createdAt
     * @param createdBy
     * @param casteName
     * @param modifiedBy
     * @param id
     * @param religion
     * @param status
     * @param updatedAt
     */
    public Castedatum(long id, long religion, String casteName, String status, String createdAt, long createdBy, String updatedAt, long modifiedBy) {
        super();
        this.id = id;
        this.religion = religion;
        this.casteName = casteName;
        this.status = status;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.modifiedBy = modifiedBy;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getReligion() {
        return religion;
    }

    public void setReligion(long religion) {
        this.religion = religion;
    }

    public String getCasteName() {
        return casteName;
    }

    public void setCasteName(String casteName) {
        this.casteName = casteName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Castedatum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(this.id);
        sb.append(',');
        sb.append("religion");
        sb.append('=');
        sb.append(this.religion);
        sb.append(',');
        sb.append("casteName");
        sb.append('=');
        sb.append(((this.casteName == null)?"<null>":this.casteName));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("createdBy");
        sb.append('=');
        sb.append(this.createdBy);
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("modifiedBy");
        sb.append('=');
        sb.append(this.modifiedBy);
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

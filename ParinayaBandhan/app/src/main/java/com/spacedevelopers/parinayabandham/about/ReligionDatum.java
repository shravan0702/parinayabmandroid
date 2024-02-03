
package com.spacedevelopers.parinayabandham.about;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ReligionDatum implements Serializable
{

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("religion_name")
    @Expose
    private String religionName;
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
    private Object updatedAt;
    @SerializedName("modified_by")
    @Expose
    private Object modifiedBy;
    private final static long serialVersionUID = -4211418887023591753L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ReligionDatum() {
    }

    /**
     * 
     * @param createdAt
     * @param createdBy
     * @param modifiedBy
     * @param id
     * @param religionName
     * @param status
     * @param updatedAt
     */
    public ReligionDatum(long id, String religionName, String status, String createdAt, long createdBy, Object updatedAt, Object modifiedBy) {
        super();
        this.id = id;
        this.religionName = religionName;
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

    public String getReligionName() {
        return religionName;
    }

    public void setReligionName(String religionName) {
        this.religionName = religionName;
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

    public Object getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Object updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Object getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Object modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReligionDatum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(this.id);
        sb.append(',');
        sb.append("religionName");
        sb.append('=');
        sb.append(((this.religionName == null)?"<null>":this.religionName));
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
        sb.append(((this.modifiedBy == null)?"<null>":this.modifiedBy));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

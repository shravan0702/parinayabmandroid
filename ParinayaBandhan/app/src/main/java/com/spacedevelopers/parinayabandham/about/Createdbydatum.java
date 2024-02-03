
package com.spacedevelopers.parinayabandham.about;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Createdbydatum implements Serializable
{

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("log_date_created")
    @Expose
    private String logDateCreated;
    @SerializedName("created_by")
    @Expose
    private long createdBy;
    @SerializedName("log_date_modified")
    @Expose
    private String logDateModified;
    @SerializedName("modified_by")
    @Expose
    private long modifiedBy;
    private final static long serialVersionUID = -3689169602696700360L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Createdbydatum() {
    }

    /**
     * 
     * @param logDateModified
     * @param createdBy
     * @param name
     * @param modifiedBy
     * @param id
     * @param logDateCreated
     * @param status
     */
    public Createdbydatum(long id, String name, String status, String logDateCreated, long createdBy, String logDateModified, long modifiedBy) {
        super();
        this.id = id;
        this.name = name;
        this.status = status;
        this.logDateCreated = logDateCreated;
        this.createdBy = createdBy;
        this.logDateModified = logDateModified;
        this.modifiedBy = modifiedBy;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLogDateCreated() {
        return logDateCreated;
    }

    public void setLogDateCreated(String logDateCreated) {
        this.logDateCreated = logDateCreated;
    }

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    public String getLogDateModified() {
        return logDateModified;
    }

    public void setLogDateModified(String logDateModified) {
        this.logDateModified = logDateModified;
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
        sb.append(Createdbydatum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(this.id);
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("logDateCreated");
        sb.append('=');
        sb.append(((this.logDateCreated == null)?"<null>":this.logDateCreated));
        sb.append(',');
        sb.append("createdBy");
        sb.append('=');
        sb.append(this.createdBy);
        sb.append(',');
        sb.append("logDateModified");
        sb.append('=');
        sb.append(((this.logDateModified == null)?"<null>":this.logDateModified));
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

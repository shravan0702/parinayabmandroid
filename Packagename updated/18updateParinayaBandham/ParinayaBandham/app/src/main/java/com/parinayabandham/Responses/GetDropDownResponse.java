
package com.parinayabandham.Responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;


public class GetDropDownResponse implements Serializable {

    @SerializedName("is_mobile")
    @Expose
    private boolean isMobile;
    @SerializedName("mobile")
    @Expose
    private String mobile;
    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("createdbydata")
    @Expose
    private List<Createdbydatum> createdbydata;

    @SerializedName("user")
    @Expose
    private String user;
    @SerializedName("castedata")
    @Expose
    private List<Castedatum> castedata;
    @SerializedName("gender_data")
    @Expose
    private List<String> genderData;
    @SerializedName("religion_data")
    @Expose
    private List<ReligionDatum> religionData;
    @SerializedName("status")
    @Expose
    private boolean status;
    private final static long serialVersionUID = 220925020985453566L;

    /**
     * No args constructor for use in serialization
     */
    public GetDropDownResponse() {
    }

    /**
     * @param castedata
     * @param genderData
     * @param religionData
     * @param createdbydata
     * @param user
     * @param status
     */
    public GetDropDownResponse(List<Createdbydatum> createdbydata, String user, List<Castedatum> castedata, List<String> genderData, List<ReligionDatum> religionData, boolean status) {
        super();
        this.createdbydata = createdbydata;
        this.user = user;
        this.castedata = castedata;
        this.genderData = genderData;
        this.religionData = religionData;
        this.status = status;
    }

    public GetDropDownResponse(boolean isMobile, String mobile, String email, List<Createdbydatum> createdbydata, String user, List<Castedatum> castedata, List<String> genderData, List<ReligionDatum> religionData, boolean status) {
        this.isMobile = isMobile;
        this.mobile = mobile;
        this.email = email;
        this.createdbydata = createdbydata;
        this.user = user;
        this.castedata = castedata;
        this.genderData = genderData;
        this.religionData = religionData;
        this.status = status;
    }

    public boolean isIsMobile() {
        return isMobile;
    }

    public void setIsMobile(boolean isMobile) {
        this.isMobile = isMobile;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Createdbydatum> getCreatedbydata() {
        return createdbydata;
    }

    public void setCreatedbydata(List<Createdbydatum> createdbydata) {
        this.createdbydata = createdbydata;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public List<Castedatum> getCastedata() {
        return castedata;
    }

    public void setCastedata(List<Castedatum> castedata) {
        this.castedata = castedata;
    }

    public List<String> getGenderData() {
        return genderData;
    }

    public void setGenderData(List<String> genderData) {
        this.genderData = genderData;
    }

    public List<ReligionDatum> getReligionData() {
        return religionData;
    }

    public void setReligionData(List<ReligionDatum> religionData) {
        this.religionData = religionData;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

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
            sb.append(com.parinayabandham.about.Createdbydatum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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



    public class Castedatum {
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
            sb.append(com.parinayabandham.about.Castedatum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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


    public  class ReligionDatum{
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
            sb.append(com.parinayabandham.about.ReligionDatum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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

}
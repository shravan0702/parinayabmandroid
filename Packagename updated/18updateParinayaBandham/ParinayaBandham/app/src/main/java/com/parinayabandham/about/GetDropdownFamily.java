package com.parinayabandham.about;
import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetDropdownFamily {


    @SerializedName("father_occupation")
    @Expose
    private List<FatherOccupation> fatherOccupation;
    @SerializedName("mother_occupation")
    @Expose
    private List<MotherOccupation> motherOccupation;
    @SerializedName("profile_id")
    @Expose
    private long profileId;
    @SerializedName("status")
    @Expose
    private boolean status;
    private final static long serialVersionUID = 5645228697754844817L;

    /**
     * No args constructor for use in serialization
     */
    public GetDropdownFamily() {
    }

    /**
     * @param fatherOccupation
     * @param profileId
     * @param motherOccupation
     * @param status
     */
    public GetDropdownFamily(List<FatherOccupation> fatherOccupation, List<MotherOccupation> motherOccupation, long profileId, boolean status) {
        super();
        this.fatherOccupation = fatherOccupation;
        this.motherOccupation = motherOccupation;
        this.profileId = profileId;
        this.status = status;
    }

    public List<FatherOccupation> getFatherOccupation() {
        return fatherOccupation;
    }

    public void setFatherOccupation(List<FatherOccupation> fatherOccupation) {
        this.fatherOccupation = fatherOccupation;
    }

    public List<MotherOccupation> getMotherOccupation() {
        return motherOccupation;
    }

    public void setMotherOccupation(List<MotherOccupation> motherOccupation) {
        this.motherOccupation = motherOccupation;
    }

    public long getProfileId() {
        return profileId;
    }

    public void setProfileId(long profileId) {
        this.profileId = profileId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GetDropdownFamily.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fatherOccupation");
        sb.append('=');
        sb.append(((this.fatherOccupation == null) ? "<null>" : this.fatherOccupation));
        sb.append(',');
        sb.append("motherOccupation");
        sb.append('=');
        sb.append(((this.motherOccupation == null) ? "<null>" : this.motherOccupation));
        sb.append(',');
        sb.append("profileId");
        sb.append('=');
        sb.append(this.profileId);
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(this.status);
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }


    public class FatherOccupation implements Serializable {
        @SerializedName("id")
        @Expose
        private long id;
        @SerializedName("employeed_in")
        @Expose
        private String employeedIn;
        @SerializedName("parent_in")
        @Expose
        private long parentIn;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("created_at")
        @Expose
        private Object createdAt;
        @SerializedName("created_by")
        @Expose
        private Object createdBy;
        @SerializedName("updated_at")
        @Expose
        private Object updatedAt;
        @SerializedName("modified_by")
        @Expose
        private Object modifiedBy;
        private final static long serialVersionUID = 9041623233781787102L;

        /**
         * No args constructor for use in serialization
         */
        public FatherOccupation() {
        }

        /**
         * @param employeedIn
         * @param createdAt
         * @param parentIn
         * @param createdBy
         * @param modifiedBy
         * @param id
         * @param status
         * @param updatedAt
         */
        public FatherOccupation(long id, String employeedIn, long parentIn, String status, Object createdAt, Object createdBy, Object updatedAt, Object modifiedBy) {
            super();
            this.id = id;
            this.employeedIn = employeedIn;
            this.parentIn = parentIn;
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

        public String getEmployeedIn() {
            return employeedIn;
        }

        public void setEmployeedIn(String employeedIn) {
            this.employeedIn = employeedIn;
        }

        public long getParentIn() {
            return parentIn;
        }

        public void setParentIn(long parentIn) {
            this.parentIn = parentIn;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Object getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(Object createdAt) {
            this.createdAt = createdAt;
        }

        public Object getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(Object createdBy) {
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
            sb.append(FatherOccupation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("id");
            sb.append('=');
            sb.append(this.id);
            sb.append(',');
            sb.append("employeedIn");
            sb.append('=');
            sb.append(((this.employeedIn == null) ? "<null>" : this.employeedIn));
            sb.append(',');
            sb.append("parentIn");
            sb.append('=');
            sb.append(this.parentIn);
            sb.append(',');
            sb.append("status");
            sb.append('=');
            sb.append(((this.status == null) ? "<null>" : this.status));
            sb.append(',');
            sb.append("createdAt");
            sb.append('=');
            sb.append(((this.createdAt == null) ? "<null>" : this.createdAt));
            sb.append(',');
            sb.append("createdBy");
            sb.append('=');
            sb.append(((this.createdBy == null) ? "<null>" : this.createdBy));
            sb.append(',');
            sb.append("updatedAt");
            sb.append('=');
            sb.append(((this.updatedAt == null) ? "<null>" : this.updatedAt));
            sb.append(',');
            sb.append("modifiedBy");
            sb.append('=');
            sb.append(((this.modifiedBy == null) ? "<null>" : this.modifiedBy));
            sb.append(',');
            if (sb.charAt((sb.length() - 1)) == ',') {
                sb.setCharAt((sb.length() - 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

    }


    public class MotherOccupation implements Serializable {

        @SerializedName("id")
        @Expose
        private long id;
        @SerializedName("employeed_in")
        @Expose
        private String employeedIn;
        @SerializedName("parent_in")
        @Expose
        private long parentIn;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("created_at")
        @Expose
        private Object createdAt;
        @SerializedName("created_by")
        @Expose
        private Object createdBy;
        @SerializedName("updated_at")
        @Expose
        private Object updatedAt;
        @SerializedName("modified_by")
        @Expose
        private Object modifiedBy;
        private final static long serialVersionUID = -298006673022411637L;

        /**
         * No args constructor for use in serialization
         */
        public MotherOccupation() {
        }

        /**
         * @param employeedIn
         * @param createdAt
         * @param parentIn
         * @param createdBy
         * @param modifiedBy
         * @param id
         * @param status
         * @param updatedAt
         */
        public MotherOccupation(long id, String employeedIn, long parentIn, String status, Object createdAt, Object createdBy, Object updatedAt, Object modifiedBy) {
            super();
            this.id = id;
            this.employeedIn = employeedIn;
            this.parentIn = parentIn;
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

        public String getEmployeedIn() {
            return employeedIn;
        }

        public void setEmployeedIn(String employeedIn) {
            this.employeedIn = employeedIn;
        }

        public long getParentIn() {
            return parentIn;
        }

        public void setParentIn(long parentIn) {
            this.parentIn = parentIn;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Object getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(Object createdAt) {
            this.createdAt = createdAt;
        }

        public Object getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(Object createdBy) {
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
            sb.append(MotherOccupation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("id");
            sb.append('=');
            sb.append(this.id);
            sb.append(',');
            sb.append("employeedIn");
            sb.append('=');
            sb.append(((this.employeedIn == null) ? "<null>" : this.employeedIn));
            sb.append(',');
            sb.append("parentIn");
            sb.append('=');
            sb.append(this.parentIn);
            sb.append(',');
            sb.append("status");
            sb.append('=');
            sb.append(((this.status == null) ? "<null>" : this.status));
            sb.append(',');
            sb.append("createdAt");
            sb.append('=');
            sb.append(((this.createdAt == null) ? "<null>" : this.createdAt));
            sb.append(',');
            sb.append("createdBy");
            sb.append('=');
            sb.append(((this.createdBy == null) ? "<null>" : this.createdBy));
            sb.append(',');
            sb.append("updatedAt");
            sb.append('=');
            sb.append(((this.updatedAt == null) ? "<null>" : this.updatedAt));
            sb.append(',');
            sb.append("modifiedBy");
            sb.append('=');
            sb.append(((this.modifiedBy == null) ? "<null>" : this.modifiedBy));
            sb.append(',');
            if (sb.charAt((sb.length() - 1)) == ',') {
                sb.setCharAt((sb.length() - 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

    }

}


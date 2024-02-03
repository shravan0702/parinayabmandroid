
package com.parinayabandham.Responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Responsebanners {

    @SerializedName("user_details")
    @Expose
    private UserDetails userDetails;
    @SerializedName("matching_profiles_count")
    @Expose
    private String matchingProfilesCount;
    @SerializedName("profile_intrest_recived_count")
    @Expose
    private String profileIntrestRecivedCount;
    @SerializedName("profile_intreste_sent_count")
    @Expose
    private String profileIntresteSentCount;
    @SerializedName("profile_id")
    @Expose
    private long profileId;
    @SerializedName("banners_Data")
    @Expose
    private List<BannersDatum> bannersData;
    @SerializedName("status")
    @Expose
    private boolean status;
    @SerializedName("base_url")
    @Expose
    private String baseUrl;

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public String getMatchingProfilesCount() {
        return matchingProfilesCount;
    }

    public void setMatchingProfilesCount(String matchingProfilesCount) {
        this.matchingProfilesCount = matchingProfilesCount;
    }

    public String getProfileIntrestRecivedCount() {
        return profileIntrestRecivedCount;
    }

    public void setProfileIntrestRecivedCount(String profileIntrestRecivedCount) {
        this.profileIntrestRecivedCount = profileIntrestRecivedCount;
    }

    public String getProfileIntresteSentCount() {
        return profileIntresteSentCount;
    }

    public void setProfileIntresteSentCount(String profileIntresteSentCount) {
        this.profileIntresteSentCount = profileIntresteSentCount;
    }

    public long getProfileId() {
        return profileId;
    }

    public void setProfileId(long profileId) {
        this.profileId = profileId;
    }

    public List<BannersDatum> getBannersData() {
        return bannersData;
    }

    public void setBannersData(List<BannersDatum> bannersData) {
        this.bannersData = bannersData;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }






    /////////////////////////////////////////////////////////////////////////////////BannersDatum
    public class BannersDatum {

        @SerializedName("id")
        @Expose
        private long id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("attachment")
        @Expose
        private String attachment;
        @SerializedName("logged_date")
        @Expose
        private String loggedDate;
        @SerializedName("created_by")
        @Expose
        private Object createdBy;
        @SerializedName("updated_date")
        @Expose
        private Object updatedDate;
        @SerializedName("updated_by")
        @Expose
        private Object updatedBy;
        @SerializedName("status")
        @Expose
        private String status;

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

        public String getAttachment() {
            return attachment;
        }

        public void setAttachment(String attachment) {
            this.attachment = attachment;
        }

        public String getLoggedDate() {
            return loggedDate;
        }

        public void setLoggedDate(String loggedDate) {
            this.loggedDate = loggedDate;
        }

        public Object getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(Object createdBy) {
            this.createdBy = createdBy;
        }

        public Object getUpdatedDate() {
            return updatedDate;
        }

        public void setUpdatedDate(Object updatedDate) {
            this.updatedDate = updatedDate;
        }

        public Object getUpdatedBy() {
            return updatedBy;
        }

        public void setUpdatedBy(Object updatedBy) {
            this.updatedBy = updatedBy;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

    }

////////////////////////////////////////////////////////////////////////////UserDetails
    public class UserDetails {

        @SerializedName("id")
        @Expose
        private long id;
        @SerializedName("profile_id")
        @Expose
        private String profileId;
        @SerializedName("referal_id")
        @Expose
        private Object referalId;
        @SerializedName("customer_id_type")
        @Expose
        private String customerIdType;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("phone")
        @Expose
        private String phone;
        @SerializedName("phone_country_code")
        @Expose
        private Object phoneCountryCode;
        @SerializedName("alternative_phone_country_code")
        @Expose
        private Object alternativePhoneCountryCode;
        @SerializedName("watsapp_phone")
        @Expose
        private String watsappPhone;
        @SerializedName("alternative_phone")
        @Expose
        private String alternativePhone;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("alternative_email")
        @Expose
        private String alternativeEmail;
        @SerializedName("password")
        @Expose
        private String password;
        @SerializedName("pc")
        @Expose
        private long pc;
        @SerializedName("gender")
        @Expose
        private String gender;
        @SerializedName("department_id")
        @Expose
        private long departmentId;
        @SerializedName("profileimages")
        @Expose
        private String profileimages;
        @SerializedName("images")
        @Expose
        private String images;
        @SerializedName("profile_vedio")
        @Expose
        private String profileVedio;
        @SerializedName("photo_small_url")
        @Expose
        private Object photoSmallUrl;
        @SerializedName("profile_alert_sms")
        @Expose
        private String profileAlertSms;
        @SerializedName("profile_alert_email")
        @Expose
        private String profileAlertEmail;
        @SerializedName("family_address")
        @Expose
        private Object familyAddress;
        @SerializedName("registration_type")
        @Expose
        private String registrationType;
        @SerializedName("customer_service_category")
        @Expose
        private String customerServiceCategory;
        @SerializedName("service_status")
        @Expose
        private String serviceStatus;
        @SerializedName("profilestatus")
        @Expose
        private String profilestatus;
        @SerializedName("profileapprovals")
        @Expose
        private long profileapprovals;
        @SerializedName("is_image_approved")
        @Expose
        private String isImageApproved;
        @SerializedName("delete_image_approved")
        @Expose
        private String deleteImageApproved;
        @SerializedName("profilecategory")
        @Expose
        private long profilecategory;
        @SerializedName("used_status")
        @Expose
        private String usedStatus;
        @SerializedName("log_date_created")
        @Expose
        private String logDateCreated;
        @SerializedName("created_by")
        @Expose
        private Object createdBy;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("priority")
        @Expose
        private Object priority;
        @SerializedName("log_date_modified")
        @Expose
        private Object logDateModified;
        @SerializedName("modified_by")
        @Expose
        private Object modifiedBy;
        @SerializedName("access_token")
        @Expose
        private Object accessToken;
        @SerializedName("remember_token")
        @Expose
        private String rememberToken;
        @SerializedName("regester_steps")
        @Expose
        private String regesterSteps;
        @SerializedName("mobile_regester_steps")
        @Expose
        private Object mobileRegesterSteps;
        @SerializedName("is_verified")
        @Expose
        private String isVerified;
        @SerializedName("is_deleted")
        @Expose
        private String isDeleted;
        @SerializedName("last_login_ip")
        @Expose
        private Object lastLoginIp;
        @SerializedName("last_login_date_time")
        @Expose
        private String lastLoginDateTime;
        @SerializedName("is_assigned")
        @Expose
        private String isAssigned;
        @SerializedName("has_paid")
        @Expose
        private String hasPaid;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getProfileId() {
            return profileId;
        }

        public void setProfileId(String profileId) {
            this.profileId = profileId;
        }

        public Object getReferalId() {
            return referalId;
        }

        public void setReferalId(Object referalId) {
            this.referalId = referalId;
        }

        public String getCustomerIdType() {
            return customerIdType;
        }

        public void setCustomerIdType(String customerIdType) {
            this.customerIdType = customerIdType;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public Object getPhoneCountryCode() {
            return phoneCountryCode;
        }

        public void setPhoneCountryCode(Object phoneCountryCode) {
            this.phoneCountryCode = phoneCountryCode;
        }

        public Object getAlternativePhoneCountryCode() {
            return alternativePhoneCountryCode;
        }

        public void setAlternativePhoneCountryCode(Object alternativePhoneCountryCode) {
            this.alternativePhoneCountryCode = alternativePhoneCountryCode;
        }

        public String getWatsappPhone() {
            return watsappPhone;
        }

        public void setWatsappPhone(String watsappPhone) {
            this.watsappPhone = watsappPhone;
        }

        public String getAlternativePhone() {
            return alternativePhone;
        }

        public void setAlternativePhone(String alternativePhone) {
            this.alternativePhone = alternativePhone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getAlternativeEmail() {
            return alternativeEmail;
        }

        public void setAlternativeEmail(String alternativeEmail) {
            this.alternativeEmail = alternativeEmail;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public long getPc() {
            return pc;
        }

        public void setPc(long pc) {
            this.pc = pc;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public long getDepartmentId() {
            return departmentId;
        }

        public void setDepartmentId(long departmentId) {
            this.departmentId = departmentId;
        }

        public String getProfileimages() {
            return profileimages;
        }

        public void setProfileimages(String profileimages) {
            this.profileimages = profileimages;
        }

        public String getImages() {
            return images;
        }

        public void setImages(String images) {
            this.images = images;
        }

        public String getProfileVedio() {
            return profileVedio;
        }

        public void setProfileVedio(String profileVedio) {
            this.profileVedio = profileVedio;
        }

        public Object getPhotoSmallUrl() {
            return photoSmallUrl;
        }

        public void setPhotoSmallUrl(Object photoSmallUrl) {
            this.photoSmallUrl = photoSmallUrl;
        }

        public String getProfileAlertSms() {
            return profileAlertSms;
        }

        public void setProfileAlertSms(String profileAlertSms) {
            this.profileAlertSms = profileAlertSms;
        }

        public String getProfileAlertEmail() {
            return profileAlertEmail;
        }

        public void setProfileAlertEmail(String profileAlertEmail) {
            this.profileAlertEmail = profileAlertEmail;
        }

        public Object getFamilyAddress() {
            return familyAddress;
        }

        public void setFamilyAddress(Object familyAddress) {
            this.familyAddress = familyAddress;
        }

        public String getRegistrationType() {
            return registrationType;
        }

        public void setRegistrationType(String registrationType) {
            this.registrationType = registrationType;
        }

        public String getCustomerServiceCategory() {
            return customerServiceCategory;
        }

        public void setCustomerServiceCategory(String customerServiceCategory) {
            this.customerServiceCategory = customerServiceCategory;
        }

        public String getServiceStatus() {
            return serviceStatus;
        }

        public void setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
        }

        public String getProfilestatus() {
            return profilestatus;
        }

        public void setProfilestatus(String profilestatus) {
            this.profilestatus = profilestatus;
        }

        public long getProfileapprovals() {
            return profileapprovals;
        }

        public void setProfileapprovals(long profileapprovals) {
            this.profileapprovals = profileapprovals;
        }

        public String getIsImageApproved() {
            return isImageApproved;
        }

        public void setIsImageApproved(String isImageApproved) {
            this.isImageApproved = isImageApproved;
        }

        public String getDeleteImageApproved() {
            return deleteImageApproved;
        }

        public void setDeleteImageApproved(String deleteImageApproved) {
            this.deleteImageApproved = deleteImageApproved;
        }

        public long getProfilecategory() {
            return profilecategory;
        }

        public void setProfilecategory(long profilecategory) {
            this.profilecategory = profilecategory;
        }

        public String getUsedStatus() {
            return usedStatus;
        }

        public void setUsedStatus(String usedStatus) {
            this.usedStatus = usedStatus;
        }

        public String getLogDateCreated() {
            return logDateCreated;
        }

        public void setLogDateCreated(String logDateCreated) {
            this.logDateCreated = logDateCreated;
        }

        public Object getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(Object createdBy) {
            this.createdBy = createdBy;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Object getPriority() {
            return priority;
        }

        public void setPriority(Object priority) {
            this.priority = priority;
        }

        public Object getLogDateModified() {
            return logDateModified;
        }

        public void setLogDateModified(Object logDateModified) {
            this.logDateModified = logDateModified;
        }

        public Object getModifiedBy() {
            return modifiedBy;
        }

        public void setModifiedBy(Object modifiedBy) {
            this.modifiedBy = modifiedBy;
        }

        public Object getAccessToken() {
            return accessToken;
        }

        public void setAccessToken(Object accessToken) {
            this.accessToken = accessToken;
        }

        public String getRememberToken() {
            return rememberToken;
        }

        public void setRememberToken(String rememberToken) {
            this.rememberToken = rememberToken;
        }

        public String getRegesterSteps() {
            return regesterSteps;
        }

        public void setRegesterSteps(String regesterSteps) {
            this.regesterSteps = regesterSteps;
        }

        public Object getMobileRegesterSteps() {
            return mobileRegesterSteps;
        }

        public void setMobileRegesterSteps(Object mobileRegesterSteps) {
            this.mobileRegesterSteps = mobileRegesterSteps;
        }

        public String getIsVerified() {
            return isVerified;
        }

        public void setIsVerified(String isVerified) {
            this.isVerified = isVerified;
        }

        public String getIsDeleted() {
            return isDeleted;
        }

        public void setIsDeleted(String isDeleted) {
            this.isDeleted = isDeleted;
        }

        public Object getLastLoginIp() {
            return lastLoginIp;
        }

        public void setLastLoginIp(Object lastLoginIp) {
            this.lastLoginIp = lastLoginIp;
        }

        public String getLastLoginDateTime() {
            return lastLoginDateTime;
        }

        public void setLastLoginDateTime(String lastLoginDateTime) {
            this.lastLoginDateTime = lastLoginDateTime;
        }

        public String getIsAssigned() {
            return isAssigned;
        }

        public void setIsAssigned(String isAssigned) {
            this.isAssigned = isAssigned;
        }

        public String getHasPaid() {
            return hasPaid;
        }

        public void setHasPaid(String hasPaid) {
            this.hasPaid = hasPaid;
        }


    }

}





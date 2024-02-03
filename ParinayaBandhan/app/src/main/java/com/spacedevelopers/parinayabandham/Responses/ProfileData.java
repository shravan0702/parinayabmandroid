
package com.spacedevelopers.parinayabandham.Responses;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ProfileData implements Serializable
{

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
    private final static long serialVersionUID = 8998079091539769797L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProfileData() {
    }

    /**
     * 
     * @param logDateModified
     * @param profilecategory
     * @param lastLoginDateTime
     * @param gender
     * @param isVerified
     * @param departmentId
     * @param usedStatus
     * @param hasPaid
     * @param lastLoginIp
     * @param familyAddress
     * @param regesterSteps
     * @param password
     * @param isDeleted
     * @param watsappPhone
     * @param profilestatus
     * @param serviceStatus
     * @param modifiedBy
     * @param id
     * @param customerIdType
     * @param email
     * @param profileAlertSms
     * @param images
     * @param alternativePhoneCountryCode
     * @param alternativePhone
     * @param customerServiceCategory
     * @param priority
     * @param accessToken
     * @param profileAlertEmail
     * @param pc
     * @param isAssigned
     * @param phoneCountryCode
     * @param photoSmallUrl
     * @param deleteImageApproved
     * @param phone
     * @param registrationType
     * @param createdBy
     * @param profileId
     * @param mobileRegesterSteps
     * @param name
     * @param profileapprovals
     * @param profileimages
     * @param logDateCreated
     * @param isImageApproved
     * @param rememberToken
     * @param referalId
     * @param alternativeEmail
     * @param profileVedio
     * @param status
     */
    public ProfileData(long id, String profileId, Object referalId, String customerIdType, String name, String phone, Object phoneCountryCode, Object alternativePhoneCountryCode, String watsappPhone, String alternativePhone, String email, String alternativeEmail, String password, long pc, String gender, long departmentId, String profileimages, String images, String profileVedio, Object photoSmallUrl, String profileAlertSms, String profileAlertEmail, Object familyAddress, String registrationType, String customerServiceCategory, String serviceStatus, String profilestatus, long profileapprovals, String isImageApproved, String deleteImageApproved, long profilecategory, String usedStatus, String logDateCreated, Object createdBy, String status, Object priority, Object logDateModified, Object modifiedBy, Object accessToken, String rememberToken, String regesterSteps, Object mobileRegesterSteps, String isVerified, String isDeleted, Object lastLoginIp, String lastLoginDateTime, String isAssigned, String hasPaid) {
        super();
        this.id = id;
        this.profileId = profileId;
        this.referalId = referalId;
        this.customerIdType = customerIdType;
        this.name = name;
        this.phone = phone;
        this.phoneCountryCode = phoneCountryCode;
        this.alternativePhoneCountryCode = alternativePhoneCountryCode;
        this.watsappPhone = watsappPhone;
        this.alternativePhone = alternativePhone;
        this.email = email;
        this.alternativeEmail = alternativeEmail;
        this.password = password;
        this.pc = pc;
        this.gender = gender;
        this.departmentId = departmentId;
        this.profileimages = profileimages;
        this.images = images;
        this.profileVedio = profileVedio;
        this.photoSmallUrl = photoSmallUrl;
        this.profileAlertSms = profileAlertSms;
        this.profileAlertEmail = profileAlertEmail;
        this.familyAddress = familyAddress;
        this.registrationType = registrationType;
        this.customerServiceCategory = customerServiceCategory;
        this.serviceStatus = serviceStatus;
        this.profilestatus = profilestatus;
        this.profileapprovals = profileapprovals;
        this.isImageApproved = isImageApproved;
        this.deleteImageApproved = deleteImageApproved;
        this.profilecategory = profilecategory;
        this.usedStatus = usedStatus;
        this.logDateCreated = logDateCreated;
        this.createdBy = createdBy;
        this.status = status;
        this.priority = priority;
        this.logDateModified = logDateModified;
        this.modifiedBy = modifiedBy;
        this.accessToken = accessToken;
        this.rememberToken = rememberToken;
        this.regesterSteps = regesterSteps;
        this.mobileRegesterSteps = mobileRegesterSteps;
        this.isVerified = isVerified;
        this.isDeleted = isDeleted;
        this.lastLoginIp = lastLoginIp;
        this.lastLoginDateTime = lastLoginDateTime;
        this.isAssigned = isAssigned;
        this.hasPaid = hasPaid;
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProfileData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(this.id);
        sb.append(',');
        sb.append("profileId");
        sb.append('=');
        sb.append(((this.profileId == null)?"<null>":this.profileId));
        sb.append(',');
        sb.append("referalId");
        sb.append('=');
        sb.append(((this.referalId == null)?"<null>":this.referalId));
        sb.append(',');
        sb.append("customerIdType");
        sb.append('=');
        sb.append(((this.customerIdType == null)?"<null>":this.customerIdType));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("phone");
        sb.append('=');
        sb.append(((this.phone == null)?"<null>":this.phone));
        sb.append(',');
        sb.append("phoneCountryCode");
        sb.append('=');
        sb.append(((this.phoneCountryCode == null)?"<null>":this.phoneCountryCode));
        sb.append(',');
        sb.append("alternativePhoneCountryCode");
        sb.append('=');
        sb.append(((this.alternativePhoneCountryCode == null)?"<null>":this.alternativePhoneCountryCode));
        sb.append(',');
        sb.append("watsappPhone");
        sb.append('=');
        sb.append(((this.watsappPhone == null)?"<null>":this.watsappPhone));
        sb.append(',');
        sb.append("alternativePhone");
        sb.append('=');
        sb.append(((this.alternativePhone == null)?"<null>":this.alternativePhone));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("alternativeEmail");
        sb.append('=');
        sb.append(((this.alternativeEmail == null)?"<null>":this.alternativeEmail));
        sb.append(',');
        sb.append("password");
        sb.append('=');
        sb.append(((this.password == null)?"<null>":this.password));
        sb.append(',');
        sb.append("pc");
        sb.append('=');
        sb.append(this.pc);
        sb.append(',');
        sb.append("gender");
        sb.append('=');
        sb.append(((this.gender == null)?"<null>":this.gender));
        sb.append(',');
        sb.append("departmentId");
        sb.append('=');
        sb.append(this.departmentId);
        sb.append(',');
        sb.append("profileimages");
        sb.append('=');
        sb.append(((this.profileimages == null)?"<null>":this.profileimages));
        sb.append(',');
        sb.append("images");
        sb.append('=');
        sb.append(((this.images == null)?"<null>":this.images));
        sb.append(',');
        sb.append("profileVedio");
        sb.append('=');
        sb.append(((this.profileVedio == null)?"<null>":this.profileVedio));
        sb.append(',');
        sb.append("photoSmallUrl");
        sb.append('=');
        sb.append(((this.photoSmallUrl == null)?"<null>":this.photoSmallUrl));
        sb.append(',');
        sb.append("profileAlertSms");
        sb.append('=');
        sb.append(((this.profileAlertSms == null)?"<null>":this.profileAlertSms));
        sb.append(',');
        sb.append("profileAlertEmail");
        sb.append('=');
        sb.append(((this.profileAlertEmail == null)?"<null>":this.profileAlertEmail));
        sb.append(',');
        sb.append("familyAddress");
        sb.append('=');
        sb.append(((this.familyAddress == null)?"<null>":this.familyAddress));
        sb.append(',');
        sb.append("registrationType");
        sb.append('=');
        sb.append(((this.registrationType == null)?"<null>":this.registrationType));
        sb.append(',');
        sb.append("customerServiceCategory");
        sb.append('=');
        sb.append(((this.customerServiceCategory == null)?"<null>":this.customerServiceCategory));
        sb.append(',');
        sb.append("serviceStatus");
        sb.append('=');
        sb.append(((this.serviceStatus == null)?"<null>":this.serviceStatus));
        sb.append(',');
        sb.append("profilestatus");
        sb.append('=');
        sb.append(((this.profilestatus == null)?"<null>":this.profilestatus));
        sb.append(',');
        sb.append("profileapprovals");
        sb.append('=');
        sb.append(this.profileapprovals);
        sb.append(',');
        sb.append("isImageApproved");
        sb.append('=');
        sb.append(((this.isImageApproved == null)?"<null>":this.isImageApproved));
        sb.append(',');
        sb.append("deleteImageApproved");
        sb.append('=');
        sb.append(((this.deleteImageApproved == null)?"<null>":this.deleteImageApproved));
        sb.append(',');
        sb.append("profilecategory");
        sb.append('=');
        sb.append(this.profilecategory);
        sb.append(',');
        sb.append("usedStatus");
        sb.append('=');
        sb.append(((this.usedStatus == null)?"<null>":this.usedStatus));
        sb.append(',');
        sb.append("logDateCreated");
        sb.append('=');
        sb.append(((this.logDateCreated == null)?"<null>":this.logDateCreated));
        sb.append(',');
        sb.append("createdBy");
        sb.append('=');
        sb.append(((this.createdBy == null)?"<null>":this.createdBy));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("logDateModified");
        sb.append('=');
        sb.append(((this.logDateModified == null)?"<null>":this.logDateModified));
        sb.append(',');
        sb.append("modifiedBy");
        sb.append('=');
        sb.append(((this.modifiedBy == null)?"<null>":this.modifiedBy));
        sb.append(',');
        sb.append("accessToken");
        sb.append('=');
        sb.append(((this.accessToken == null)?"<null>":this.accessToken));
        sb.append(',');
        sb.append("rememberToken");
        sb.append('=');
        sb.append(((this.rememberToken == null)?"<null>":this.rememberToken));
        sb.append(',');
        sb.append("regesterSteps");
        sb.append('=');
        sb.append(((this.regesterSteps == null)?"<null>":this.regesterSteps));
        sb.append(',');
        sb.append("mobileRegesterSteps");
        sb.append('=');
        sb.append(((this.mobileRegesterSteps == null)?"<null>":this.mobileRegesterSteps));
        sb.append(',');
        sb.append("isVerified");
        sb.append('=');
        sb.append(((this.isVerified == null)?"<null>":this.isVerified));
        sb.append(',');
        sb.append("isDeleted");
        sb.append('=');
        sb.append(((this.isDeleted == null)?"<null>":this.isDeleted));
        sb.append(',');
        sb.append("lastLoginIp");
        sb.append('=');
        sb.append(((this.lastLoginIp == null)?"<null>":this.lastLoginIp));
        sb.append(',');
        sb.append("lastLoginDateTime");
        sb.append('=');
        sb.append(((this.lastLoginDateTime == null)?"<null>":this.lastLoginDateTime));
        sb.append(',');
        sb.append("isAssigned");
        sb.append('=');
        sb.append(((this.isAssigned == null)?"<null>":this.isAssigned));
        sb.append(',');
        sb.append("hasPaid");
        sb.append('=');
        sb.append(((this.hasPaid == null)?"<null>":this.hasPaid));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

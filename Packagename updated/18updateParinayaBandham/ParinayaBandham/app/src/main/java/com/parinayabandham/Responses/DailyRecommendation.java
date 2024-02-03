
package com.parinayabandham.Responses;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class DailyRecommendation {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("matching_profiles")
    @Expose
    private List<MatchingProfile> matchingProfiles;
    @SerializedName("profile_id")
    @Expose
    private long profileId;
    @SerializedName("status")
    @Expose
    private boolean status;
    @SerializedName("base_url")
    @Expose
    private String baseUrl;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<MatchingProfile> getMatchingProfiles() {
        return matchingProfiles;
    }

    public void setMatchingProfiles(List<MatchingProfile> matchingProfiles) {
        this.matchingProfiles = matchingProfiles;
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

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }


    public class MatchingProfile {


        @SerializedName("created_date")
        @Expose
        private String createdDate;
        @SerializedName("updated_date")
        @Expose
        private String updatedDate;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("profile_id")
        @Expose
        private String profileId;
        @SerializedName("profileimages")
        @Expose
        private String profileimages;
        @SerializedName("dname")
        @Expose
        private String dname;
        @SerializedName("did")
        @Expose
        private long did;
        @SerializedName("religion_name")
        @Expose
        private String religionName;
        @SerializedName("bs")
        @Expose
        private String bs;
        @SerializedName("marital_status")
        @Expose
        private String maritalStatus;
        @SerializedName("customersid")
        @Expose
        private long customersid;
        @SerializedName("state_name")
        @Expose
        private String stateName;
        @SerializedName("country_name")
        @Expose
        private String countryName;
        @SerializedName("caste_name")
        @Expose
        private String casteName;
        @SerializedName("subcaste_name")
        @Expose
        private String subcasteName;
        @SerializedName("uname")
        @Expose
        private String uname;
        @SerializedName("createdbyid")
        @Expose
        private long createdbyid;
        @SerializedName("createdbyname")
        @Expose
        private String createdbyname;
        @SerializedName("cid")
        @Expose
        private long cid;
        @SerializedName("city_name")
        @Expose
        private String cityName;
        @SerializedName("language_name")
        @Expose
        private String languageName;
        @SerializedName("fathername")
        @Expose
        private String fathername;
        @SerializedName("dob")
        @Expose
        private String dob;
        @SerializedName("id")
        @Expose
        private long id;
        @SerializedName("customer_id")
        @Expose
        private long customerId;
        @SerializedName("ms")
        @Expose
        private long ms;
        @SerializedName("have_children")
        @Expose
        private String haveChildren;
        @SerializedName("martialStatus_add_info")
        @Expose
        private String martialStatusAddInfo;
        @SerializedName("gender")
        @Expose
        private String gender;
        @SerializedName("religion")
        @Expose
        private long religion;
        @SerializedName("caste")
        @Expose
        private long caste;
        @SerializedName("sub_caste")
        @Expose
        private long subCaste;
        @SerializedName("sampraday")
        @Expose
        private Object sampraday;
        @SerializedName("language_id")
        @Expose
        private long languageId;
        @SerializedName("height_id")
        @Expose
        private long heightId;
        @SerializedName("date_of_birth")
        @Expose
        private String dateOfBirth;
        @SerializedName("diet")
        @Expose
        private String diet;
        @SerializedName("hobbies")
        @Expose
        private Object hobbies;
        @SerializedName("gotra")
        @Expose
        private Object gotra;
        @SerializedName("maternal_gotra")
        @Expose
        private Object maternalGotra;
        @SerializedName("future_plans")
        @Expose
        private Object futurePlans;
        @SerializedName("ps_country")
        @Expose
        private long psCountry;
        @SerializedName("ps_state")
        @Expose
        private long psState;
        @SerializedName("ps_district")
        @Expose
        private Object psDistrict;
        @SerializedName("ps_city")
        @Expose
        private long psCity;
        @SerializedName("annual_income")
        @Expose
        private String annualIncome;
        @SerializedName("location")
        @Expose
        private Object location;
        @SerializedName("photo_url")
        @Expose
        private String photoUrl;
        @SerializedName("attachment2")
        @Expose
        private String attachment2;
        @SerializedName("brought_by")
        @Expose
        private long broughtBy;
        @SerializedName("comments")
        @Expose
        private String comments;
        @SerializedName("instruction_to_customer")
        @Expose
        private Object instructionToCustomer;
        @SerializedName("video_file")
        @Expose
        private Object videoFile;
        @SerializedName("refference_by")
        @Expose
        private long refferenceBy;
        @SerializedName("refference_by_other")
        @Expose
        private Object refferenceByOther;
        @SerializedName("native")
        @Expose
        private String _native;
        @SerializedName("address")
        @Expose
        private String address;
        @SerializedName("business_address")
        @Expose
        private String businessAddress;
        @SerializedName("suitable_time_to_call")
        @Expose
        private Object suitableTimeToCall;
        @SerializedName("family_address")
        @Expose
        private Object familyAddress;
        @SerializedName("personalized_details")
        @Expose
        private String personalizedDetails;
        @SerializedName("registration_type")
        @Expose
        private Object registrationType;
        @SerializedName("customer_service_category")
        @Expose
        private String customerServiceCategory;
        @SerializedName("anniversary_date")
        @Expose
        private Object anniversaryDate;
        @SerializedName("service_status")
        @Expose
        private Object serviceStatus;
        @SerializedName("instruction_customer")
        @Expose
        private Object instructionCustomer;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("priority")
        @Expose
        private Object priority;
        @SerializedName("note")
        @Expose
        private String note;
        @SerializedName("employee_notes")
        @Expose
        private Object employeeNotes;
        @SerializedName("other_comunite")
        @Expose
        private String otherComunite;
        @SerializedName("hororscope_details")
        @Expose
        private String hororscopeDetails;
        @SerializedName("educational_qualifications")
        @Expose
        private String educationalQualifications;
        @SerializedName("family_details")
        @Expose
        private String familyDetails;
        @SerializedName("maternal_details")
        @Expose
        private String maternalDetails;
        @SerializedName("paternal_details")
        @Expose
        private String paternalDetails;
        @SerializedName("facebook")
        @Expose
        private String facebook;
        @SerializedName("instagram")
        @Expose
        private String instagram;
        @SerializedName("linkedin")
        @Expose
        private String linkedin;
        @SerializedName("twitter")
        @Expose
        private String twitter;
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
        @SerializedName("log_date_created")
        @Expose
        private String logDateCreated;
        @SerializedName("created_by")
        @Expose
        private Object createdBy;
        @SerializedName("log_date_modified")
        @Expose
        private String logDateModified;
        @SerializedName("modified_by")
        @Expose
        private Object modifiedBy;
        @SerializedName("access_token")
        @Expose
        private Object accessToken;
        @SerializedName("regester_steps")
        @Expose
        private long regesterSteps;
        @SerializedName("is_verified")
        @Expose
        private String isVerified;
        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("education")
        @Expose
        private String education;

        @SerializedName("age")
        @Expose
        private String age;


        public String getCreatedDate() {
            return createdDate;
        }

        public void setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
        }

        public String getUpdatedDate() {
            return updatedDate;
        }

        public void setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getProfileId() {
            return profileId;
        }

        public void setProfileId(String profileId) {
            this.profileId = profileId;
        }

        public String getprofileimages() {
            return profileimages;
        }

        public void setprofileimages(String profileimages) {
            this.profileimages = profileimages;
        }



        public String getDname() {
            return dname;
        }

        public void setDname(String dname) {
            this.dname = dname;
        }

        public long getDid() {
            return did;
        }

        public void setDid(long did) {
            this.did = did;
        }

        public String getReligionName() {
            return religionName;
        }

        public void setReligionName(String religionName) {
            this.religionName = religionName;
        }

        public String getBs() {
            return bs;
        }

        public void setBs(String bs) {
            this.bs = bs;
        }

        public String getMaritalStatus() {
            return maritalStatus;
        }

        public void setMaritalStatus(String maritalStatus) {
            this.maritalStatus = maritalStatus;
        }

        public long getCustomersid() {
            return customersid;
        }

        public void setCustomersid(long customersid) {
            this.customersid = customersid;
        }

        public String getStateName() {
            return stateName;
        }

        public void setStateName(String stateName) {
            this.stateName = stateName;
        }

        public String getCountryName() {
            return countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }

        public String getCasteName() {
            return casteName;
        }

        public void setCasteName(String casteName) {
            this.casteName = casteName;
        }

        public String getSubcasteName() {
            return subcasteName;
        }

        public void setSubcasteName(String subcasteName) {
            this.subcasteName = subcasteName;
        }

        public String getUname() {
            return uname;
        }

        public void setUname(String uname) {
            this.uname = uname;
        }

        public long getCreatedbyid() {
            return createdbyid;
        }

        public void setCreatedbyid(long createdbyid) {
            this.createdbyid = createdbyid;
        }

        public String getCreatedbyname() {
            return createdbyname;
        }

        public void setCreatedbyname(String createdbyname) {
            this.createdbyname = createdbyname;
        }

        public long getCid() {
            return cid;
        }

        public void setCid(long cid) {
            this.cid = cid;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getLanguageName() {
            return languageName;
        }

        public void setLanguageName(String languageName) {
            this.languageName = languageName;
        }

        public String getFathername() {
            return fathername;
        }

        public void setFathername(String fathername) {
            this.fathername = fathername;
        }

        public String getDob() {
            return dob;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public long getCustomerId() {
            return customerId;
        }

        public void setCustomerId(long customerId) {
            this.customerId = customerId;
        }

        public long getMs() {
            return ms;
        }

        public void setMs(long ms) {
            this.ms = ms;
        }

        public String getHaveChildren() {
            return haveChildren;
        }

        public void setHaveChildren(String haveChildren) {
            this.haveChildren = haveChildren;
        }

        public String getMartialStatusAddInfo() {
            return martialStatusAddInfo;
        }

        public void setMartialStatusAddInfo(String martialStatusAddInfo) {
            this.martialStatusAddInfo = martialStatusAddInfo;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public long getReligion() {
            return religion;
        }

        public void setReligion(long religion) {
            this.religion = religion;
        }

        public long getCaste() {
            return caste;
        }

        public void setCaste(long caste) {
            this.caste = caste;
        }

        public long getSubCaste() {
            return subCaste;
        }

        public void setSubCaste(long subCaste) {
            this.subCaste = subCaste;
        }

        public Object getSampraday() {
            return sampraday;
        }

        public void setSampraday(Object sampraday) {
            this.sampraday = sampraday;
        }

        public long getLanguageId() {
            return languageId;
        }

        public void setLanguageId(long languageId) {
            this.languageId = languageId;
        }

        public long getHeightId() {
            return heightId;
        }

        public void setHeightId(long heightId) {
            this.heightId = heightId;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public String getDiet() {
            return diet;
        }

        public void setDiet(String diet) {
            this.diet = diet;
        }

        public Object getHobbies() {
            return hobbies;
        }

        public void setHobbies(Object hobbies) {
            this.hobbies = hobbies;
        }

        public Object getGotra() {
            return gotra;
        }

        public void setGotra(Object gotra) {
            this.gotra = gotra;
        }

        public Object getMaternalGotra() {
            return maternalGotra;
        }

        public void setMaternalGotra(Object maternalGotra) {
            this.maternalGotra = maternalGotra;
        }

        public Object getFuturePlans() {
            return futurePlans;
        }

        public void setFuturePlans(Object futurePlans) {
            this.futurePlans = futurePlans;
        }

        public long getPsCountry() {
            return psCountry;
        }

        public void setPsCountry(long psCountry) {
            this.psCountry = psCountry;
        }

        public long getPsState() {
            return psState;
        }

        public void setPsState(long psState) {
            this.psState = psState;
        }

        public Object getPsDistrict() {
            return psDistrict;
        }

        public void setPsDistrict(Object psDistrict) {
            this.psDistrict = psDistrict;
        }

        public long getPsCity() {
            return psCity;
        }

        public void setPsCity(long psCity) {
            this.psCity = psCity;
        }

        public Object getAnnualIncome() {
            return annualIncome;
        }

        public void setAnnualIncome(String annualIncome) {
            this.annualIncome = annualIncome;
        }

        public Object getLocation() {
            return location;
        }

        public void setLocation(Object location) {
            this.location = location;
        }

        public Object getPhotoUrl() {
            return photoUrl;
        }

        public void setPhotoUrl(String photoUrl) {
            this.photoUrl = photoUrl;
        }

        public Object getAttachment2() {
            return attachment2;
        }

        public void setAttachment2(String attachment2) {
            this.attachment2 = attachment2;
        }

        public long getBroughtBy() {
            return broughtBy;
        }

        public void setBroughtBy(long broughtBy) {
            this.broughtBy = broughtBy;
        }

        public String getComments() {
            return comments;
        }

        public void setComments(String comments) {
            this.comments = comments;
        }

        public Object getInstructionToCustomer() {
            return instructionToCustomer;
        }

        public void setInstructionToCustomer(Object instructionToCustomer) {
            this.instructionToCustomer = instructionToCustomer;
        }

        public Object getVideoFile() {
            return videoFile;
        }

        public void setVideoFile(Object videoFile) {
            this.videoFile = videoFile;
        }

        public long getRefferenceBy() {
            return refferenceBy;
        }

        public void setRefferenceBy(long refferenceBy) {
            this.refferenceBy = refferenceBy;
        }

        public Object getRefferenceByOther() {
            return refferenceByOther;
        }

        public void setRefferenceByOther(Object refferenceByOther) {
            this.refferenceByOther = refferenceByOther;
        }

        public String getNative() {
            return _native;
        }

        public void setNative(String _native) {
            this._native = _native;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getBusinessAddress() {
            return businessAddress;
        }

        public void setBusinessAddress(String businessAddress) {
            this.businessAddress = businessAddress;
        }

        public Object getSuitableTimeToCall() {
            return suitableTimeToCall;
        }

        public void setSuitableTimeToCall(Object suitableTimeToCall) {
            this.suitableTimeToCall = suitableTimeToCall;
        }

        public Object getFamilyAddress() {
            return familyAddress;
        }

        public void setFamilyAddress(Object familyAddress) {
            this.familyAddress = familyAddress;
        }

        public String getPersonalizedDetails() {
            return personalizedDetails;
        }

        public void setPersonalizedDetails(String personalizedDetails) {
            this.personalizedDetails = personalizedDetails;
        }

        public Object getRegistrationType() {
            return registrationType;
        }

        public void setRegistrationType(Object registrationType) {
            this.registrationType = registrationType;
        }

        public String getCustomerServiceCategory() {
            return customerServiceCategory;
        }

        public void setCustomerServiceCategory(String customerServiceCategory) {
            this.customerServiceCategory = customerServiceCategory;
        }

        public Object getAnniversaryDate() {
            return anniversaryDate;
        }

        public void setAnniversaryDate(Object anniversaryDate) {
            this.anniversaryDate = anniversaryDate;
        }

        public Object getServiceStatus() {
            return serviceStatus;
        }

        public void setServiceStatus(Object serviceStatus) {
            this.serviceStatus = serviceStatus;
        }

        public Object getInstructionCustomer() {
            return instructionCustomer;
        }

        public void setInstructionCustomer(Object instructionCustomer) {
            this.instructionCustomer = instructionCustomer;
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

        public String getNote() {
            return note;
        }

        public void setNote(String note) {
            this.note = note;
        }

        public Object getEmployeeNotes() {
            return employeeNotes;
        }

        public void setEmployeeNotes(Object employeeNotes) {
            this.employeeNotes = employeeNotes;
        }

        public String getOtherComunite() {
            return otherComunite;
        }

        public void setOtherComunite(String otherComunite) {
            this.otherComunite = otherComunite;
        }

        public String getHororscopeDetails() {
            return hororscopeDetails;
        }

        public void setHororscopeDetails(String hororscopeDetails) {
            this.hororscopeDetails = hororscopeDetails;
        }

        public String getEducationalQualifications() {
            return educationalQualifications;
        }

        public void setEducationalQualifications(String educationalQualifications) {
            this.educationalQualifications = educationalQualifications;
        }

        public String getFamilyDetails() {
            return familyDetails;
        }

        public void setFamilyDetails(String familyDetails) {
            this.familyDetails = familyDetails;
        }

        public String getMaternalDetails() {
            return maternalDetails;
        }

        public void setMaternalDetails(String maternalDetails) {
            this.maternalDetails = maternalDetails;
        }

        public String getPaternalDetails() {
            return paternalDetails;
        }

        public void setPaternalDetails(String paternalDetails) {
            this.paternalDetails = paternalDetails;
        }

        public String getFacebook() {
            return facebook;
        }

        public void setFacebook(String facebook) {
            this.facebook = facebook;
        }

        public String getInstagram() {
            return instagram;
        }

        public void setInstagram(String instagram) {
            this.instagram = instagram;
        }

        public String getLinkedin() {
            return linkedin;
        }

        public void setLinkedin(String linkedin) {
            this.linkedin = linkedin;
        }

        public String getTwitter() {
            return twitter;
        }

        public void setTwitter(String twitter) {
            this.twitter = twitter;
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

        public String getLogDateModified() {
            return logDateModified;
        }

        public void setLogDateModified(String logDateModified) {
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

        public long getRegesterSteps() {
            return regesterSteps;
        }

        public void setRegesterSteps(long regesterSteps) {
            this.regesterSteps = regesterSteps;
        }

        public String getIsVerified() {
            return isVerified;
        }

        public void setIsVerified(String isVerified) {
            this.isVerified = isVerified;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getEducation() {
            return education;
        }

        public void setEducation(String education) {
            this.education = education;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }


    }

}

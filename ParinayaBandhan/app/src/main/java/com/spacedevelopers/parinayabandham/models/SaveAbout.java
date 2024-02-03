package com.spacedevelopers.parinayabandham.models;




import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class SaveAbout implements Serializable
{

    @SerializedName("user")
    @Expose
    private String user;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("pc")
    @Expose
    private int pc;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("date_of_birth")
    @Expose
    private String dateOfBirth;
    @SerializedName("religion")
    @Expose
    private int religion;
    @SerializedName("caste")
    @Expose
    private int caste;
    private final static long serialVersionUID = 960968792588656093L;

    /**
     * No args constructor for use in serialization
     *
     */
    public SaveAbout() {
    }




    /**
     *
     * @param pc
     * @param gender

     * @param caste
     * @param name
     * @param dateOfBirth
     * @param user
     * @param religion
     */
    // Constructor with phone parameter
    public SaveAbout(String user, String gender, int pc, String phone, String email, String name, String dateOfBirth, int religion, int caste) {
        this.user = user;
        this.gender = gender;
        this.pc = pc;
        this.phone=phone;
        this.email = email;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.religion = religion;
        this.caste = caste;


    }

    // Constructor with email parameter

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getReligion() {
        return religion;
    }

    public void setReligion(int religion) {
        this.religion = religion;
    }

    public int getCaste() {
        return caste;
    }

    public void setCaste(int caste) {
        this.caste = caste;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SaveAbout.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("gender");
        sb.append('=');
        sb.append(((this.gender == null)?"<null>":this.gender));
        sb.append(',');
        sb.append("pc");
        sb.append('=');
        sb.append(this.pc);
        sb.append(',');

        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("dateOfBirth");
        sb.append('=');
        sb.append(((this.dateOfBirth == null)?"<null>":this.dateOfBirth));
        sb.append(',');
        sb.append("religion");
        sb.append('=');
        sb.append(this.religion);
        sb.append(',');
        sb.append("caste");
        sb.append('=');

        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
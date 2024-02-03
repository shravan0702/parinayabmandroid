package com.spacedevelopers.parinayabandham.models;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class PasswordReq {

        @SerializedName("user")
        @Expose
        private String user;
        @SerializedName("password")
        @Expose
        private String password;

//    // No-argument constructor
//    public Request() {
//    }

        // Constructor with parameters
        public PasswordReq(String user, String password) {
            this.user = user;
            this.password = password;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(PasswordReq.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("user");
            sb.append('=');
            sb.append(((this.user == null)?"<null>":this.user));
            sb.append(',');
            sb.append("password");
            sb.append('=');
            sb.append(((this.password == null)?"<null>":this.password));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

    }





package com.spacedevelopers.parinayabandham.Responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class PasswordResponse {

        @SerializedName("is_mobile")
        @Expose
        private boolean isMobile;
        @SerializedName("mobile")
        @Expose
        private String mobile;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("user")
        @Expose
        private String user;
        @SerializedName("status")
        @Expose
        private boolean status;
        @SerializedName("message")
        @Expose
        private String message;
        @SerializedName("next_step")
        @Expose
        private String nextStep;
        private final static long serialVersionUID = 1111608753637080235L;



        public PasswordResponse(boolean isMobile, String mobile, String email, String user, boolean status, String message, String nextStep) {
            super();
            this.isMobile = isMobile;
            this.mobile = mobile;
            this.email = email;
            this.user = user;
            this.status = status;
            this.message = message;
            this.nextStep = nextStep;
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

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getNextStep() {
            return nextStep;
        }

        public void setNextStep(String nextStep) {
            this.nextStep = nextStep;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(PasswordResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("isMobile");
            sb.append('=');
            sb.append(this.isMobile);
            sb.append(',');
            sb.append("mobile");
            sb.append('=');
            sb.append(((this.mobile == null)?"<null>":this.mobile));
            sb.append(',');
            sb.append("email");
            sb.append('=');
            sb.append(((this.email == null)?"<null>":this.email));
            sb.append(',');
            sb.append("user");
            sb.append('=');
            sb.append(((this.user == null)?"<null>":this.user));
            sb.append(',');
            sb.append("status");
            sb.append('=');
            sb.append(this.status);
            sb.append(',');
            sb.append("message");
            sb.append('=');
            sb.append(((this.message == null)?"<null>":this.message));
            sb.append(',');
            sb.append("nextStep");
            sb.append('=');
            sb.append(((this.nextStep == null)?"<null>":this.nextStep));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }


}

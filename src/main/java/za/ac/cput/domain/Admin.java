/*
      AdminFactoryTest.java
      Author : Snothando Mangaliso (241177049)
      Date : 16 March 2025
 */
package za.ac.cput.domain;

import za.ac.cput.util.Helper;

public class Admin {
    private String adminId;
    private String adminName;
    private String email;
    private String adminRole;
    private String password;

    // ============== BUILDER CONSTRUCTOR ======
    private Admin(Builder builder){
        this.adminId = builder.adminId;
        this.adminName = builder.adminName;
        this.email = builder.email;
        this.adminRole = builder.adminRole;
        this.password = builder.password;
    }
    // ============== GETTERS ==================
    public String getAdminId() {
        return adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getEmail() {
        return email;
    }

    public String getAdminRole() {
        return adminRole;
    }

    public String getPassword() {
        return password;
    }

// ============== FORMAT ===================


    @Override
    public String toString() {
        return "Admin{" +
                "adminId='" + adminId + '\'' +
                ", adminName='" + adminName + '\'' +
                ", email='" + email + '\'' +
                ", adminRole='" + adminRole + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    // ============== BUILDER CLASS ============
    public static class Builder {

        private String adminId;
        private String adminName;
        private String email;
        private String adminRole;
        private String password;

// ============== SETTERS ==================

        public Builder setAdminId(String adminId) {
            this.adminId = adminId;
            return this;
        }

        public Builder setAdminName(String adminName) {
            this.adminName = adminName;
            return this;
        }

        public Builder setAdminRole(String adminRole) {
            this.adminRole = adminRole;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder copy(Admin admin){
            this.adminId = admin.adminId;
            this.adminName = admin.adminName;
            this.email = admin.email;
            this.adminRole = admin.adminRole;
            this.password = admin.password;
            return this;
        }


        public Admin build() {
            if(password == null || !Helper.isPasswordValid(password)){
                throw  new IllegalArgumentException("Password should be atleast 8 characters");
            }
            if(email == null || !Helper.isValidEmail(email)){
                throw new IllegalArgumentException("Email invalid, try again.");
            }
                return new Admin(this);

        }
    }
}

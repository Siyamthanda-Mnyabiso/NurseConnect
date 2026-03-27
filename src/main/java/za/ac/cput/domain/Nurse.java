/*
      NurseRepositoryTest.java
      Author : Siyamthanda Philemon Mnyabiso (221799028)
     
 */

package za.ac.cput.domain;

public class Nurse {
    private String nurseID;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private String qualification;
    private String specialization;
    private String yearsOfExperience;
    private boolean availabilityStatus;
    private String licenseNumber;


    private Nurse() {
    }

    private Nurse(Builder builder){
        this.nurseID = builder.nurseID;
        this.firstName = builder.firstName;
        this.email = builder.email;
        this.lastName = builder.lastName;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
        this.qualification = builder.qualification;
        this.specialization= builder.specialization;
        this.yearsOfExperience = builder.yearsOfExperience;
        this.availabilityStatus = builder.availabilityStatus;
        this.licenseNumber = builder.licenseNumber;
    }

    public String getNurseID() {
        return nurseID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getQualification() {
        return qualification;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getYearsOfExperience() {
        return yearsOfExperience;
    }

    public boolean isAvailabilityStatus() {
        return availabilityStatus;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "nurseID='" + nurseID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", qualification='" + qualification + '\'' +
                ", specialization='" + specialization + '\'' +
                ", yearsOfExperience='" + yearsOfExperience + '\'' +
                ", availabilityStatus=" + availabilityStatus +
                ", licenseNumber='" + licenseNumber + '\'' +
                '}';
    }

    public static class Builder {
        private String nurseID;
        private String firstName;
        private String lastName;
        private String email;
        private String phoneNumber;
        private String address;
        private String qualification;
        private String specialization;
        private String yearsOfExperience;
        private boolean availabilityStatus;
        private String licenseNumber;

        public Builder setNurseID(String nurseID) {
            this.nurseID = nurseID;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setQualification(String qualification) {
            this.qualification = qualification;
            return this;
        }

        public Builder setSpecialization(String specialization) {
            this.specialization = specialization;
            return this;
        }

        public Builder setYearsOfExperience(String yearsOfExperience) {
            this.yearsOfExperience = yearsOfExperience;
            return this;
        }

        public Builder setAvailabilityStatus(boolean availabilityStatus) {
            this.availabilityStatus = availabilityStatus;
            return this;
        }

        public Builder setLicenseNumber(String licenseNumber) {
            this.licenseNumber = licenseNumber;
            return this;
        }

        public Nurse.Builder copy (Nurse nurse){
            this.nurseID = nurse.nurseID;
            this.firstName = nurse.firstName;
            this.email = nurse.email;
            this.lastName = nurse.lastName;
            this.phoneNumber = nurse.phoneNumber;
            this.address = nurse.address;
            this.qualification = nurse.qualification;
            this.specialization= nurse.specialization;
            this.yearsOfExperience = nurse.yearsOfExperience;
            this.availabilityStatus = nurse.availabilityStatus;
            this.licenseNumber = nurse.licenseNumber;
            return this;
        }

        public Nurse build (){ return new Nurse(this); }
    }
}

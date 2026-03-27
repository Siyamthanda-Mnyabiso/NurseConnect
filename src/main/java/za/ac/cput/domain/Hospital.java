// Hospital.java
// Author : Luxolo Matshikiza (219098751)
// Date : 26 March 2026


package za.ac.cput.domain;

import java.util.Objects;

public class Hospital{
    private String hospitalId;
    private String hospitalName;
    private String address;
    private String city;
    private String contactPerson;
    private String contactEmail;
    private String contactPhone;
    private String facilityType;

// default constructor
    private Hospital(){

    }

    //arg constructor
    private Hospital(Builder builder){
        this.hospitalId=builder.hospitalId;
        this.hospitalName=builder.hospitalName;
        this.address=builder.address;
        this.city=builder.city;
        this.contactPerson=builder.contactPerson;
        this.contactEmail=builder.contactEmail;
        this.contactPhone=builder.contactPhone;
        this.facilityType=builder.facilityType;

    }



    // getters (immutable)


    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public String getFacilityType() {
        return facilityType;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Hospital hospital = (Hospital) o;
        return Objects.equals(hospitalId, hospital.hospitalId); // comparing hospitals Id if same or not
    }
    @Override
    public int hashCode() {
        return Objects.hash(hospitalId);  // giving uniqueness of hospital ID
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "address='" + address + '\'' +
                ", hospitalId='" + hospitalId + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", city='" + city + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                ", contactPhone=" + contactPhone +
                ", facilityType='" + facilityType + '\'' +
                '}';
    }

    public static class Builder {
        private String hospitalId;
        private String hospitalName;
        private String address;
        private String city;
        private String contactPerson;
        private String contactEmail;
        private String contactPhone;
        private String facilityType;

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }

        public Builder setContactPerson(String contactPerson) {
            this.contactPerson = contactPerson;
            return this;
        }

        public Builder setContactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            return this;
        }

        public Builder setFacilityType(String facilityType) {
            this.facilityType = facilityType;
            return this;
        }

        public Builder setHospitalId(String hospitalId) {
            this.hospitalId = hospitalId;
            return this;
        }

        public Builder setHospitalName(String hospitalName) {
            this.hospitalName = hospitalName;
            return this;
        }

        public Builder copy (Hospital hospital){
            this.hospitalId=hospital.hospitalId;
            this.hospitalName=hospital.hospitalName;
            this.city=hospital.city;
            this.address=hospital.address;
            this.contactPerson=hospital.contactPerson;
            this.contactEmail=hospital.contactEmail;
            this.contactPhone=hospital.contactPhone;
            this.facilityType=hospital.facilityType;
            return this;
        }

        public Hospital build(){return new Hospital(this);}
    }
}


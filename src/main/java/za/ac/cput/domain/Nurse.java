package za.ac.cput.domain;

public class Nurse {
    private String NurseID;
    private String FirstName;
    private String LastName;
    private String Email;
    private int PhoneNumber;
    private String Address;
    private String Qualification;
    private String Specialization;
    private double  YearsOfExperience;
    private boolean AvailabilityStatus;
    private int LicenseNumber;


    private Nurse() {
    }

    private Nurse(Builder builder){
        this.NurseID = builder.NurseID;
        this.FirstName = builder.firstName;
        this.Email = builder.Email;
        this.LastName = builder.LastName;
        this.PhoneNumber = builder.PhoneNumber;
        this.Address = builder.Address;
        this.Qualification = builder.Qualification;
        this.Specialization = builder.Specialization;
        this.YearsOfExperience = builder.YearsOfExperience;
        this.AvailabilityStatus = builder.AvailabilityStatus;
        this.LicenseNumber = builder.LicenseNumber;
    }

    public String getNurseID() {
        return NurseID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return Email;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public String getQualification() {
        return Qualification;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public double getYearsOfExperience() {
        return YearsOfExperience;
    }

    public boolean isAvailabilityStatus() {
        return AvailabilityStatus;
    }

    public int getLicenseNumber() {
        return LicenseNumber;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "NurseID='" + NurseID + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Email='" + Email + '\'' +
                ", PhoneNumber=" + PhoneNumber +
                ", Address='" + Address + '\'' +
                ", Qualification='" + Qualification + '\'' +
                ", Specialization='" + Specialization + '\'' +
                ", YearsOfExperience=" + YearsOfExperience +
                ", AvailabilityStatus=" + AvailabilityStatus +
                ", LicenseNumber=" + LicenseNumber +
                '}';
    }


    public static class Builder {
        public String firstName;
        private String NurseID;
        private String FirstName;
        private String LastName;
        private String Email;
        private int PhoneNumber;
        private String Address;
        private String Qualification;
        private String Specialization;
        private double  YearsOfExperience;
        private boolean AvailabilityStatus;
        private int LicenseNumber;

        public Builder setNurseID(String nurseID) {
            this.NurseID = NurseID;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.FirstName = firstName;
            return this;
        }

        public Builder setEmail(String email) {
            this.Email = email;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.LastName = lastName;
            return this;
        }

        public Builder setPhoneNumber(int phoneNumber) {
            this.PhoneNumber = phoneNumber;
            return this;
        }

        public Builder setAddress(String address) {
            this.Address = address;
            return this;
        }

        public Builder setQualification(String qualification) {
            this.Qualification = qualification;
            return this;
        }

        public Builder setSpecialization(String specialization) {
            this.Specialization = specialization;
            return this;
        }

        public Builder setYearsOfExperience(double yearsOfExperience) {
            this.YearsOfExperience = yearsOfExperience;
            return this;
        }

        public Builder setAvailabilityStatus(boolean availabilityStatus) {
            this.AvailabilityStatus = availabilityStatus;
            return this;
        }

        public Builder setLicenseNumber(int licenseNumber) {
            this.LicenseNumber = licenseNumber;
            return this;
        }
        public Nurse build (){ return new Nurse(this); }
    }
}

package za.ac.cput.domain;

public class Booking {
    private String applicationID;
    private String nurseID;
    private String applicationDate;
    private String status;

    private Booking() {
    }
    private Booking(Builder builder){
        this.applicationID = builder.applicationID;
        this.nurseID = builder.nurseID;
        this.applicationDate = builder.applicationDate;
        this.status = builder.status;
    }

    public String getApplicationID() {
        return applicationID;
    }

    public String getNurseID() {
        return nurseID;
    }

    public String getApplicationDate() {
        return applicationDate;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "applicationID='" + applicationID + '\'' +
                ", nurseID='" + nurseID + '\'' +
                ", applicationDate='" + applicationDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
    public static class Builder{
        private String applicationID;
        private String nurseID;
        private String applicationDate;
        private String status;

        public Builder setApplicationID(String applicationID) {
            this.applicationID = applicationID;
            return this;
        }

        public Builder setNurseID(String nurseID) {
            this.nurseID = nurseID;
            return this;
        }

        public Builder setApplicationDate(String applicationDate) {
            this.applicationDate = applicationDate;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }
        public Builder copy(Booking booking){
            this.applicationID = booking.applicationID;
            this.applicationDate = booking.applicationDate;
            this.nurseID = booking.nurseID;
            this.status = booking.status;
            return this;
        }
        public Booking Build(){return new Booking(this);}
    }
}

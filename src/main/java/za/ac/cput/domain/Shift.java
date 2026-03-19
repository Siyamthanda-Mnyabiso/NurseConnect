package za.ac.cput.domain;

public class Shift {

    private int shiftId;
    private int hospitalId;
    private int shiftDate;
    private int startTime;
    private int endTime;
    private String requiredQualification;
    private String Department;
    private float hourlyRate;
    private String status;

    private Shift() {

    }

    private Shift(Builder builder) {
        this.shiftId = shiftId;
        this.hospitalId = hospitalId;
        this.shiftDate = shiftDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.requiredQualification = requiredQualification;
        this.Department = Department;
        this.hourlyRate = hourlyRate;
        this.status = status;
    }

    private int getShiftId() {
        return shiftId;
    }

    private int getHospitalId() {
        return hospitalId;
    }

    private int getShiftDate() {
        return shiftDate;
    }

    private int getStartTime() {
        return startTime;
    }

    private int getEndTime() {
        return endTime;
    }

    private String getRequiredQualification() {
        return requiredQualification;
    }

    public String getDepartment() {
        return Department;
    }

    private float getHourlyRate() {
        return hourlyRate;
    }

    private String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Shift{" +
                "shiftId=" + shiftId +
                ", hospitalId=" + hospitalId +
                ", shiftDate=" + shiftDate +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", requiredQualification='" + requiredQualification + '\'' +
                ", Department='" + Department + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", status='" + status + '\'' +
                '}';
    }

    public static class Builder {
        private int shiftId;
        private int hospitalId;
        private int shiftDate;
        private int startTime;
        private int endTime;
        private String requiredQualification;
        private String department;
        private float hourlyRate;
        private String status;

        public Builder setShiftId(int shiftId) {
            this.shiftId = shiftId;
            return this;
        }

        public Builder setHospitalId(int hospitalId) {
            this.hospitalId = hospitalId;
            return this;
        }

        public Builder setShiftDate(int shiftDate) {
            this.shiftDate = shiftDate;
            return this;
        }

        public Builder setStartTime(int startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setEndTime(int endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setRequiredQualification(String requiredQualification) {
            this.requiredQualification = requiredQualification;
            return this;
        }

        public Builder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public Builder setHourlyRate(float hourlyRate) {
            this.hourlyRate = hourlyRate;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Shift build() {
            return new Shift(this);
        }
    }
}
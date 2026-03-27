package za.ac.cput.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Shift {

    private String shiftId;
    private String hospitalId;
    private String shiftDate;
    private String startTime;
    private String endTime;
    private String requiredQualification;
    private String department;
    private double hourlyRate;
    private String status;

    private Shift() {

    }

    private Shift(Builder builder) {
        this.shiftId = builder.shiftId;
        this.hospitalId = builder.hospitalId;
        this.shiftDate = builder.shiftDate;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.requiredQualification = builder.requiredQualification;
        this.department = builder.department;
        this.hourlyRate = builder.hourlyRate;
        this.status = builder.status;
    }

    public String getShiftId() {
        return shiftId;
    }

    public  String getHospitalId() {
        return hospitalId;
    }

    public String getShiftDate() {
        return shiftDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getRequiredQualification() {
        return requiredQualification;
    }

    public String getDepartment() {
        return department;
    }

    public double getHourlyRate() {
        return  hourlyRate;
    }

    public String getStatus() {
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
                ", Department='" + department + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof Shift)) return false;
        Shift shift = (Shift) o;
        return shiftId.equals(shift.shiftId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(shiftId);
    }

    public static class Builder {
        private String shiftId;
        private String hospitalId;
        private String shiftDate;
        private String startTime;
        private String endTime;
        private String requiredQualification;
        private String department;
        private double hourlyRate;
        private String status;

        public Builder setShiftId(String shiftId) {
            this.shiftId = shiftId;
            return this;
        }

        public Builder setHospitalId(String hospitalId) {
            this.hospitalId = hospitalId;
            return this;
        }

        public Builder setShiftDate(String shiftDate) {
            this.shiftDate = shiftDate;
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setEndTime(String endTime) {
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

        public Builder setHourlyRate(double hourlyRate) {
            this.hourlyRate = hourlyRate;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Shift.Builder copy (Shift shift){
            this.shiftId = shift.shiftId;
            this.hospitalId = shift.hospitalId;
            this.shiftDate = shift.shiftDate;
            this.startTime = shift.startTime;
            this.endTime = shift.endTime;
            this.requiredQualification = shift.requiredQualification;
            this.department = shift.department;
            this.hourlyRate = shift.hourlyRate;
            this.status = shift.status;
            return this;
        }

        public Shift build() {
            return new Shift(this);
        }
    }
}
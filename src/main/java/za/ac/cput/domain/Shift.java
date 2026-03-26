package za.ac.cput.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Shift {

    private String shiftId;
    private String hospitalId;
    private LocalDate shiftDate;
    private LocalTime startTime;
    private LocalTime endTime;
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

    private String getShiftId() {
        return shiftId;
    }

    private String getHospitalId() {
        return hospitalId;
    }

    private LocalDate getShiftDate() {
        return shiftDate;
    }

    private LocalTime getStartTime() {
        return startTime;
    }

    private LocalTime getEndTime() {
        return endTime;
    }

    public String getRequiredQualification() {
        return requiredQualification;
    }

    public String getDepartment() {
        return department;
    }

    private double getHourlyRate() {
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
        private LocalDate shiftDate;
        private LocalTime startTime;
        private LocalTime endTime;
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

        public Builder setShiftDate(LocalDate shiftDate) {
            this.shiftDate = shiftDate;
            return this;
        }

        public Builder setStartTime(LocalTime startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setEndTime(LocalTime endTime) {
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

        public Shift build() {
            return new Shift(this);
        }
    }
}
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
        this.Department = department;
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

    private String getDepartment() {
        return department;
    }

    private float getHourlyRate() {
        return hourlyRate;
    }

    private String getStatus() {
        return status;
    }

    @Override
    private String toString() {
        return "Shift{" +
                "ShiftID" + shiftId + '\'' +
                "HospitalID" + hospitalId + '\'' +
                "ShiftDate" + shiftDate + '\'' +
                "StartTime" + startTime + '\'' +
                "EndTime" + endTime + '\'' +
                "RequiredQualification" + requiredQualification '\'' +
                "Department" + department + '\'' +
                "HourlyRate" + hourlyRate + '\'' +
                "Status" + status + '\'' +
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
    }

    public Builder setShiftId(int shiftId) {
        this.shiftId = shiftId;
    }

    public Builder setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public Builder setShiftDate(int shiftDate) {
        this.shiftDate = shiftDate;
    }

    public Builder setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public Builder setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public Builder setRequiredQualification(String requiredQualification) {
        this.requiredQualification = requiredQualification;
    }

    public Builder setDepartment(String department) {
        this.department = department;
    }

    public Builder setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public Builder setStatus(String status) {
        this.status = status;
    }

    public Shift build() {
        return new Shift(this)
    }

}
}
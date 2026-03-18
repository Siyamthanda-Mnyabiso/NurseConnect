package za.ac.cput.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class AvailabilitySchedule {

    private final String availabilityID;
    private final String nurseID;
    private final LocalDate availableDate;
    private final LocalTime startTime;
    private final LocalTime endTime;

    private AvailabilitySchedule(Builder builder) {
        this.availabilityID = builder.availabilityID;
        this.nurseID = builder.nurseID;
        this.availableDate = builder.availableDate;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
    }

    public String getAvailabilityID() { return availabilityID; }
    public String getNurseID() { return nurseID; }
    public LocalDate getAvailableDate() { return availableDate; }
    public LocalTime getStartTime() { return startTime; }
    public LocalTime getEndTime() { return endTime; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AvailabilitySchedule)) return false;
        AvailabilitySchedule that = (AvailabilitySchedule) o;
        return Objects.equals(availabilityID, that.availabilityID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityID);
    }

    @Override
    public String toString() {
        return "AvailabilitySchedule{" +
                "availabilityID='" + availabilityID + '\'' +
                ", nurseID='" + nurseID + '\'' +
                ", availableDate=" + availableDate +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    public static class Builder {
        private String availabilityID;
        private String nurseID;
        private LocalDate availableDate;
        private LocalTime startTime;
        private LocalTime endTime;

        public Builder setAvailabilityID(String availabilityID) { this.availabilityID = availabilityID; return this; }
        public Builder setNurseID(String nurseID) { this.nurseID = nurseID; return this; }
        public Builder setAvailableDate(LocalDate availableDate) { this.availableDate = availableDate; return this; }
        public Builder setStartTime(LocalTime startTime) { this.startTime = startTime; return this; }
        public Builder setEndTime(LocalTime endTime) { this.endTime = endTime; return this; }

        public Builder copy(AvailabilitySchedule schedule) {
            this.availabilityID = schedule.availabilityID;
            this.nurseID = schedule.nurseID;
            this.availableDate = schedule.availableDate;
            this.startTime = schedule.startTime;
            this.endTime = schedule.endTime;
            return this;
        }

        public AvailabilitySchedule build() {
            return new AvailabilitySchedule(this);
        }
    }
}
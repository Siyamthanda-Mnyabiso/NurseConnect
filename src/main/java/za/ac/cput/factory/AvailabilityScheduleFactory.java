
package za.ac.cput.factory;

import za.ac.cput.domain.AvailabilitySchedule;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public class AvailabilityScheduleFactory {

    private AvailabilityScheduleFactory() {}

    public static AvailabilitySchedule createSchedule(String nurseID, LocalDate availableDate,
                                                      LocalTime startTime, LocalTime endTime) {

        if (nurseID == null || nurseID.isBlank()) return null;
        if (availableDate == null) return null;
        if (startTime == null || endTime == null) return null;

        String availabilityID = UUID.randomUUID().toString();

        return new AvailabilitySchedule.Builder()
                .setAvailabilityID(availabilityID)
                .setNurseID(nurseID)
                .setAvailableDate(availableDate)
                .setStartTime(startTime)
                .setEndTime(endTime)
                .build();
    }
}

package za.ac.cput.factory;

import za.ac.cput.domain.Shift;
import za.ac.cput.util.Helper;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class ShiftFactory {

    public static Shift createShift(String shiftId,
                                    String hospitalId,
                                    LocalDate shiftDate,
                                    LocalTime startTime,
                                    LocalTime endTime,
                                    String requiredQualification,
                                    String department,
                                    BigDecimal hourlyRate,
                                    String status) {

        // Null / empty checks
        if (Helper.isNullOrEmpty(shiftId))
            throw new IllegalArgumentException("Shift ID is required");
        if (Helper.isNullOrEmpty(requiredQualification))
            throw new IllegalArgumentException("Required qualification is required");
        if (Helper.isNullOrEmpty(department))
            throw new IllegalArgumentException("Department is required");
        if (Helper.isNullOrEmpty(status))
            throw new IllegalArgumentException("Status is required");

        // Null checks for non-String fields
        if (shiftDate == null)
            throw new IllegalArgumentException("Shift date is required");
        if (startTime == null)
            throw new IllegalArgumentException("Start time is required");
        if (endTime == null)
            throw new IllegalArgumentException("End time is required");
        if (hourlyRate == null || hourlyRate.compareTo(BigDecimal.ZERO) <= 0)
            throw new IllegalArgumentException("Hourly rate must be a positive value");

        // Format validation
        if (!Helper.isValidHospitalId(hospitalId))
            throw new IllegalArgumentException("Invalid hospital ID format: " + hospitalId);

        // Logic validation
        if (!endTime.isAfter(startTime))
            throw new IllegalArgumentException("End time must be after start time");
        if (shiftDate.isBefore(LocalDate.now()))
            throw new IllegalArgumentException("Shift date cannot be in the past");

        return new Shift.Builder()
                .setShiftId(shiftId)
                .setHospitalId(hospitalId)
                .setShiftDate(shiftDate)
                .setStartTime(startTime)
                .setEndTime(endTime)
                .setRequiredQualification(requiredQualification)
                .setDepartment(department)
                .setHourlyRate(hourlyRate)
                .setStatus(status)
                .build();
    }
}
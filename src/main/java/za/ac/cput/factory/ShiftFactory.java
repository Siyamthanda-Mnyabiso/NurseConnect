package za.ac.cput.factory;

import za.ac.cput.util.Helper;
import za.ac.cput.domain.Shift;

import java.time.LocalDate;
import java.time.LocalTime;

public class ShiftFactory {

    public static Shift createShiftFactory(
            String shiftId,
            String hospitalId,
            LocalDate shiftDate,
            LocalTime startTime,
            LocalTime endTime,
            String requiredQualification,
            String department,
            double hourlyRates,
            String status) {

        if (Helper.isNullOrEmpty(shiftId) || Helper.isNullOrEmpty(hospitalId) ||
                Helper.isNullOrEmpty(requiredQualification) || Helper.isNullOrEmpty(department) ||
                Helper.isNullOrEmpty(status) || shiftDate == null || startTime == null ||
                endTime == null || hourlyRates <= 0) {

            return null;
        }

        return new Shift.Builder()
                .setShiftId(shiftId)
                .setHospitalId(hospitalId)
                .setShiftDate(shiftDate)
                .setStartTime(startTime)
                .setEndTime(endTime)
                .setRequiredQualification(requiredQualification)
                .setDepartment(department)
                .setHourlyRate(hourlyRates)
                .setStatus(status)
                .build();


    }
}
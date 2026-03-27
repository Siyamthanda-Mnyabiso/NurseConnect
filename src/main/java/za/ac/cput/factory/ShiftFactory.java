package za.ac.cput.factory;

import za.ac.cput.util.Helper;
import za.ac.cput.domain.Shift;

import java.time.LocalDate;

public class ShiftFactory {

    public static Shift createShift(
            String shiftId,
            String hospitalId,
            String shiftDate,
            String startTime,
            String endTime,
            String requiredQualification,
            String department,
            double hourlyRates,
            String status) {

        if (Helper.isNullOrEmpty(shiftId) || Helper.isNullOrEmpty(hospitalId) ||
                Helper.isNullOrEmpty(requiredQualification) || Helper.isNullOrEmpty(department) ||
                Helper.isNullOrEmpty(status) || Helper.isNullOrEmpty(shiftDate) || Helper.isNullOrEmpty(startTime) ||
                Helper.isNullOrEmpty(endTime)) {

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
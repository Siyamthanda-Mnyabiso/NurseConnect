package za.ac.cput.repository;

import za.ac.cput.domain.AvailabilitySchedule;

import java.util.ArrayList;
import java.util.List;

public class AvailabilityScheduleRepository implements IAvailabilityScheduleRepository {

    private static IAvailabilityScheduleRepository repository = null;
    private List<AvailabilitySchedule> scheduleList;

    private AvailabilityScheduleRepository() {
        scheduleList = new ArrayList<>();
    }

    public static IAvailabilityScheduleRepository getRepository() {
        if (repository == null) {
            repository = new AvailabilityScheduleRepository();
        }
        return repository;
    }

    @Override
    public AvailabilitySchedule create(AvailabilitySchedule schedule) {
        boolean success = scheduleList.add(schedule);
        if (success) {
            return schedule;
        }

        return null;
    }

    @Override
    public AvailabilitySchedule read(String availabilityID) {

        for (AvailabilitySchedule schedule : scheduleList) {
            if (schedule.getAvailabilityID().equals(availabilityID)) {
                return schedule;
            }
        }
        return null;


    }

    @Override
    public AvailabilitySchedule update(AvailabilitySchedule schedule) {
        String id = schedule.getAvailabilityID();
        AvailabilitySchedule oldSchedule = read(id);

        if (oldSchedule == null) {
            return null;
        }

        boolean success = scheduleList.remove(oldSchedule);
        if (!success) {
            return null;
        }

        if (scheduleList.add(schedule)) {
            return schedule;
         }
         return null;
       }

    @Override
     public boolean delete(String id) {
           AvailabilitySchedule scheduleToDelete = read(id);
        if (scheduleToDelete == null) {
            return false;
        }
        return scheduleList.remove( scheduleToDelete);}

    @Override
    public List<AvailabilitySchedule> getAll() {
        return scheduleList;

     }

}
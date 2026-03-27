package za.ac.cput.repository;

import za.ac.cput.domain.AvailabilitySchedule;
import java.util.List;

public interface IAvailabilityScheduleRepository extends IRepository<AvailabilitySchedule, String> {

    List<AvailabilitySchedule> getAll();
}

package za.ac.cput.repository;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.AvailabilitySchedule;
import za.ac.cput.factory.AvailabilityScheduleFactory;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class AvailabilityScheduleRepositoryTest {

    private static IAvailabilityScheduleRepository repository = AvailabilityScheduleRepository.getRepository();


    private static AvailabilitySchedule schedule = AvailabilityScheduleFactory.createSchedule(
            "809119078",
            LocalDate.of(2026, 5, 20),
            LocalTime.of(8 , 0),
            LocalTime.of(16, 0)
    );

    @Test
    void a_create() {
        AvailabilitySchedule created = repository.create(schedule);
        assertNotNull(created);
        assertEquals(schedule.getAvailabilityID(), created.getAvailabilityID());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        AvailabilitySchedule read = repository.read(schedule.getAvailabilityID());
        assertNotNull(read);
        assertEquals(schedule.getAvailabilityID(), read.getAvailabilityID());
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        // Updating the date to a different day for the test
        AvailabilitySchedule updatedSchedule = new AvailabilitySchedule.Builder()
                .copy(schedule)
                .setAvailableDate(LocalDate.of(2026, 5, 21))
                .build();

        AvailabilitySchedule updated = repository.update(updatedSchedule);
        assertNotNull(updated);
        assertEquals(LocalDate.of(2026, 5, 21), updated.getAvailableDate());
        System.out.println("Updated: " + updated);
    }

    @Test
    @Disabled
    void d_delete() {
        boolean deleted = repository.delete(schedule.getAvailabilityID());
        assertTrue(deleted);
        System.out.println("Deleted status: " + deleted);
    }

    @Test
    void e_getAll() {
        List<AvailabilitySchedule> allSchedules = repository.getAll();
        assertNotNull(allSchedules);
        assertFalse(allSchedules.isEmpty());
        System.out.println("All Schedules: " + allSchedules);
    }
}
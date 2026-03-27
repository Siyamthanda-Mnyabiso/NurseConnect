
package za.ac.cput.factory;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.AvailabilitySchedule;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AvailabilityScheduleFactoryTest {

    private static AvailabilitySchedule schedule;

    @BeforeAll
    static void setUp() {
        schedule = AvailabilityScheduleFactory.createSchedule(
                "NURSE-001",
                LocalDate.of(2026, 4, 1),
                LocalTime.of(7, 0),
                LocalTime.of(19, 0)
        );
    }

    @Test
    @Order(1)
    @DisplayName("Test: Schedule created successfully")
    void testCreateSchedule_Success() {
        assertNotNull(schedule);
        System.out.println("Created Schedule: " + schedule);
    }

    @Test
    @Order(2)
    @DisplayName("Test: AvailabilityID is auto-generated")
    void testAvailabilityID_NotNull() {
        assertNotNull(schedule.getAvailabilityID());
        assertFalse(schedule.getAvailabilityID().isBlank());
    }

    @Test
    @Order(3)
    @DisplayName("Test: NurseID is correctly assigned")
    void testNurseID() {
        assertEquals("NURSE-001", schedule.getNurseID());
    }

    @Test
    @Order(4)
    @DisplayName("Test: Available date is correctly assigned")
    void testAvailableDate() {
        assertEquals(LocalDate.of(2026, 4, 1), schedule.getAvailableDate());
    }

    @Test
    @Order(5)
    @DisplayName("Test: Start time is correctly assigned")
    void testStartTime() {
        assertEquals(LocalTime.of(7, 0), schedule.getStartTime());
    }

    @Test
    @Order(6)
    @DisplayName("Test: End time is correctly assigned")
    void testEndTime() {
        assertEquals(LocalTime.of(19, 0), schedule.getEndTime());
    }

    @Test
    @Order(7)
    @DisplayName("Test: Factory returns null when nurseID is null")
    void testNullNurseID_ReturnsNull() {
        assertNull(AvailabilityScheduleFactory.createSchedule(
                null,
                LocalDate.of(2026, 4, 1),
                LocalTime.of(7, 0),
                LocalTime.of(19, 0)
        ));
    }

    @Test
    @Order(8)
    @DisplayName("Test: Factory returns null when date is null")
    void testNullDate_ReturnsNull() {
        assertNull(AvailabilityScheduleFactory.createSchedule(
                "NURSE-001",
                null,
                LocalTime.of(7, 0),
                LocalTime.of(19, 0)
        ));
    }

    @Test
    @Order(9)
    @DisplayName("Test: Factory returns null when startTime is null")
    void testNullStartTime_ReturnsNull() {
        assertNull(AvailabilityScheduleFactory.createSchedule(
                "NURSE-001",
                LocalDate.of(2026, 4, 1),
                null,
                LocalTime.of(19, 0)
        ));
    }

    @Test
    @Order(10)
    @DisplayName("Test: Two schedules have different IDs")
    void testUniqueIDs() {
        AvailabilitySchedule schedule2 = AvailabilityScheduleFactory.createSchedule(
                "NURSE-001",
                LocalDate.of(2026, 4, 1),
                LocalTime.of(7, 0),
                LocalTime.of(19, 0)
        );
        assertNotNull(schedule2);
        assertNotEquals(schedule.getAvailabilityID(), schedule2.getAvailabilityID());
    }
}
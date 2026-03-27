/*
      ShiftRepositoryTest.java
      Author : Siyamthanda Philemon Mnyabiso (221799028)
      Date : 27 March 2026
 */

package za.ac.cput.repository;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Shift;
import za.ac.cput.factory.ShiftFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class ShiftRepositoryTest {

    private static IShiftRepository repository = ShiftRepository.getRepository();

    private static Shift shift= ShiftFactory.createShift(
            "Night790",
            "57945678",
            "15Jun26",
            "13:00",
            "20:00",
            "Nursing Science",
            "ICU",
            26.0,
            "Available"
    );

    @Test
    void a_create() {
        Shift created = repository.create(shift);
        assertNotNull(created);
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        Shift read = repository.read(shift.getShiftId());
        assertEquals(shift.getShiftId(), read.getShiftId());
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Shift newShift = new Shift.Builder()
                .copy(shift)
                .setStatus("Unavailable")
                .build();

        Shift updated = repository.update(newShift);
        assertNotNull(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    @Disabled
    void d_delete() {
        boolean deleted = repository.delete(shift.getShiftId());
        assertTrue(deleted);
        System.out.println("Deleted: " + deleted);
    }

    @Test
    void e_getAll() {
        List<Shift> shifts = repository.getAll();
        System.out.println("Shifts: " + shifts);
    }
}
/*
      NurseRepositoryTest.java
      Author : Siyamthanda Philemon Mnyabiso (221799028)
      Date : 25 March 2025
 */


package za.ac.cput.repository;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Nurse;
import za.ac.cput.factory.NurseFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class NurseRepositoryTest {

    private static INurseRepository repository = NurseRepository.getRepository();
    private static Nurse nurse = NurseFactory.createNurse("809119078", "Noluthando", "Mnyabiso", "nolu@gmail.com", "0896746356", "143 Sir Lowry Rd, Foreshore, Cape Town, 8001", "Nursing Science", "Midwife", "6 years", true, "RN978905");

    @Test
    void a_create() {
        Nurse created = repository.create(nurse);
        assertNotNull(created);
        System.out.println("Created: "+ created);
    }

    @Test
    void b_read() {
        Nurse read = repository.read(nurse.getNurseID());
        assertEquals(nurse.getNurseID(), read.getNurseID());
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Nurse newNurse = new Nurse.Builder().copy(nurse)
                .setAvailabilityStatus(true)
                .build();
        Nurse updated = repository.update(newNurse);
        assertNotNull(updated);
        System.out.println("Updated: " + updated);

    }

    @Test
    @Disabled
    void d_delete() {
        boolean deleted = repository.delete(nurse.getNurseID());
        assertTrue(deleted);
        System.out.println("Deleted: " + deleted);
    }

    @Test
    void e_getAll() {
        List<Nurse> nurses = repository.getAll();
        System.out.println("Nurse: " + nurses);
    }
}
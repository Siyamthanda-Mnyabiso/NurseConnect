package za.ac.cput.repository;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Hospital;
import za.ac.cput.factory.HospitalFactory;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class HospitalRepositoryTest {

    private static IHospitalRepository repository = HospitalRepository.getRepository();
    private static Hospital hospital = HospitalFactory.createHospital("H001","Groote Schuur Hospital","Main Rd, Observatory, Cape Town, 7925","hlumeloInfodesk@gmail.com","Cape Town","Hlumelo Konzani","Public","0219673367");



    @Test
    void a_create() {
        Hospital created = repository.create(hospital);
        assertNotNull(created);
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        Hospital read = repository.read (hospital.getHospitalId());
        assertEquals(hospital.getHospitalId(), read.getHospitalId());
        System.out.println ("Read:" + read);
    }

    @Test
    void c_update() {
        Hospital updatedHospital = new Hospital.Builder().copy(hospital)
                .setContactPhone("0214009999")
                .build();

           Hospital updated = repository.update(updatedHospital);
           assertNotNull(updated);
           System.out.println("Updated: " + updated);



    }

    @Test
    @Disabled
    void d_delete() {
        boolean deleted = repository.delete (hospital.getHospitalId());
        assertTrue(deleted);
         System.out.println("Deleted: " + deleted);

     }

    @Test
    void e_getAll() {
        List<Hospital> hospitals = repository.getAll();
         System.out.println(" Hospitals: " + hospitals);
      }
  }
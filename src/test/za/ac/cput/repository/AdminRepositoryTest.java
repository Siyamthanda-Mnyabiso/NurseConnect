package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Admin;
import za.ac.cput.domain.Nurse;
import za.ac.cput.factory.AdminFactory;
import za.ac.cput.factory.NurseFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class AdminRepositoryTest {
    private static IAdminRepository repository = AdminRepository.getRepository();
    private static Admin admin = AdminFactory.createAdmin("234RDC","Red Cross admin","redcross@gmail.com","Admin","GeeMan#456");

    @Test
    void a_create() {
        Admin created = repository.create(admin);
        assertNotNull(created);
        System.out.println("Created Admin :" + " "+ created);
    }

    @Test
    void b_read() {
        Admin read = repository.read(admin.getAdminId());
        assertNotNull(read);
        System.out.println("Read Admin" + " "+ read);
    }

    @Test
    void c_update() {
        Admin addAdmin = new Admin.Builder().copy(admin)
                .setPassword("Casey234<>")
                .setEmail("casey@mycput.ac.za")
                .build();
        Admin updated = repository.update(addAdmin);
        assertNotNull(updated);
        System.out.println("Updated Admin : " + " " + updated);
    }

    @Test
    void d_delete() {
        boolean deleted = repository.delete(admin.getAdminId());
        assertNotNull(deleted);
        System.out.println("Deleted Admin : " + " " + deleted);
    }

    @Test
    void e_getAll() {
        List<Admin> allAdmin = repository.getAll();
        System.out.println("Admins : " + " "+ allAdmin);
    }
}
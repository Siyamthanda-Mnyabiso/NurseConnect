/*
      AdminRepositoryTest.java
      Author : Snothando Mangaliso (241177049)
      Date : 26 March 2025
 */

package za.ac.cput.repository;

import  org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Admin;
import za.ac.cput.factory.AdminFactory;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class AdminRepositoryTest {
    private static IAdminRepository repository = AdminRepository.getRepository();
    private static Admin admin = AdminFactory.createAdmin(
            "24546789",
            "Red Cross Admin",
            "redcrossadmin@gmail.com",
            "Admin",
            "adminRed123@" );

    @Test
    void a_create() {
       Admin created = repository.create(admin);
        assertNotNull(created);
        System.out.println("Created Admin : "+ " "+ created);
    }

    @Test
    void b_read() {
        Admin read = repository.read(admin.getAdminId());
        assertNotNull(read);
        System.out.println("Read Admin : " + " "+ read);
    }

    @Test
    void c_update() {
        Admin updateAdmin = new Admin.Builder().copy(admin)
                .setPassword("Redadmin@32")
                .setEmail("adminred@gmail.com")
                .build();
       Admin updated = repository.update(updateAdmin);
        assertNotNull(updated);
        System.out.println("Updated Admin : " + " "+  updated);

    }

    @Test
    void d_delete() {
        boolean deleted = repository.delete(admin.getAdminId());
        assertNotNull(deleted);
        System.out.println("Deleted Admin : " + " "+ deleted);
    }

    @Test
    void e_getAll() {
        List<Admin> allAdmin = repository.getAll();
        System.out.println("All Admins : " + " "+ allAdmin);
    }
}
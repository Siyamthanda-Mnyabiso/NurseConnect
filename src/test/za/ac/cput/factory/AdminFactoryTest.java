package za.ac.cput.factory;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Admin;
import za.ac.cput.factory.AdminFactory;

class AdminFactoryTest {

    @Test
    void createAdmin() {
        Admin admin = AdminFactory.createAdmin("KDH12","Khayelitsha Admin","khayelitsha@gmail.com","Admin","GeeMan@123");
        assertNotNull(admin);
        System.out.println("Admin : "+ " "+admin);

    }
}
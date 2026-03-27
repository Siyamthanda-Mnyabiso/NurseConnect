/*
     AdminFactoryTest.java
     Author : Snothando Mangaliso (241177049)
     Date : 26 March 2025
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import za.ac.cput.domain.Admin;

class AdminFactoryTest {
    private  Admin admin1;
    @BeforeEach
    void setUp() {
       admin1 = AdminFactory.createAdmin(
               "24526345",
               "Khayelitsha Admin",
               "khayelitsha@gmail.com",
               "Admin",
               "@adminKhay123");

    }

    @Test
    void createAdmin() {
        assertNotNull(admin1);
        System.out.println(admin1);
    }

    @Test
    void testToFail() {
         Admin admin2 = AdminFactory.createAdmin(
                "RDC127643543",
                "Red Cross Admin",
                "redcrossmail.com",
                "Admin",
                "#redcross33");

        assertNull(admin2);
        System.out.println(admin2);
    }
}
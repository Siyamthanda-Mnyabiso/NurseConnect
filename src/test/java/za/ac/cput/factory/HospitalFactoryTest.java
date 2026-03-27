// HospitalFactoryTest.java
// Author : Luxolo Matshikiza (219098751)
// Date : 26 March 2026

package za.ac.cput.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Hospital;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.MethodName.class)
class HospitalFactoryTest {

    private static Hospital h1, h2;

    @BeforeEach
    void setUp() {
        h1 = HospitalFactory.createHospital("H001","Groote Schuur Hospital","Main Rd, Observatory, Cape Town, 7925","hlumeloInfodesk@gmail.com","Cape Town","Hlumelo Konzani","Public","0219673367");


        h2 = HospitalFactory.createHospital("H002","New Somerset","Portswood Road, Green Point, Cape Town, 8005","JamesInfodeskgmailcom","Cape Town","James Bond","Private","0211874936");
                // should fail for email.

    }

    @Test
    void a_createHospital() {
        assertNotNull(h1);
        System.out.println(h1.toString());
    }

    @Test
    void b_testHospitalThatFails() {
        assertNotNull(h2);
        System.out.println(h2.toString());
    }
}

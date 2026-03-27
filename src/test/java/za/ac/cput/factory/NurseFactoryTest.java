package za.ac.cput.factory;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Nurse;

import static org.junit.jupiter.api.Assertions.assertNotNull;
@TestMethodOrder(MethodOrderer.MethodName.class)
class NurseFactoryTest {
    private static Nurse n1, n2;
    @BeforeEach
    void setUp(){
        n1 = NurseFactory.createNurse("809119078", "Noluthando", "Mnyabiso", "nolu@gmail.com", "0896746356", "143 Sir Lowry Rd, Foreshore, Cape Town, 8001", "Nursing Science", "Midwife", "6 years", true, "RN978905");
        n2 = NurseFactory.createNurse("568906789", "Thando", "Khanyiso", "khanyigmail.com", "0789079567", "143 Sir Lowry Rd, Foreshore, Cape Town, 8001", "Nursing Science", "Midwife", "7 years", false, "RN789456");

    }

    @Test
    void a_createNurse() {
        assertNotNull(n1);
        System.out.println(n1.toString());
    }

    @Test
    void b_testNurseThatFails(){
        assertNotNull(n2);
        System.out.println(n2.toString());
    }
}
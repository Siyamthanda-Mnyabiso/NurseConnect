/*
      ShiftFactoryTest.java
      Author : Siyamthanda Philemon Mnyabiso (221799028)
      Date : 27 March 2026
 */

package za.ac.cput.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Shift;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.MethodName.class)
class ShiftFactoryTest {

    private static Shift shift_1, shift_2;

    @BeforeEach
    void setUp(){

        shift_1 = ShiftFactory.createShift(
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

        shift_2 = ShiftFactory.createShift(
                "Day123",
                "12345678",
                "15Jun26",
                "08:00",
                "16:00",
                "Nursing Science",
                "General Ward",
                30.0,
                "Unavailable"
        );
    }

    @Test
    void a_createShift() {
        assertNotNull(shift_1);
        System.out.println(shift_1.toString());
    }

    @Test
    void b_testShiftThatFails() {
        assertNotNull(shift_2);
        System.out.println(shift_2.toString());
    }
}
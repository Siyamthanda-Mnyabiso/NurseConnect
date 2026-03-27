package za.ac.cput.factory;

import za.ac.cput.domain.Booking;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class BookingFactoryTest {

    private static Booking B1, B2;

    @BeforeEach
    void setUp(){
        B1 = BookingFactory.createBooking("5677","676w8","4 March 2025","Available");
        B2 = BookingFactory.createBooking("","7348348","5 May 2026","Not Available");
    }
    @Test
    void a_testBooking(){
        assertNotNull(B1);
        System.out.println(B1.toString());
    }
    @Test
    void b_testBookingFails(){
        assertNotNull(B2);
        System.out.println(B2.toString());
    }
}
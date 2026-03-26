package ac.cput.factory;

import ac.cput.domain.Booking;

import static org.junit.jupiter.api.Assertions.*;

class BookingFactoryTest {

    @org.junit.jupiter.api.Test
    void createBooking() {
        Booking book = new BookingFactory.createBooking("676888","76869","03 March 2026","Available");
        assertNotNull(book);
        System.out.println(book);
    }
}
package ac.cput.repository;

import ac.cput.domain.Booking;
import ac.cput.factory.BookingFactory;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class BookingRepositoryTest {
    private static IBookingRepository repository = BookingRepository.getRepository();
    private static Booking booking = BookingFactory.createBooking("56783","67589","6 June","Not Available");

    @Test
    void a_create() {
        Booking created = repository.create(booking);
        assertNotNull(created);
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        Booking read = repository.read (booking.getApplicationID());
        assertEquals(booking.getApplicationID(), read.getApplicationID());
        System.out.println ("Read:" + read);
    }

    @Test
    void c_update() {
       Booking updatedBooking = new Booking.Builder().copy(booking)
               .setApplicationDate("6 August")
               .Build();

        Booking updated = repository.update(updatedBooking);
        assertNotNull(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    @Disabled
    void d_delete() {
        boolean deleted = repository.delete (booking.getApplicationID());
        assertTrue(deleted);
        System.out.println("Deleted: " + deleted);
    }

    @Test
    void e_getAll() {
        List<Booking> hospitals = repository.getAll();
        System.out.println(" Booking: " + hospitals);
    }
}
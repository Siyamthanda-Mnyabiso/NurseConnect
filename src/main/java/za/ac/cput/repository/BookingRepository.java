/*
      BookingRepository.java
      Author : Mvuyisi Mcithwa (220452709)
      Date : 19 March 2025
 */
package za.ac.cput.repository;

import za.ac.cput.domain.Booking;

import java.util.ArrayList;
import java.util.List;

public class BookingRepository implements IBookingRepository {
    public static IBookingRepository repository = null;
    private List<Booking> bookingList;

    private BookingRepository(){
        bookingList = new ArrayList<>();
    }

    public static IBookingRepository getRepository(){
        if (repository == null){
            repository = new BookingRepository();
        }
        return repository;
    }

    @Override
    public Booking create(Booking booking) {
        boolean success = bookingList.add(booking);
        if (success){
            return booking;
        }
        return null;
    }

    @Override
    public Booking read(String applicationID) {
        for (Booking booking : bookingList){
            if (booking.getApplicationID().equals(applicationID)){
                return booking;
            }
        }
        return null;
    }

    @Override
    public Booking update(Booking booking) {
        String id = booking.getApplicationID();
        Booking oldBooking = read(id);
        if (oldBooking == null){
            return null;
        }
        boolean success = bookingList.remove(oldBooking);
        if(!success){
            return null;
        }
        if(bookingList.add(booking)){
            return booking;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Booking bookingToDelete = read(id);
        if (bookingToDelete == null) {
            return false;
        }
        return (bookingList.remove(bookingToDelete));
    }
    @Override
    public List<Booking> getAll() {
        return bookingList;
    }
}

/*
      BookingFactory.java
      Author : Mvuyisi Mcithwa (220452709)
      Date : 18 March 2025
 */
package za.ac.cput.factory;
import za.ac.cput.domain.Booking;
import za.ac.cput.util.Helper;

public class BookingFactory {
    public static Booking createBooking(String applicationID, String nurseID,String applicationDate,String status){
        if(Helper.isNullOrEmpty(applicationID) || (Helper.isNullOrEmpty(nurseID)) || (Helper.isNullOrEmpty(applicationDate)) || Helper.isNullOrEmpty(status)){
            return null;
        }
        return new Booking.Builder()
                .setApplicationID(applicationID)
                .setNurseID(nurseID)
                .setApplicationDate(applicationDate)
                .setStatus(status)
                .Build();
    }
}

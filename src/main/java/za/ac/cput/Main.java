package za.ac.cput;

import za.ac.cput.domain.Admin;
import za.ac.cput.domain.Nurse;
import ac.cput.domain.Booking;
import za.ac.cput.factory.AdminFactory;
import za.ac.cput.factory.NurseFactory;
import ac.cput.factory.BookingFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Booking booking = BookingFactory.createBooking("567489032", "0331", "30 March 2026", "Available");
        System.out.println(booking);

        Nurse nurse = NurseFactory.createNurse("809119078", "Noluthando", "Mnyabiso", "nolu@gmail.com", "0896746356", "143 Sir Lowry Rd, Foreshore, Cape Town, 8001", "Nursing Science", "Midwife", "6 years", true, "RN978905");

    }

}
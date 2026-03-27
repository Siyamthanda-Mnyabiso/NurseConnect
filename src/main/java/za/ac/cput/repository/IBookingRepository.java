/*
      IBookingRepository.java
      Author : Mvuyisi Mcithwa (220452709)
      Date : 19 March 2025
 */
package za.ac.cput.repository;
import za.ac.cput.domain.Booking;
import za.ac.cput.repository.IRepository;

import java.util.List;

public interface IBookingRepository extends  IRepository <Booking, String> {
    List<Booking> getAll();
}

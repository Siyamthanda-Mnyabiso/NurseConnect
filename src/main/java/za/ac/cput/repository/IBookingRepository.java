package ac.cput.repository;
import ac.cput.domain.Booking;
import za.ac.cput.repository.IRepository;

import java.util.List;

public interface IBookingRepository extends  IRepository <Booking, String> {
    List<Booking> getAll();
}

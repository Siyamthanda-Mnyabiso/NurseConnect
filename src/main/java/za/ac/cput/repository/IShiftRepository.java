package za.ac.cput.repository;

import za.ac.cput.domain.Shift;

import java.util.List;

public interface IShiftRepository extends IRepository <Shift, String> {
    List<Shift> getAll();
}

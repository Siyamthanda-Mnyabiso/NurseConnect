package za.ac.cput.repository;

import za.ac.cput.domain.Nurse;

import java.util.List;

public interface INurseRepository extends  IRepository <Nurse, String> {


    List<Nurse> getAll();
}

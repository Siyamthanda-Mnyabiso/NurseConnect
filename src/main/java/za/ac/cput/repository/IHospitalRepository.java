package za.ac.cput.repository;

import za.ac.cput.domain.Hospital;

import java.util.List;

public interface IHospitalRepository extends IRepository<Hospital,String> {
    List<Hospital> getAll();
}
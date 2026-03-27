// IHospitalRepository.java
// Author : Luxolo Matshikiza (219098751)
// Date : 20 March 2026

package za.ac.cput.repository;

import za.ac.cput.domain.Hospital;

import java.util.List;

public interface IHospitalRepository extends IRepository<Hospital,String> {
    List<Hospital> getAll();
}

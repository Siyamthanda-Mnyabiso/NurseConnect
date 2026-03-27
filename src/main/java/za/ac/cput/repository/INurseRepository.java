/*
     INurseRepository.java
      Author : Siyamthanda Philemon Mnyabiso (221799028)
      Date : 19 March 2025
 */

package za.ac.cput.repository;

import za.ac.cput.domain.Nurse;

import java.util.List;

public interface INurseRepository extends  IRepository <Nurse, String> {


    List<Nurse> getAll();
}

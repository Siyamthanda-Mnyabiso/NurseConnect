/*
     AdminRepository.java
     Author : Snothando Mangaliso (241177049)
     Date : 19 March 2025

 */
package za.ac.cput.repository;

import za.ac.cput.domain.Admin;

import java.util.List;

public interface IAdminRepository extends IRepository<Admin,String> {
    List<Admin> getAll();
}

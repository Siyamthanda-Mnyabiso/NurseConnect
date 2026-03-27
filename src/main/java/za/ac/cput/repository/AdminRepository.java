/*    AdminRepository.java
      Author : Snothando Mangaliso (241177049)
      Date : 19 March 2025

 */
package za.ac.cput.repository;

import za.ac.cput.domain.Admin;

import java.util.ArrayList;
import java.util.List;

public class AdminRepository implements IAdminRepository{
    public static IAdminRepository repository = null;
    public List<Admin> adminList;

    public AdminRepository(){
        adminList = new ArrayList<>();
    }

    public static IAdminRepository getRepository(){
        if(repository ==null){
            repository = new AdminRepository();
        }
        return repository;
    }
    @Override
    public Admin create(Admin admin) {
        boolean created = adminList.add(admin);
        if(created){
            return admin;
        }
        return null;
    }

    @Override
    public Admin read(String s) {
        for(Admin admin:adminList){
            if(admin.getAdminId().equals(s)){
                return admin;
            }
        }
        return null;
    }

    @Override
    public Admin update(Admin admin) {
        String updateAdmin = admin.getAdminId();
        Admin oldAdmin = read(updateAdmin);
        if(oldAdmin == null){
            return null;
        }
        boolean updated = adminList.remove(oldAdmin);
        if(updated){
            return admin;
        }
        if(adminList.add(admin)){
            return admin;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        Admin deleted = read(s);
        if(deleted == null){
            return false;
        }
//        adminList.remove(deleted);
//        return true;
        return adminList.remove(deleted);
    }

    @Override
    public List<Admin> getAll() {
        return adminList;
    }
}

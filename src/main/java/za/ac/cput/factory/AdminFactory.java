package za.ac.cput.factory;

import za.ac.cput.domain.Admin;
import za.ac.cput.util.Helper;

public class AdminFactory {
    public static Admin createAdmin(String adminId, String adminName, String email, String adminRole, String password){
        if(Helper.isNullOrEmpty(adminName) || Helper.isNullOrEmpty(adminId) || Helper.isNullOrEmpty(adminRole)){
            return null;
        }

        if (!Helper.isValidEmail(email)){
            return null;
        }
        if(!Helper.isPasswordValid(password)){
            return null;
        }


        return new Admin.Builder()
                .setAdminId(adminId)
                .setAdminName(adminName)
                .setEmail(email)
                .setAdminRole(adminRole)
                .setPassword(password)
                .build();
    }

}

package za.ac.cput.factory;

import za.ac.cput.domain.Admin;
import za.ac.cput.util.Helper;

public class AdminFactory {
    public static Admin createAdmin(String id, String name, String email,String role, String password){
        if(Helper.isIdValid(id)){
            return null;
        }
        if(Helper.isNullOrEmpty(name)){
            return null;
        }
        if(Helper.isEmailValid(email)){
            return null;
        }
        if(Helper.isAdminRoleValid(role)){
            return null;
        }
        if(Helper.isPasswordValid(password)){
            return null;
        }
        return new Admin.Builder()
                .setAdminId(id)
                .setAdminName(name)
                .setAdminEmail(email)
                .setAdminRole(role)
                .setPassword(password)
                .build();
    }
}

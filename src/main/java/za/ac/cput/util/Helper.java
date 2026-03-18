package za.ac.cput.util;

public class Helper {
    public static boolean isIdValid(String id) {
        String regex = "^\\d{7}$";
        if (id != null && id.matches(regex)) {
            return true;
        }
        return false;
    }

    public static boolean isNullOrEmpty(String str) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isEmailValid(String email) {
        String regex = "^[Z-zA-a0-9+_.-]+@[Z-zA-a0-9+_.-]+$";
        if(email != null && regex.matches(email)){
            return true;
        }
        return false;
    }
    public static boolean isAdminRoleValid(String admin){
        if(admin != null && admin.equalsIgnoreCase("ADMIN")){
            return true;
        }
        return false;
    }
    public static boolean isPasswordValid(String password){
        String regex = "^([?=.*[a-z][!=.*[A-Z](?=.*\\d)(?=.*[!@#$%^&*=+]){8}+#";
        if( password != null && password.matches(password)){
            return true;
        }
        return false;
    }
}
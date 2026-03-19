package za.ac.cput.util;
public class Helper {
    public static boolean isNullOrEmpty(String str) {
        if ((str == null) || (str.isEmpty())) {
            return true;
        }
        return false;
    }

    public static boolean isValidLicenseNum(String license) {
        // Example: Must start with RN, followed by 5-6 digits
        // Example Valid: RN123456, RN98765
        String regex = "^RN\\d{5,6}$";
        return license != null && license.matches(regex);
    }

    public static boolean isValidPhoneNumber(String phone) {
        // Simple regex: 10 digits, optional hyphens/spaces, optionally starts with 1
        String regex = "^\\d{10}$"; // Example: 1234567890

        // Alternative regex for (123) 456-7890 or 123-456-7890
        // String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";

        return phone.matches(regex);

    }

    public static boolean isPasswordValid(String password){
        String regex = "^([?=.*[a-z][!=.*[A-Z](?=.*\\d)(?=.*[!@#$%^&*=+]){8}+#";
        if( password != null && password.matches(password)){
            return true;
        }
        return false;
    }}

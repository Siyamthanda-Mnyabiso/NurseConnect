package za.ac.cput.util;



import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import org.apache.commons.validator.routines.EmailValidator;
import org.apache.commons.validator.routines.RegexValidator;

import java.time.LocalTime;

public class Helper {
  
    public static boolean isValidHospitalId(String hospitalId) {
        RegexValidator validator = new RegexValidator("^H[0-9]{3}$");// takes pattern of chosen validation
        return validator.isValid(hospitalId);
    }
  
  
    public static boolean isNullOrEmpty(String str) {
        if ((str == null) || (str.isEmpty())) {
            return true;
        }
        return false;
    }

    public static boolean isValidEmail(String email) {
        EmailValidator validator = EmailValidator.getInstance();
        return validator.isValid(email);
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

    public static boolean isAfter(LocalTime end){
        LocalTime start;
        if(!end.isAfter(start)){
            return false;
        }
        return true;
    }

    public static boolean isBeforeShiftDate(LocalDate shiftDate){
        if(shiftDate.isBefore(LocalDate.now)){
            return false;
        }
        return true;
    }
}

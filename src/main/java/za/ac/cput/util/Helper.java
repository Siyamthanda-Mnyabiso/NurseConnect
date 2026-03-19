package za.ac.cput.util;

import org.apache.commons.validator.routines.EmailValidator;
import org.apache.commons.validator.routines.RegexValidator;

public class Helper{

    public static boolean isValidHospitalId(String hospitalId) {
        RegexValidator validator = new RegexValidator("^H[0-9]{3}$");// takes pattern of chosen validation
        return validator.isValid(hospitalId);
    }




}
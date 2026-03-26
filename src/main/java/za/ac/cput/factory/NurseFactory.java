package za.ac.cput.factory;

import za.ac.cput.domain.Nurse;
import za.ac.cput.util.Helper;

public class NurseFactory {
    public static Nurse createNurse (String NurseID, String FirstName, String LastName, String Email, String PhoneNumber, String Address, String Qualification, String Specialization, String YearsOfExperience, boolean AvailabilityStatus, String LicenseNumber ){
        if (Helper.isNullOrEmpty(NurseID) || Helper.isNullOrEmpty(FirstName)|| Helper.isNullOrEmpty(LastName) || Helper.isNullOrEmpty(Address) ||  Helper.isNullOrEmpty(Qualification) || Helper.isNullOrEmpty(Specialization) || Helper.isNullOrEmpty(YearsOfExperience)){
            return null;
        }

        if (!Helper.isValidEmail(Email)){
            return null;
        }



        if (!Helper.isValidPhoneNumber(PhoneNumber)){
            return null;
        }


        if (!Helper.isValidLicenseNum(LicenseNumber)){
            return null;
        }



        return new Nurse.Builder()
                .setNurseID(NurseID)
                .setAddress(Address)
                .setFirstName(FirstName)
                .setLastName(LastName)
                //.setEmail(Email)
                .setQualification(Qualification)
                .setSpecialization(Specialization)
                .setYearsOfExperience(YearsOfExperience)
                .setLicenseNumber(LicenseNumber)
                .setPhoneNumber(PhoneNumber)
                .setAvailabilityStatus(AvailabilityStatus)
                .build();
    }
}

package za.ac.cput.factory;

import za.ac.cput.domain.Hospital;
import za.ac.cput.util.Helper;


public class HospitalFactory {

    public static Hospital createHospital(String hospitalId,String hospitalName,String address,String contactEmail,String city,String contactPerson,String facilityType,String contactPhone){
        if (Helper.isNullOrEmpty(hospitalId)|| Helper.isNullOrEmpty(hospitalName) ||Helper.isNullOrEmpty(address)|| Helper.isNullOrEmpty(contactEmail)|| Helper.isNullOrEmpty(city)|| Helper.isNullOrEmpty(contactPerson) || Helper.isNullOrEmpty(facilityType)|| Helper.isNullOrEmpty(contactPhone)){
            return null;
        }

        if(!Helper.isValidHospitalId(hospitalId)){
            return null;

        }

        if(!Helper.isValidPhoneNumber(contactPhone)){
            return null;
        }

        return new Hospital.Builder().setHospitalId(hospitalId)
                .setHospitalName(hospitalName)
                .setCity(city)
                .setAddress(address)
                .setContactPerson(contactPerson)
                .setContactPhone(contactPhone)
                .setContactEmail(contactEmail)
                .setFacilityType(facilityType)
                .build();

    }

}
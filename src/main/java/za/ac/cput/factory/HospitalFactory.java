package za.ac.cput.factory;

import za.ac.cput.domain.Hospital;
import za.ac.cput.util.Helper;


public class HospitalFactory {

    public static Hospital createHospital(String hospitalId,String hospitalName,String address,String contactEmail,String City,String contactPerson,String facilityType,String contactPhone){
        if (Helper.isNullorEmpty(hospitalId)|| Helper.isNullorEmpty(hospitalName) ||Helper.isNullorEmpty(address)|| Helper.isNullorEmpty(contactEmail)|| Helper.isNullorEmpty(city)|| Helper.isNullorEmpty(contactPerson) || Helper.isNullorEmpty(facilityType)|| Helper.isNullorEmpty(contactPhone)){
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
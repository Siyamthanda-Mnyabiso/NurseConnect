// HospitalRepository.java
// Author : Luxolo Matshikiza (219098751)
// Date : 20 March 2026


package za.ac.cput.repository;

import za.ac.cput.domain.Hospital;
import java.util.ArrayList;
import java.util.List;

// used for create, read, delete, getAll for database
public class HospitalRepository implements IHospitalRepository {

    private static IHospitalRepository repository = null;
    private List<Hospital> hospitalList;

    private HospitalRepository() {
        hospitalList = new ArrayList<>();
    }

    public static IHospitalRepository getRepository() {
        if (repository == null) {
            repository = new HospitalRepository();
        }
        return repository;
    }

    @Override
    public Hospital create(Hospital hospital) {
        boolean success = hospitalList.add(hospital);
        if (success) {
            return hospital;
        }
        return null;
    }

    @Override
    public Hospital read(String hospitalId) {
        for (Hospital hospital : hospitalList) {
            if (hospital.getHospitalId().equals(hospitalId)) {
                return hospital;

            }

        } return null;

        // using lambda
        // public Hospital read(String hospitalId) {
        //    return hospitalList.stream()
        //            .filter(hospital -> hospital.getHospitalId().equals(hospitalId))
        //            .findFirst()
        //            .orElse(null);
        // }
    }

    @Override
    public Hospital update(Hospital hospital) {
        String id = hospital.getHospitalId();
        Hospital oldHospital = read(id);
        if (oldHospital == null) {
            return null;
        }

        boolean success = hospitalList.remove(oldHospital);
        if (!success) {
            return null;
        }
        if (hospitalList.add(hospital)) {
            return hospital;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Hospital hospitalToDelete = read(id);
        if (hospitalToDelete == null) {
            return false;
        }
        return (hospitalList.remove(hospitalToDelete));
    }

    @Override
    public List<Hospital> getAll() {
        return hospitalList;
    }
}

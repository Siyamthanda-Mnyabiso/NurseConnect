package za.ac.cput.repository;

import za.ac.cput.domain.Nurse;

import java.util.ArrayList;
import java.util.List;

public class NurseRepository implements INurseRepository {

    public static INurseRepository repository = null;
    private List<Nurse> nurseList;

    private NurseRepository(){
        nurseList = new ArrayList<>();
    }

    public static INurseRepository getRepository(){
        if (repository == null){
            repository = new NurseRepository();
        }
        return repository;
    }


    @Override
    public Nurse create(Nurse nurse) {
        boolean success = nurseList.add(nurse);
        if (success){
            return nurse;
        }
        return null;
    }

    @Override
    public Nurse read(String NurseID) {
        for (Nurse nurse : nurseList){
            if (nurse.getNurseID().equals(NurseID)){
                return nurse;
            }
        }
        return null;

        //hmk do this with lamda expressions
    }

    @Override
    public Nurse update(Nurse nurse) {
        String id = nurse.getNurseID();
        Nurse oldNurse = read(id);
        if (oldNurse == null){
            return null;
        }

        boolean succsess = nurseList.remove(oldNurse);
        if(!succsess){
            return null;
        }
        if (nurseList.add(nurse)){
            return nurse;
        }
        return null;

    }

    @Override
    public boolean delete(String id) {
        Nurse nurseToDelete = read(id);
        if (nurseToDelete == null) {
            return false;
        }
        return (nurseList.remove(nurseToDelete));
    }

    @Override
    public List<Nurse> getAll() {
        return nurseList;
    }


    //CRUD

    //CREAT
    //READ
    //UPDATE
    //DELETE
}

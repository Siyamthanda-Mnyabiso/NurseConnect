package za.ac.cput.repository;

import za.ac.cput.domain.Shift;

import java.util.ArrayList;
import java.util.List;

public class ShiftRepository implements IShiftRepository {

    private static IShiftRepository repository = null;
    private List<Shift> shiftList;

    private ShiftRepository(){
        shiftList = new ArrayList<>();
    }

    public static IShiftRepository getRepository(){
        if (repository == null){
            repository = new ShiftRepository();
        }
        return repository;
    }

    @Override
    public Shift create(Shift shift) {
        boolean success = shiftList.add(shift);
        if (success){
            return shift;
        }
        return null;
    }

    @Override
    public Shift read(String shiftId) {
        for (Shift shift : shiftList){
            if (shift.getShiftId().equals(shiftId)){
                return shift;
            }
        }
        return null;

    }

    @Override
    public Shift update(Shift shift) {
        String id = shift.getShiftId();
        Shift oldShift = read(id);

        if (oldShift == null){
            return null;
        }

        boolean success = shiftList.remove(oldShift);
        if (!success){
            return null;
        }

        if (shiftList.add(shift)){
            return shift;
        }

        return null;
    }

    @Override
    public boolean delete(String shiftId) {
        Shift shiftToDelete = read(shiftId);

        if (shiftToDelete == null){
            return false;
        }

        return shiftList.remove(shiftToDelete);
    }

    @Override
    public List<Shift> getAll() {
        return shiftList;
    }
}
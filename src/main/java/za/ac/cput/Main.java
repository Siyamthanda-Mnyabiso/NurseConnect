package za.ac.cput;

import za.ac.cput.domain.Admin;
import za.ac.cput.domain.Nurse;
import za.ac.cput.factory.AdminFactory;
import za.ac.cput.factory.NurseFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Nurse nurse = NurseFactory.createNurse("999006789", "Sipho", "Maxoli", "sipho_m@gmail.com", "0732967899", "Shop 4, Grand Parade Centre, 11 Adderley St, Foreshore, Cape Town, 8001", "Nursing Science", "Critical Care/ICU Nurse", "5 Years", true, "RN079078");
        System.out.println(nurse);

        Admin admin = AdminFactory.createAdmin("23765434567","Admin new","admin@gmail.com","Admin","Gee124##") ;
        System.out.println(admin);

    }

}
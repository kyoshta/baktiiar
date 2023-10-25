package oop.encapsulation;

public class DoctorMain {
    public static void main(String[] args) {

        Doctor aibolit = new Doctor(45465, "Aibolot", true, true);
        System.out.println(aibolit);
        aibolit.id = 4455665;
        System.out.println(aibolit.isMedicalSecrecy());
        aibolit.setMedicalSecrecy(false);
        System.out.println(aibolit.toDiagnose());
         

    }
}

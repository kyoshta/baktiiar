package oop.encapsulation;

public class Doctor {

    public int id;
    public String name;
    protected boolean education;
    private boolean medicalSecrecy;

    public Doctor(int id, String name, boolean education, boolean medicalSecrecy) {
        this.id = id;
        this.name = name;
        this.education = education;
        this.medicalSecrecy = medicalSecrecy;
    }

    public boolean isMedicalSecrecy() {
        return medicalSecrecy;
    }

    public void setMedicalSecrecy(boolean medicalSecrecy) {
        this.medicalSecrecy = medicalSecrecy;
    }

    public String toTreatPatient(){
        return "injection";
    }
    public String toDiagnose(){
        return "your symptoms";
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", education=" + education +
                ", medicalSecrecy=" + medicalSecrecy +
                '}';
    }
}

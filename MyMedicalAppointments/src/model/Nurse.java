package model;

public class Nurse extends User{
    private String speciality;

    public Nurse(String name, String email) {
        super(name, email);
    }// Fin constructor

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Cruz verde");
        System.out.println("Departamento: Enfermería");
    }

    //GETTERS AND SETTERS
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}//Fin clase

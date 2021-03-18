package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    private String speciality;

    /**
     * Esto es para tener otra forma de construir el objeto, esta comentado en otras clases
     * @param name
     */
    public Doctor(String name, String email){
        super(name, email);
    }//Fin visualización método constructor model.Doctor

    //Getters y Setters de Speciality
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


    //------------------CLASES ANIDADAS------------------------------------------------------

    private ArrayList<AvailableAppointment> availableAppointments= new ArrayList<>();//Primer encuentro con colecciones
    public void addAvailableAppointment(String date, String time){
        availableAppointments.add(new AvailableAppointment(date, time));//Acumula la cita en la colección
    }//Método para añadir citas

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }//Solo devuelve el array que acabamos de hacer

    //Otra Sobreescritura de toString
    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable" + availableAppointments.toString();
    }//Final de sobreescritura toString

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Cruz roja");
        System.out.println("Departamento: Oncología");
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time){//Esto es un constructor
            try {
                this.date= format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            this.time= time;
        }//Fin constructor

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate(String DATE) {
            return date;
        }

        public String getDate(){
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        //Sobreescritura de toString
        @Override
        public String toString() {
            return "Available Appointments \nDate: " + date + "\nTime: " + time;
        }//Fin sobreescritura
    }//Fin clase anidada

}//Fin clase

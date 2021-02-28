package model;

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
        System.out.println("El nombre del doctor asignado es: " + name);

        this.speciality= speciality;
    }//Fin visualización método constructor model.Doctor

    //Getters y Setters de Speciality
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


    //------------------CLASES ANIDADAS------------------------------------------------------

    ArrayList<AvailableAppointment> availableAppointments= new ArrayList<>();//Primer encuentro con colecciones
    public void addAvailableAppointment(Date date, String time) {
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

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time){//Esto es un constructor
            this.date= date;
            this.time= time;
        }//Fin constructor

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
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

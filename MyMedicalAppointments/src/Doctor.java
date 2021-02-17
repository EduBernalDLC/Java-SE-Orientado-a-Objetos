import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id= 0;
    private String name;
    private String speciality;

    /**
     * Aquí estamos visualizando el método constructor
     * Simepre se ejecutará al llamar este método
     */
    Doctor(){
        System.out.println("Contruyendo el objeto Doctor");
    }//Fin visualización método constructor Doctor

    /**
     * Esto es para tener otra forma de construir el objeto, esta comentado en main
     * @param name
     */
    Doctor(String name, String speciality){
        id++;
        System.out.println("El nombre del doctor asignado es: " + name);

        this.name= name;
        this.speciality= speciality;
    }//Fin segunda visualización método constructor Doctor

    //Comportamientos
    /**
     * Método para imprimir el nombre del doctor
     */
    public void showName(){
        System.out.println(name);
    }//Fin método para imprimir el nombre del doctor

    //-----------------------------Otra clase------------------------------------------

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }//Fin método para imprimir el ID

    //------------------CLASES ANIDADAS------------------------------------------------------

    ArrayList<AvailableAppointment> availableAppointments= new ArrayList<>();//Primer encuentro con colecciones
    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new AvailableAppointment(date, time));//Acumula la cita en la colección
    }//Método para añadir citas

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }//Solo devuelve el array que acabamos de hacer

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

    }//Fin clase anidada

}//Fin clase

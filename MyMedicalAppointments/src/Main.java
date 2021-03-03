import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor= new Doctor("Anahí Salgado", "anahi@mail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

        User user= new Doctor("Carlos", "carlos@carlos.com");
        user.showDataUser();

        User userPa= new Patient("Karla", "karla@karla.com");
        userPa.showDataUser();

        User user1= new User("Oscar", "oscar@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Supuesto Doctor\n");
                System.out.println("Hospital: Cruz azul");
                System.out.println("Departamento: Geriatria");
            }//Fin comportamiento clase anónima
        };//Fin clase anónima

        user1.showDataUser();//Implementamos la clase anónima

        ISchedulable iSchedulable= new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }//Fin comportamiento de clase anónima
        };//Fin clase anónima
        
        /*
        for (model.Doctor.AvailableAppointment availableAppointment : myDoctor.availableAppointments){
            System.out.println(availableAppointment + " " + availableAppointment.getTime());
        }//Imprimimos las citas
         */
        //----------------------------------------------------
        System.out.println("");
        Patient patient= new Patient("Alejandra", "alejandra@mail.com");

        System.out.println(patient);






    }//Fin main

}//Fin clase

import model.Doctor;
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

import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor= new Doctor("Anahí Salgado", "anahi@mail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

        /*
        for (Doctor.AvailableAppointment availableAppointment : myDoctor.availableAppointments){
            System.out.println(availableAppointment + " " + availableAppointment.getTime());
        }//Imprimimos las citas
         */
        //----------------------------------------------------
        System.out.println("");
        Patient patient= new Patient("Alejandra", "alejandra@mail.com");

        System.out.println(patient);




    }//Fin main

}//Fin clase

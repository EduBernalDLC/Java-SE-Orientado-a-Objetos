import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        //---------------------------------------------
        //Doctor myDoctor= new Doctor();//Se puede hacer así
        Doctor myDoctor= new Doctor("Anahí Salgado", "Pediatría");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        for (Doctor.AvailableAppointment availableAppointment : myDoctor.availableAppointments){
            System.out.println(availableAppointment + " " + availableAppointment.getTime());
        }//Imprimimos las citas

        //----------------------------------------------------
        System.out.println("");
        Patient patient= new Patient("Alejandra", "alejandra@mail.com");

        System.out.println(patient);




    }//Fin main

}//Fin clase

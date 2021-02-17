import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        /*
        Doctor myDoctor= new Doctor();
        myDoctor.name= "Alejandro López";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);//Otra forma de mostrar el ID
        */

        /**
         * Creamos otro doctor para que incremente el ID
         */
        /*
        Doctor myDoctorDos= new Doctor();
        myDoctor.name= "Oscar U";
        myDoctor.showName();
        myDoctor.showId();
        */

        //showMenu();

        /*
        Doctor myDoctor= new Doctor(name: "Anahí Salgado");
        Segunda opción para construir el objeto
        */

        //-----------------Sobrecarga de métodos y constructores-------------------------------------------
        //Doctor myDoctor= new Doctor();//Se puede hacer así
        Doctor myDoctor= new Doctor("Anahí Salgado", "Pediatría");


        //--------------Encapsulamiento: Modificadores de acceso---------------------------------------------
        Patient patient= new Patient("Alejandra", "alejandra@mail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());

        //----Añadimos cita a un doctor, con las clases anidadas-----------------------------------
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        for (Doctor.AvailableAppointment availableAppointment : myDoctor.availableAppointments){
            System.out.println(availableAppointment + " " + availableAppointment.getTime());
        }//Imprimimos las citas

    }//Fin main

}//Fin clase

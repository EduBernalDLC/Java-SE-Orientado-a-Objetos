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
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        //--------------Encapsulamiento: Modificadores de acceso---------------------------------------------
        Patient patient= new Patient("Alejandra", "alejandra@mail.com");





    }//Fin main

}//Fin clase

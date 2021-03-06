package ui;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu{
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static final String MONTHS[]= {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static void showMenu(){
        System.out.println("\nWelcome to My Appointments");
        System.out.println("Selecciona la opciÃ³n deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    response= 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response= Integer.valueOf(sc.nextLine());

            switch(response){
                case 1:
                    System.out.println("\n::Book an appointment");
                    for(int i= 1; i<4 ; i++){
                        System.out.println(i + ". " + MONTHS[i-1]);
                    }//Fin for
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }

    private static void authUser(int userType){
        //1=Doctor - 2=Paciente

        ArrayList<Doctor> doctors= new ArrayList<>();
        doctors.add(new Doctor("Alejandro Martínez", "alejandro@mail.com"));
        doctors.add(new Doctor("Karen Sosa", "karen@mail.com"));
        doctors.add(new Doctor("Rocío Gómez", "rocio@mail.com"));

        ArrayList<Patient> patients= new ArrayList<>();
        patients.add(new Patient("Anahí Salgado", "anahi@mail.com"));
        patients.add(new Patient("Roberto Rodríguez", "roberto@mail.com"));
        patients.add(new Patient("Carlos Sánchez", "carlos@mail.com"));

        boolean emailCorrect= false;
        do{
            System.out.println("Insert your email: [a@a.com]");
            Scanner sc= new Scanner(System.in);
            String email= sc.nextLine();

            if(userType==1){
                for (Doctor d: doctors){
                    if(d.getEmail().equals(email)){
                        emailCorrect= true;
                        //Obtenemos el usuario logeado
                        doctorLogged= d;
                        //Mostramos el menú del doctor
                    }//fin if
                }//Fin for
            }//Fin if usuarios1

            if(userType==2){
                for (Patient p: patients){
                    if(p.getEmail().equals(email)){
                        emailCorrect= true;
                        //Obtenemos el usuario logeado
                        patientLogged= p;
                        //Mostramos el menú del paciente
                    }//fin if
                }//Fin for
            }//Fin if usuarios2

        }while (!emailCorrect);

    }//Fin authUser

}//Fin clase

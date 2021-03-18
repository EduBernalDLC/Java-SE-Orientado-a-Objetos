package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu{

    public static void showPatientMenu(){
        int response= 0;

        do{
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome: " + UIMenu.patientLogged);
            System.out.println("1. Book an appointment");
            System.out.println("2. My Appointments");
            System.out.println("0. Logout");

            Scanner sc= new Scanner(System.in);
            response= Integer.valueOf(sc.nextLine());

            switch(response){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
                default:
                    System.out.println();
                    break;
            }//Fin switch

        }while(response != 0);

    }//Fin showPatientMenu

    private static void showBookAppointmentMenu(){
        int response= 0;

        do{
            System.out.println(":: Book an appointment");
            System.out.println(":: Select date");

            //Numeración de la lista de fechas
            //Indice de la fecha seleccionada
            //[Doctors]
            // 1.- doctor1
                // - fecha1
                // - fecha2
            // 2.- doctor2
            // 3.- doctor3
            Map<Integer, Map<Integer, Doctor>> doctors= new TreeMap<>();
            int k= 0;

            for(int i= 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++){
                ArrayList<Doctor.AvailableAppointment> availableAppointments= UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();

                Map<Integer, Doctor> doctorAppointments= new TreeMap<>();
                for(int j= 0; j < availableAppointments.size(); j++){
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointments.get(i));

                    doctors.put(Integer.valueOf(k), doctorAppointments);
                }//Fin for j
            }//Fin for i

            Scanner sc= new Scanner(System.in);
            int responseDateSelected= Integer.valueOf(sc.nextLine());

        }while(response != 0);

    }//Fin showBookAppointmentMenu

}//Fin clase

package ui;

import java.util.Scanner;

public class UIDoctorMenu {

    public static void showDoctorMenu(){
        int response= 0;

        do{
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add available appointment");
            System.out.println("2. My scheduled appointments");
            System.out.println("3. Logout");

            Scanner sc= new Scanner(System.in);
            response= Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    UIMenu.showMenu();
                    break;
                default:
                    break;

            }//Fin switch

        }while(response!=0);

    }//Fin método showDoctorMenu

    private static void showAddAvailableAppointmentsMenu(){
        int response=0;

        do{
            System.out.println(" ");
            System.out.println(":: Add available appointment");
            System.out.println(":: Select a Month");

            for (int i= 0; i<3; i++){
                int j= i++;
                System.out.println(j + ". " + UIMenu.MONTHS[i]);
            }//Fin for
            System.out.println("0. Return");

            Scanner sc= new Scanner(System.in);
            response= Integer.valueOf(sc.nextLine());

            if((response > 0) && (response < 4)){
                //1,2,3
                int monthSelected= response;
                System.out.println(monthSelected + ". " + UIMenu.MONTHS[monthSelected]);

                System.out.println("Insert the date available: [dd/mm/yyyy]");
                String date= sc.nextLine();

                System.out.println("Your date is: " + date + "\n1. Correct \n2. Change date");
                
            }else if(response == 0){
                showDoctorMenu();
            }//Fin if else

        }while(response != 0);

    }//Fin método

}//Fin clase

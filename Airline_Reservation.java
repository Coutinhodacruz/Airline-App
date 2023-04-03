package airline;

import java.util.Scanner;

public class Airline_Reservation {

    Scanner scanner = new Scanner(System.in);
    boolean[] seats = new boolean[10];
    int firstClass = 1;
    int economicClass = 6;
    int option;

    public void Airline(){
        System.out.println("Welcome to Coutinho Airline\n");

        for (int count = 1; count <= 10; count++) {
            System.out.print("Were would you like to be seated? (1 = First class and 2 = Second class) ");
            option = scanner.nextInt();

            if (option == 1){
                if (firstClass <= 5){
                    seats[firstClass++] = true;
                    System.out.printf("Your seat number for first class is %d\n ",count);
                }
            }
            if (!seats[economicClass++]){
                System.out.println("Sorry , but first class is full");
                if (economicClass < 10){
                    System.out.println("Would you like to be seated in Economy class ?(1 = yes and 2 = no) ");
                    int selection = scanner.nextInt();
                    if (selection == 1){
                        seats[economicClass++] = true;
                        System.out.printf("You have a seat in the economy class which is seat %d\n",count);
                    }else
                        System.out.print("Next flight leaves in 3 hours!");
                }break;
            }
            else if (option == 2){
                if (economicClass < 10){
                    seats[economicClass++] = true;
                    System.out.printf("Your seat number for economy class is %d\n",count);
                }
            }
            if (!seats[economicClass++]){
                System.out.println("Sorry economy class is full. ");
                if (firstClass <= 4){
                    System.out.println("Would you like to go first class? (1 = yes and 2 = no)");
                    int selection = scanner.nextInt();
                    if (selection == 1){
                        seats[firstClass++] = true;
                        System.out.printf("You have a seat in First Class which is seat: %d\n",count);
                    }else
                        System.out.println("Next flight leaves in 3 hours!");
                }
            }
            
        }
    }
}

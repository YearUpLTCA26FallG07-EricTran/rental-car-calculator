package com.pluralsight;


import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Starting application
        System.out.println("""
                Welcome to Car Rental
                1 - Rent Car
                2 - Exit
                
                """);

        String userSelection = scanner.nextLine();
        if (userSelection == "1") {
            //Creating reservation object
            Reservation newReservation = new Reservation();
            //Asks them for pickup date
            System.out.println("What day would you like to pickup the Car: ");
            String pickUpDate = scanner.nextLine();
            newReservation.setPickUpDate(pickUpDate);

            //Asks them for number of days
            System.out.println("How many days: ");
            int numberOfDays = Integer.parseInt(scanner.nextLine());


        }


    }


}

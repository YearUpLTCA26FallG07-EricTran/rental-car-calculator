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
        if (userSelection.equals("1")) {
            //Creating reservation object
            Reservation newReservation = new Reservation();
            //Asks them for pickup date
            System.out.println("What day would you like to pickup the Car: ");
            String pickUpDate = scanner.nextLine();
            newReservation.setPickUpDate(pickUpDate);

            //Asks them for number of days
            System.out.println("How many days: ");
            int numberOfDays = Integer.parseInt(scanner.nextLine());
            newReservation.setNumberOfDays(numberOfDays);
            
            
            //ask if they want electric toll tag
            System.out.println("Toll tag Y/N: ");
            String tollAnswer = scanner.nextLine();
            boolean acceptsTollTag = tollAnswer.equalsIgnoreCase("Y");
            newReservation.setAcceptsTollTag(acceptsTollTag);

            //ask if they want gps
            System.out.println("GPS Y/N: ");
            String gpsAnswer = scanner.nextLine();
            boolean acceptsGps = gpsAnswer.equalsIgnoreCase("Y");
            newReservation.setAcceptsTollTag(acceptsGps);

            //asks if they want roadside assistance
            System.out.println("RoadSide Assistance Y/N: ");
            String roadSideAnswer = scanner.nextLine();
            boolean acceptsRoadSide = roadSideAnswer.equalsIgnoreCase("Y");
            newReservation.setAcceptsTollTag(acceptsRoadSide);


            //asks for the user age
            System.out.println("Current Age: ");
            int userAge = scanner.nextInt();
            newReservation.setDriverCurrentAge(userAge); 









        }


    }


}

public static double carRentalCalculation(Reservation reservation) {
    double basicRental =
}

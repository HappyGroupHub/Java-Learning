package com.gmail.chiyc88.learning.car;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int hourFees = 60;

        Car car1 = new Car("ABC-123", "07:30");
        Car car2 = new Car("XYZ-888", "10:50");
        Car car3 = new Car("UWU-666", "19:10");

        HashMap<String, String> cars = new HashMap<>();
        cars.put(car1.getId(), car1.getEnterTime());
        cars.put(car2.getId(), car2.getEnterTime());
        cars.put(car3.getId(), car3.getEnterTime());

        System.out.print("Please enter your car's ID: ");
        Scanner scanner = new Scanner(System.in);
        String carID = scanner.next();
        if (cars.get(carID) == null) {
            System.out.println("Car not found.");
        } else {

            String enterTime = cars.get(carID);
            String enterTimeSplit[] = enterTime.split(":");

            Calendar enterTimeFormatted = Calendar.getInstance();
            enterTimeFormatted.set(Calendar.HOUR_OF_DAY, Integer.parseInt(enterTimeSplit[0]));
            enterTimeFormatted.set(Calendar.MINUTE, Integer.parseInt(enterTimeSplit[1]));

            System.out.println("Car ID: " + carID);
            System.out.println("Enter Time: " + enterTimeFormatted.getTime());
            System.out.println();
            System.out.print("Do you want to leave now? (Y/N): ");
            String decide = scanner.next();
            if (decide.equals("N")) {
                System.out.println("Thank you and Good bye.");
            } else if (decide.equals("Y")){
                Calendar nowTime = Calendar.getInstance();
                long msUsed = nowTime.getTime().getTime() - enterTimeFormatted.getTime().getTime();
                long hourUsed = msUsed / (1000 * 60) / 60;
                long fee = hourUsed * hourFees;
                System.out.println("Hours Used: " + hourUsed);
                System.out.println("Fee: " + fee);
            }
        }
    }
}

package com.bridgelabz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class HotelReservation {
    static ArrayList<Hotel> list = new ArrayList<>();
    public static void checkChippestHotelForWeekDay(){
        System.out.println("---Welcome to Hotel Management System---");
        list.add(new Hotel("Lakewood", 3, 110, 90, 80));
        list.add(new Hotel("Bridgewood", 4, 160, 60, 110));
        list.add(new Hotel("Ridgewood", 5, 220, 150, 100));

        System.out.println("*********************************************");
        System.out.println("Chippest Hotel for weekdays:-");

        Optional<Hotel> list1=list.stream().sorted(Comparator.comparing(Hotel::getWeekDayRate)).findFirst();
        System.out.println(list1);
    }
    public static void showHotelDetails() {
        list.forEach(print -> System.out.println(print));

    }
    public static void checkChippestHotelForWeekends(){

        System.out.println("************************************************************");
        System.out.println("Chippest Hotel for  Weekdends:-");

        Optional<Hotel> list1=list.stream().sorted(Comparator.comparing(Hotel::getWeekendRate)).findFirst();
        System.out.println(list1);

    }
    public static void checkBestHotelBaseOnRating() {

        System.out.println("**************************************************************");
        System.out.println("Best Hotel Based on Rating:-");

        Optional<Hotel> list1 = list.stream().sorted(Comparator.comparing(Hotel::getRating)).findFirst();
        System.out.println(list1);
    }
}


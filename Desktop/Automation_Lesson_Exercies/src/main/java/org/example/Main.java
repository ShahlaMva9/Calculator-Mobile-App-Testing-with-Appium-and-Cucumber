package org.example;

import java.util.Random;

public class Main {
    public enum weekDays {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static int randomNumber() {
        Random random = new Random();
        return random.nextInt(7) + 1;
    }

    public static weekDays getDay(int number) {
        switch (number){
            case 1: return weekDays.MONDAY;
            case 2: return weekDays.TUESDAY;
            case 3: return weekDays.WEDNESDAY;
            case 4: return weekDays.THURSDAY;
            case 5: return weekDays.FRIDAY;
            case 6: return weekDays.SATURDAY;
            case 7: return weekDays.SUNDAY;
            default: throw new IllegalArgumentException("Invalid number: " + number);
        }

    }

    public static void printWeekDays() {
        System.out.println("First day of the weekend: " + weekDays.SATURDAY);
        System.out.println("Second day of the weekend: " + weekDays.SUNDAY);
    }

    public static void main(String[] args) {
        printWeekDays();
        int number=randomNumber();
        System.out.println("Number is: " + number);
        System.out.println("Today is: " + getDay(number));
    }
}
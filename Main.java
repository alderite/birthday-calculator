import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Scanner;

public class BirthdayCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numMonthOfBorn = 0;
        System.out.println("enter the month of your birthday");
        String monthOfBorn = sc.next();
        System.out.println("enter the day of your birthday");
        int dayOfBorn = sc.nextInt();
        //awful variable name
        //converting all letters in a string to lower case
        String xyz = monthOfBorn.toLowerCase();

        switch (xyz) {
            //converting month (str), into number of month (int)
            case "january":
                numMonthOfBorn = 1;
                break;
            case "february":
                numMonthOfBorn = 2;
                break;
            case "march":
                numMonthOfBorn = 3;
                break;
            case "april":
                numMonthOfBorn = 4;
                break;
            case "may":
                numMonthOfBorn = 5;
                break;
            case "june":
                numMonthOfBorn = 6;
                break;
            case "july":
                numMonthOfBorn = 7;
                break;
            case "august":
                numMonthOfBorn = 8;
                break;
            case "september":
                numMonthOfBorn = 9;
                break;
            case "october":
                numMonthOfBorn = 10;
                break;
            case "november":
                numMonthOfBorn = 11;
                break;
            case "december":
                numMonthOfBorn = 12;
                break;
            //in case user enters a number it will convert it to a str
            case "1":
                numMonthOfBorn = 1;
                break;
            case "2":
                numMonthOfBorn = 2;
                break;
            case "3":
                numMonthOfBorn = 3;
                break;
            case "4":
                numMonthOfBorn = 4;
                break;
            case "5":
                numMonthOfBorn = 5;
                break;
            case "6":
                numMonthOfBorn = 6;
                break;
            case "7":
                numMonthOfBorn = 7;
                break;
            case "8":
                numMonthOfBorn = 8;
                break;
            case "9":
                numMonthOfBorn = 9;
                break;
            case "10":
                numMonthOfBorn = 10;
                break;
            case "11":
                numMonthOfBorn = 11;
                break;
            case "12":
                numMonthOfBorn = 12;
                break;
        }
        //error handling
        if(dayOfBorn > 31) System.out.println("Invalid date"); else {
            //getting current year
            int currentYear = LocalDate.now().getYear();
            //getting how many days have passed in this year since today
            int currentDate = LocalDate.now().get(ChronoField.DAY_OF_YEAR);
            //getting hoe many days have passed since users birthdays
            int fullBirthday = LocalDate.of(currentYear, numMonthOfBorn, dayOfBorn).get(ChronoField.DAY_OF_YEAR);
            //finding difference
            int output = fullBirthday - currentDate;
            //printing output in nice format
            if (output >= 1) System.out.println("Your birthday is in " + output + " days");
            if (output <= -1) {
                int abs = Math.abs(output);
                System.out.println("Your birthday was " + abs + " days ago");
            }
            if (output == 0) System.out.println("It's your birthday!");
        }
    }
}

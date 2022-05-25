package Lection4;

import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Day of the week?");
        int i = scanner.nextInt();
        //int i=2;

        switch(i)

        {

            case 1:

                System.out.println("Monday " + i + "st");

                break;

            case 2:

                System.out.println("Tuesday "+ i + "nd");

                break;

            case 3:

                System.out.println("Wednesday "+i + "rd");

                break;


            case 4:

                System.out.println("Thursday "+i + "th");

                break;


            case 5:

                System.out.println("Friday "+i+ "th");

                break;

            case 6:

                System.out.println("Saturday "+i+"th");

                break;

            case 7:

                System.out.println("Sunday " + i+ "th ");

                break;


                default:

                System.out.println("Not correct day! ");

        }

    }

}






package Demo;

import java.util.Scanner;

public class Names {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstname = scanner.nextLine();

        System.out.println("Second name: ");
        String middle = scanner.nextLine();

        System.out.println("and last name?: ");
        String last = scanner.nextLine();

        String fullName = firstname + " " + middle + " " + last;
        System.out.println("Name: " + fullName);

       //System.out.println("My Full name is: " + firstname + " " + middle + " " + last);


    }
}

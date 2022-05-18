package Demo;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side a: ");
        Double sideA = scanner.nextDouble();

        System.out.println("Enter side b: ");
        Double sideB = scanner.nextDouble();

        System.out.println("Enter side c: ");
        Double sideC = scanner.nextDouble();

        double result = sideA + sideB + sideC;


        System.out.println("Result is:" + result);





    }
}

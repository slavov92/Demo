package Demo;

import java.util.Scanner;

public class AreaTriangle {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side of triangle: ");
        Double side = scanner.nextDouble();

        System.out.println("Enter height of triangle: ");
        Double height = scanner.nextDouble();

        double result = side * height / 2;

        System.out.println("Area of triangle is: " + result);





    }




}

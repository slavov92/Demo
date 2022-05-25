package Lection4;
import java.util.Scanner;
public class TriangleTypes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter angle A of triangle: ");
        Double angleA = scanner.nextDouble();

        System.out.println("Enter angle B of triangle: ");
        Double angleB = scanner.nextDouble();

        System.out.println("Enter angle C of triangle: ");
        Double angleC = scanner.nextDouble();

        double result = angleA + angleB + angleC;

        if (angleA > 0 && angleB > 0 && angleC > 0) {

            if (result == 180) {
                System.out.println("Angles are with correct values!");

                if (angleA == 90 || angleB == 90 || angleC == 90) {
                    System.out.println("The triangle is right-angled (правоъгълен)!");
                    if ((angleA.equals(angleB)) || (angleA.equals(angleC)) || (angleB.equals(angleC))){
                        System.out.println("The triangle are isosceles (равнобедрен)");
                    }
                } else if (angleA < 90 && angleB < 90 && angleC < 90) {

                    if (angleA == 60 && angleB == 60 && angleC == 60) {
                        System.out.println("Triangle is equilateral (равностранен) !");
                        System.out.println("The triangle is acute (остроъгълен)!");
                    }
                    else  {
                        System.out.println("The triangle is acute (остроъгълен)!");

                        if ((angleA.equals(angleB)) || (angleA.equals(angleC)) || (angleB.equals(angleC))){
                            System.out.println("The triangle is равнобедрен!");
                        }   else if (angleA != angleB && angleA!=angleC && angleB !=angleC){
                            System.out.println("The triangle is multifaceted (разностранен)");
                        }
                    }

                   // System.out.println("The triangle is acute(остроъгълен)!");
                } else if (angleA > 90 || angleB > 90 || angleC > 90){

                    if ((angleA.equals(angleB)) || (angleA.equals(angleC)) || (angleB.equals(angleC))){
                        // не става със "=="
                        System.out.println("The triangle is 'obtuse'(тъпоъгълен)!");
                        System.out.println("The triangle is равнобедрен!");
                    }
                    else if (angleA != angleB && angleA!=angleC && angleB !=angleC){
                        System.out.println("The triangle is multifaceted (разностранен)");
                    }
                    else {
                        System.out.println("The triangle is 'obtuse'(тъпоъгълен)!");
                    }

                }


            } else if (result > 180) {
                System.out.println("Sum of angles is more than 180 degree, include new values!");
            } else if (result < 180) {
                System.out.println("Sum of angles is less than 180 degree, include new values!");
            }


        }
        else {

            System.out.println("Include positive values!");
        }
    }
}

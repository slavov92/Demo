package Lection5;

public class ArrayExample {
    public static void main(String[] args) {

        String[] carBrands = {"Audi", "Bmw", "Volvo", "Mercedes", "Porsche", "Dodge", "Seat"};

        int[] evenNumbers = {2, 4, 6, 8, 10};

        double[] degrees = {0, 0.5, 1, 1.5, 2, 2.5};

        System.out.println(carBrands[0]);
        System.out.println(carBrands[6]);

        System.out.println(evenNumbers[2]);

        System.out.println(degrees[5]);

        System.out.println(carBrands.length);

        System.out.println(evenNumbers.length);

        System.out.println(degrees.length);


        String[] cars = new String[3];

        cars[0] = "Volvo";

        cars[1] = "Bmw";

        cars[2] = "Mercedes";

        System.out.println(cars[2]);

    }

}

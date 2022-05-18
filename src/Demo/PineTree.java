package Demo;

import java.util.Scanner;

public class PineTree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How big is your tree?");
        int x = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < x; i++){
            for (int j = 0; j < x - i; j++)
                System.out.print(" ");
            for (int k=0; k < (2* i + 1); k++)
                System.out.print("*");
            System.out.println();
        }




    }




}

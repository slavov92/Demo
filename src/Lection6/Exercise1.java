package Lection6;

public class Exercise1 {

    public static void main(String[] args) {


        findSmallestNumber(11,11,-13);
        findSmallestNumber(9000,2000993,333);


    }


    public static void findSmallestNumber (int x, int y, int z){
        if (x <= y && x <= z) {
            System.out.println("The smallest number is: "+x);
        }
        else if(y <= x && y <= z){
            System.out.println("The smallest number is: "+y);
        }
        else {
            System.out.println("The smallest number is: "+z);
        }



    }



}

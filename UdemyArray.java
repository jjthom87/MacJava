import java.util.Scanner;

public class UdemyArray {

    static void arrays() {
        System.out.println("\nInside arrays ...");
        int[] myArray = new int[]{9, 11, 2, 5, 4, 4, 6};
        System.out.println("myArray.length " + myArray.length);
        System.out.println("myArray[1] " + myArray[1]);
        System.out.println("myArray[7] " + myArray[7]);

    }

    static void threeDimensionalArrays() {
        System.out.println("\nInside threeDimensionalArrays ...");
        int[][][] unitsSold = new int[][][] {
            { //New York
                {0,0,0,0}, //jan
                {0,0,0,0}, //feb
                {0,0,0,0}, //mar
                {0,850,0,0} //apr
            },
            { //San Francisco
                {0,0,0,0}, //jan
                {0,0,0,0}, //feb
                {0,0,0,0}, //mar
                {0,0,0,0} //apr  
            },
            {
                {0,0,0,0}, //jan
                {0,0,0,0}, //feb
                {0,0,0,0}, //mar
                {0,0,0,0} //apr  
            },
            {
                {0,0,0,0}, //jan
                {0,0,0,0}, //feb
                {0,0,0,0}, //mar
                {0,0,0,0} //apr  
            }
        };
        System.out.println("unitsSold[0][3][1]: " + unitsSold[0][3][1]);
    }

    public static void main(String[] args){
        // arrays();
        threeDimensionalArrays();
    }

}
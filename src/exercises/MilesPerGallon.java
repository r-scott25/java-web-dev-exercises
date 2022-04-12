package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?  ");
        Integer miles = input.nextInt();
        System.out.println("How many gallons of gas have you consumed?  ");
        Integer gallonsOfGas = input.nextInt();
        int mpg = miles/gallonsOfGas;
        System.out.println("Miles-Per-Gallon = " + mpg);
    }
}

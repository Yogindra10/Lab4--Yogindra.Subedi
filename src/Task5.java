import java.util.Scanner;

public class Task5 {
    static void main(String[] args) {
        //Variables
        double tempF;
        double tempC;
        Scanner scan = new Scanner(System.in);

        //Inputs
        System.out.println("What is your temperature in Fahrenheit?");
        tempF = scan.nextDouble();

        //calculations
        tempC = (tempF - 32) * ((double) 5/9);

        //outputs
        System.out.println("A temperature of " + tempF + " degree Fahrenheit is equal to a temperature of " + tempC + " degrees Celsius");


    }
}

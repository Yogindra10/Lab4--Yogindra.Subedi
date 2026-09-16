import java.util.Scanner;

public class Task2 {
    static void main(String[] args) {
        //Variables
        Scanner scan = new Scanner(System.in);
        double price;
        double priceTotal;

        //input
        System.out.println("Enter the price of your item");
        price = scan.nextDouble();

        //calculations
        priceTotal = (price * .05);

        //outputs

        System.out.println("The total price of your item including sales tax is " + priceTotal);




    }
}
import java.util.Scanner;

public class Task3 {
    static void main(String[] args) {
        //variables
        double summerCost;
        double fallCost;
        double winterCost;
        double springCost;
        double yearlyCost;
        Scanner scan = new Scanner(System.in);

        //input
        System.out.println("Enter the maintenance cost for Summer");
        summerCost = scan.nextDouble();
        System.out.println("Enter the maintenance cost for Fall");
        fallCost = scan.nextDouble();
        System.out.println("Enter the maintenance cost for Winter");
        winterCost = scan.nextDouble();
        System.out.println("Enter the maintenance cost for Spring");
        springCost = scan.nextDouble();

        //calculations
        yearlyCost = (summerCost + winterCost + fallCost + springCost);

        //output
        System.out.println("Your yearly maintenance cost is " + yearlyCost);
    }
}

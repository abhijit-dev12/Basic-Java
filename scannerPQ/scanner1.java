package scannerPQ;

import java.util.Scanner;

public class scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bike name: ");
String name = sc.nextLine();

System.out.println("Enter the price: ");
double price = sc.nextDouble();

System.out.println("Enter the mileage: ");
int mileage = sc.nextInt();

System.out.println("Bike: "+name+"\nPrice: "+price+"\nMileage: "+mileage+" kmpl");
    }
}

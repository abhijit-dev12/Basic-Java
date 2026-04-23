import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Your name: ");
	String name = sc.nextLine();

	System.out.println("Enter your Age: ");
	int age = sc.nextInt();

	System.out.println("Hey " +name + " you are " +age + " years old ");
    }
}

//import scanner
import java.util.Scanner;

public class LargestSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input array size
        int n = sc.nextInt();

        //create array
        int arr[] = new int[n];

        //input array elements
        for(int i = 0; i < n; i++){
            arr[i] =sc.nextInt();
        }

        //initialize largest and smallest variables
        int largest = arr[0];
        int smallest = arr[0];

        //main logic
        for(int i = 0; i < n; i++) {
            if(arr[i] > largest) { //largest element is updated if current element is greater than largest
                largest = arr[i];
            }
            if(arr[i] < smallest) { //smallest element is updated if current element is smaller than smallest
                smallest = arr[i];
            }
        }
        //print output
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);

    }
}

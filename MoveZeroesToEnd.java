import java.util.Scanner;  //import Scanner
public class MoveZeroesToEnd { //class
    public static void main(String[] args){ //main function
        Scanner sc = new Scanner(System.in); //Scanner object

        int n = sc.nextInt(); //size of array

        int arr[] = new int [n]; //create an array

        for(int i = 0; i < n; i++) //input loop
        {
            arr[i] = sc.nextInt();
        }

        int index = 0;  //create index variable to keep track of non-zero elements

        for(int i = 0; i < n; i++) //Main logic to move zero to end
        {
            if(arr[i] != 0) //if condition to check if element is non-zero
            {
                arr[index] = arr[i]; //if non-zero number pushes forward
                index++;
            }
        }
        while(index < n)
        {
            arr[index] = 0;
            index++;
        }

        for(int i = 0; i < n; i++)
                    {
            System.out.print(arr[i] + " ");
        }
    }
}

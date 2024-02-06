package Assignment2P2;
import java.util.Scanner;

public class input {
    Scanner sc = new Scanner(System.in);
    public int totalNumber()
    {
        System.out.print("How many number do you want to enter: ");

        return sc.nextInt();
    }
    public int[] inputNumbers(int totalNums)
    {
        int[] arr = new int[totalNums];

        for(int i=0; i<totalNums;i++)
        {
            System.out.print("Enter your number: ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }
}

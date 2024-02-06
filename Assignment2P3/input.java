package Assignment2P3;
import java.util.ArrayList;
import java.util.Scanner;

public class input {
    Scanner sc = new Scanner(System.in);

    public int totalNumber()
    {
        System.out.print("How many number do you want to enter: ");

        return sc.nextInt();
    }
    public int[] arrayInput(int totalNums)
    {
        int[] arr = new int[totalNums];

        for(int i=0; i<totalNums;i++)
        {
            System.out.print("Enter your number: ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public ArrayList<Integer> arrayListInput(int totalNums)
    {
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        for(int i=0; i<totalNums;i++)
        {
            System.out.print("Enter your number: ");
            arrList.add(sc.nextInt());
        }

        return arrList;
    }
}

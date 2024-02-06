package Assignment2P3;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        input inp = new input();
        converter cnv = new converter();

        System.out.print("Which operation do you want to perform\n1) Array to ArrayList\n2) ArrayList to Array\n=");
        int choice = sc.nextInt();

        int totalNumbers = inp.totalNumber();

        if (choice == 1)
        {
            int[] arr = inp.arrayInput(totalNumbers);
            ArrayList<Integer> convt_arrList = cnv.arrayTOarrayList(arr);
            System.out.println("\nThe type in which data is stored when input: "+arr.getClass().getSimpleName());
            System.out.println("The type after conversion: "+convt_arrList.getClass().getSimpleName()+"\n\nArrayList: ");

            for (Integer integer : convt_arrList) {
                System.out.println(integer);
            }
        }

        else if (choice == 2)
        {
            ArrayList<Integer> arrlist = inp.arrayListInput(totalNumbers);
            Integer[] convt_arr = cnv.arrayListTOarray(arrlist);
            System.out.println("\nThe type in which data is stored when input: "+arrlist.getClass().getSimpleName());
            System.out.println("The type after conversion: "+convt_arr.getClass().getSimpleName()+"\n\nArray: ");

            for (Integer integer : convt_arr) {
                System.out.println(integer);
            }
        }

        else{
            System.out.println("Invalid Option");
        }
    }
}

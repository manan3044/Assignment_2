package Assignment2P2;

public class Main {

    private static void print(int[] arr, int count)
    {
        for (int i=0;i <count; i++)
        {
            System.out.println(""+arr[i]);
        }
    }

    public static void main(String[] args) {
        input inp = new input();
        distance dis = new distance();

        int totalNumbers = inp.totalNumber();

        int[] arr = inp.inputNumbers(totalNumbers);

        System.out.println("\nThe array you entered: ");
        print(arr, totalNumbers);

        int[] distanceArr = dis.distanceBetween(arr, totalNumbers);

        System.out.println("\nDistance between neighbouring element: ");
        print(distanceArr, totalNumbers-1);

        int min = dis.minDistance(distanceArr, totalNumbers);

        System.out.println("\nThe index of the first number with least distance with neighbor = "+min);
    }
}
package Assignment2P1;

public class Main {
    private static void print(float[] arr, int count)
    {
        for (int i=0;i <count; i++)
        {
            System.out.println(""+arr[i]);
        }
    }

    public static void main(String[] args) {
        input inp = new input();
        numCheck check = new numCheck();

        int totalNumbers = inp.totalNumber();
        int evenCount=0, oddCount=0;

        float[] even = new float[totalNumbers];
        float[] odd = new float[totalNumbers];

        for(int i=0; i<totalNumbers; i++)
        {
            float number = inp.inputNumber();

            String numType = check.checker(number);
            if (numType.equals("Even"))
            {
                even[evenCount] = number;
                evenCount++;
            }

            else
            {
                odd[oddCount] = number;
                oddCount++;
            }
        }
        System.out.println("Even Numbers: ");
        print(even, evenCount);

        System.out.println("\nOdd Numbers: ");
        print(odd, oddCount);
    }
}

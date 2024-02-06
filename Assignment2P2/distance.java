package Assignment2P2;

public class distance {
    public int[] distanceBetween(int[] arr, int totalNums)
    {
        int[] dist = new int[totalNums-1];

        for(int i=0; i<totalNums-1; i++)
        {
            dist[i] = arr[i] - arr[i+1];
            dist[i] = Math.abs(dist[i]);
        }

        return dist;
    }

    public int minDistance(int[] distArr, int totalNums)
    {
        int minimumIndex = 0;
        int minimumDistance = distArr[0];

        for(int i=0; i<totalNums-1; i++)
        {
            if ((distArr[i] < minimumDistance))
            {
                minimumIndex = i;
            }
        }

        return minimumIndex;
    }
}

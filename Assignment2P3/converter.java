package Assignment2P3;

import java.util.ArrayList;

public class converter {
    public Integer[] arrayListTOarray(ArrayList<Integer> arrlist)
    {
        return arrlist.toArray(new Integer[0]);
    }

    public ArrayList<Integer> arrayTOarrayList(int[] arr)
    {
        ArrayList<Integer> converted_arrlist = new ArrayList<>();

        for(int i: arr)
        {
            converted_arrlist.add(i);
        }

        return converted_arrlist;
    }
}

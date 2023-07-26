package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondSmallestNumber {
    public static void main(String[] args){

        Integer[] arr = {1,4,3,5,2};
        List<Integer> arrlist = Arrays.asList(arr);
        Integer result = arrlist.stream().sorted(Comparator.naturalOrder()).limit(2).skip(1).findFirst()
                .get();
        System.out.println(result);

        // if  list contains duplicate value
        //natural sorting means lowest to highest
        Integer[] arr1 = {2,5,3,1,5,9};
        List<Integer> arrayList = Arrays.asList(arr1);
        Integer output = arrayList.stream().distinct().sorted(Comparator.naturalOrder()).limit(2).skip(1).findFirst().get();
        System.out.println(output);
    }
}

package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumber {
    public static void main(String[] args){
        Integer[] arr = {1,3,5,33,22,88};
        List<Integer> list = Arrays.asList(arr);
        Integer result = list.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();
        System.out.println(result);
    }
}

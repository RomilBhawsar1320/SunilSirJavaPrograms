package MultiThreading;

import java.util.Arrays;
import java.util.List;

public class MaxNumStream {

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9};

        List<Integer> maxList= Arrays.asList(arr);

        int max = maxList.stream().reduce(Integer.MIN_VALUE, Integer :: max);    

        System.out.println(max);
    
    
    }
    
}

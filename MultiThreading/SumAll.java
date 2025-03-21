package MultiThreading;

import java.util.Arrays;
import java.util.List;


public class SumAll {

    public static void main(String[] args) {
        
        Integer[] arr = {1,2,3,4,5,6,7,8,9};

        List<Integer> sumList= Arrays.asList(arr); 

        int sum = sumList.stream().reduce(0,Integer :: sum);

        System.out.println(sum);



    }
    
}

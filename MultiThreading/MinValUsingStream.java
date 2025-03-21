package MultiThreading;

import java.util.Arrays;
import java.util.List;

public class MinValUsingStream {

    public static void main(String[] args) {
        
        List<Integer> myList = Arrays.asList(1,2,32,21,2,12,23,2,0,12,212,212,23,434);

        int minValue = myList.stream().reduce(Integer.MAX_VALUE, Integer :: min);

        System.out.println(minValue);

    }
    
}

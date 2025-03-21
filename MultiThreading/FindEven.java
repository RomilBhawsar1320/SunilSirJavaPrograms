package MultiThreading;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEven {

    public static void main(String[] args) {
        
        Integer[] arr = {12,2,12,3,4,4,5,65,1,2,3,4,4,4};

        List<Integer> myList = Arrays.asList(arr);

         List<Integer> evenList = myList.stream().filter(n -> n%2==0).collect(Collectors.toList());

         System.out.println(evenList);
        

    }
    
}

package MultiThreading;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStream {

    public static void main(String[] args) {
        
        Integer[] arr = {1,2,4,12,23,3,4343,53,5355,66,77,88,99};

        List<Integer> sortedList = Arrays.asList(arr).stream().sorted().collect(Collectors.toList());

        System.out.println(sortedList);



    }
    
}

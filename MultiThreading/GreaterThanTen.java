package MultiThreading;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GreaterThanTen {

    public static void main(String[] args) {

        Integer[] arr = {21,3,1,12,2,12,3,3,2,3,232,434,34};

        List<Integer> greterten = Arrays.asList(arr).stream().filter(n -> n >10).collect(Collectors.toList());

        System.out.println(greterten);



    }
    
}

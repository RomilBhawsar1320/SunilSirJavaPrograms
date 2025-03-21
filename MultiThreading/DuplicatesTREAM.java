package MultiThreading;

import java.util.Arrays;
import java.util.stream.Collectors;



public class DuplicatesTREAM {

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,3,2,42,2,1};

        Arrays.stream(arr).collect(Collectors.groupingBy(i -> i , Collectors.counting()))
                                        .entrySet().stream().filter(e -> e.getValue() > 1).forEach( ant -> System.out.println(ant.getKey()) );

        //List<Integer> duplicateElements = duplicate.entrySet().filter(entry -> entry.getValue()>1).collect(Collectors.toList());

        //duplicate.entrySet().stream().filter(e -> e.getValue()>1).forEach(e -> System.out.println("duplicate elements are :"+e.getKey()+" frequency are "+e.getValue()));


    




      
    }
    
}

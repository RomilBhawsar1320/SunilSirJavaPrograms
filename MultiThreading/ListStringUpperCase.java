package MultiThreading;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListStringUpperCase {

    public static void main(String[] args) {

    List<String> stringList = Arrays.asList("romil","priyanshi","garima","abhinav","aman");

    List<String> stringUpperCaseList = stringList.stream().map(String ::toUpperCase ).collect(Collectors.toList());

    System.out.println(stringUpperCaseList);
        
    }

    
}

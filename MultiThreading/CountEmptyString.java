package MultiThreading;

import java.util.Arrays;
import java.util.List;

public class CountEmptyString {

    public static void main(String[] args) {
        List<String> strList = Arrays.asList("abc","","dghg","gfhgf","fhgf","");

        long count = strList.stream().filter(s -> s.equals("")).count();

        System.out.println(count);


    }
    
}

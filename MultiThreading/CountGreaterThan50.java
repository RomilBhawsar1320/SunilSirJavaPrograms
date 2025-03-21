package MultiThreading;

import java.util.Arrays;
import java.util.List;

public class CountGreaterThan50 {

    public static void main(String[] args) {
        
        List<Integer> myList = Arrays.asList(12,32,43,66,77,88,99,88,777,965,45,456,345,234);

        long greater = myList.stream().filter(n -> n>50).count();

        System.out.println(greater);

    }
    
}

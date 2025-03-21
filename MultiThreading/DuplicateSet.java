package MultiThreading;

import java.util.HashSet;

public class DuplicateSet {

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,2,3,2,3,4};

        HashSet <Integer> dupset = new HashSet<>();
        HashSet <Integer> dupsetres = new HashSet<>();

    
        for(int i=0; i<arr.length; i++){

            if(!dupset.add(arr[i])){
                //System.out.println("duplicate elements are :"+arr[i]);
                dupsetres.add(arr[i]);

            }
        }

        dupsetres.forEach(s -> System.out.println(s));

    }
    
}

package MultiThreading;

interface Calculator{
    int operation(int a , int b);
}


public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        Calculator addition = (a,b) -> a +b ;
        Calculator substraction = (a,b) -> a-b;
        Calculator multiplication = (a,b) -> a*b;
        Calculator division = (a,b) ->a/b;

        System.out.println(addition.operation(5, 6));
        System.out.println(substraction.operation(5, 2));
        System.out.println(multiplication.operation(3, 4));
        System.out.println(division.operation(10,2));


        

    }
    
}

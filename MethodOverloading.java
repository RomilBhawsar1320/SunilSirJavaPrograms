class Overloading{

    public int add(int a , int b){
        return a+b;
    }

    public int add(int a , int b , int c){
        return a+b+c;
    }
}



public class MethodOverloading {
    
    public static void main(String[] args) {
        
        Overloading obj = new Overloading();

        System.out.println(obj.add(2, 4));
        System.out.println(obj.add(2, 3, 4));
        
    }

}


class A{
    public void show(){
        System.out.println("A show() called");
    }
}

class B extends A{

    @Override
    public void show(){
        System.out.println("B show() called");
    }
}
class C extends B{
    @Override
    public void show(){
        System.out.println("C show() called");
    }
}

public class MethodOverriding{

    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        obj = new B();
        obj.show(); // THIS ONE OBJECT IS SHOWING DIFFERENT BEHAVIOR
        obj = new C();
        obj.show();  // THIS ONE OBJECT IS SHOWING DIFFERENT BEHAVIOR

        // BASE CLASS REFERENCE CAN BE POINTED TO ANY DERIVED CLASS 
        

        
    }

}
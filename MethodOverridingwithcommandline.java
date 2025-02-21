
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



public class MethodOverridingwithcommandline {

    public static void main(String[] args) {

        int choice = Integer.parseInt(args[0]);

        A obj = null;

        switch(choice){
            case 1 -> obj = new A();

            case 2 -> obj = new B();
                
            case 3 -> obj = new C();

        }


        // This is called as Dynamic Method Dispatch or runtime polymorphism where behavior is defined at runtime (late binding ) whereas method overloading is compile time polymorphism   and early binding is there 
        obj.show();
        
    }
    
}

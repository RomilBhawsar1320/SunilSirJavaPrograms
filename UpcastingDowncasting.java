class A {
    public void show() {
        System.out.println("aclassobj");
    }
}

class B extends A {
    @Override
    public void show() {
        System.out.println("bclassobj");
    }

    // Child class specific method
    public void disp() {
        System.out.println("able to use using downcasting ");
    }
}

public class UpcastingDowncasting {
    public static void main(String[] args) {
        // Upcasting: Parent reference pointing to a Child object
        A obj = new B();

        System.out.println("calling starts here");
        
        obj.show();  // Calls overridden method in B
        
        // Downcasting: Casting parent reference back to child type
     
    }
}

class Student{
    private String name;
    private int phone;

    public Student(String name,int phone){

        this.name = name;
        this.phone =phone;
    }

    public String toString(){
        return name + ": "+ phone;
    }
}

public class ObjectClassOverrridingExample {

    public static void main(String[] args) {
        Student obj = new Student("romil", 273632223);
        Student obj2 = new Student("priyanshi", 273634223);
        System.out.println(obj);
        System.out.println(obj2);

    }
    
}

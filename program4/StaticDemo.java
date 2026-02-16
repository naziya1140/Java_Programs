public class StaticDemo{
    static int staticVar; //Static Variable

    static{ //static block
        System.out.println("static block called");
        staticVar = 10;
    }

    public static void main(String[] args) {
        System.out.println("main method loaded");

        A objA = new A();
        B objB = new B();
        System.out.println("Object A and B created!");

        objA.increment();
        objA.increment();
        objB.decrement();
    }
}

class A{
    A(){
        System.out.println("Class A Loaded");
    }
    
    public void increment(){
        System.out.println("increment fn called");
        StaticDemo.staticVar++;
        System.out.println(StaticDemo.staticVar);
    }
}

class B{
    B(){
        System.out.println("Class B Loaded");
    }
    
    public void decrement(){
        System.out.println("decrement fn called");
        StaticDemo.staticVar--;
        System.out.println(StaticDemo.staticVar);
    }
}

//C is having it's own main method so after compiling you can run C as well.
class C{
    static int var;

    C(){
        System.out.println("Class C Loaded");
    }
    
    static{
        var = 10;
    }

    public static void main(){
        System.out.println("static method of C is called");
    }
}

// case1 
// javac StaticDemo.java
// java StaticDemo--> runs the staticDemo class

//Output
// static block called
// main method loaded
// Class A Loaded
// Class B Loaded
// Object A and B created!
// increment fn called
// 11
// increment fn called
// 12
// decrement fn called
// 11


//case 2 
// javac StaticDemo.java
// java C--> runs the C class as it is having it's own main method.

//Output
// static method of C is called









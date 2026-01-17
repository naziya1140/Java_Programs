class InheritanceDemo {
    public static void main(String[] args) {
        B objB = new B(12, 68.4);
        objB.printDetails();

        B obj = new B("Shradha", 27, true, 12, 34);
        obj.printDetails();
        // output
        // Name: Shradha
        // Age: 27
        // isPassed: true
        // Standard: 12
        // Percentage: 34.0
    }
}

class A {
    String name;
    int age;
    Boolean isPassed;

    A() {
        System.out.println("Default constructor of A is called");
    }

    A(String name, int age, Boolean isPassed) {
        System.out.println("Parameterized constructor of A is called");
        this.name = name;
        this.age = age;
        this.isPassed = isPassed;
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("isPassed: " + isPassed);
    }
}

class B extends A {
    int standard;
    double percentage;

    B() {
        System.out.println("Default constructor of B is called");
    }

    B(int standard, double percentage) {
        System.out.println("Parameterized constructor of B is called");
        this.standard = standard;
        this.percentage = percentage;
    }

    B(String name, int age, Boolean isPassed, int standard, double percentage) {
        System.out.println("Calling super of class A explicitly");
        super(name, age, isPassed);
        this.standard = standard;
        this.percentage = percentage;
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("isPassed: " + isPassed);
        System.out.println("Standard: " + standard);
        System.out.println("Percentage: " + percentage);
    }
}

// INPUT
// B objB = new B(12, 68.4);
// objB.printDetails();

// OUTPUT
// Default constructor of A is called ---> super class constructor is called by
// default when we call constructor of subclass.
// Parameterized constructor of B is called ---> sub class constructor is
// called.
// Name: null
// Age: 0
// isPassed: null
// Standard: 12
// Percentage: 68.4

// Call superclass constructor first
// Then execute subclass constructor
// B(){
// super();
// }

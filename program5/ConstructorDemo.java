class ConstructorDemo{
    String name;
    int age;

    //constructor overloading
    ConstructorDemo(){
        System.out.println("Default constructor is called");
    }

    ConstructorDemo(String name, int age){
        System.out.println("Parameterized constructor is called");
        this.name = name;
        this.age = age;
    }

    ConstructorDemo(String name){
        System.out.println("If one parameter is passed then constructor with single param is called");
    }

    public static void main(String[] args) {
        ConstructorDemo objA = new ConstructorDemo();

        ConstructorDemo objB = new ConstructorDemo("Shraddha", 26);

        ConstructorDemo objC = new ConstructorDemo("Aman");
    }
}


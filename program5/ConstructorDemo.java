class ConstructorDemo{
    String name;
    int age;

    //constructor overloading-> linking correct constructor and calling them accordingly( because all constructor have same name.)
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

//constructors are nothing but functions which are called during the creation of objects, they have same
//name as of the class and do not have return type. we have inbuilt default constructors, if we create 
//one by ourselves then we our constructors will be used.
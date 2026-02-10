public class OverloadingDemo {
    String name;
    int age;
    int salary;
    
    void showDetail(){
        System.out.println("Function 1 called because no parameter is passed.");
        System.out.println(this.name);
        System.out.println(this.age);
    }
    
    void showDetail(String name, int age){
        System.out.println("Function 2 called because 2 parameter is passed with String first and age second.");
        System.out.println(name);
        System.out.println(age);
        
    }
    
    void showDetail(int age, String name){
        System.out.println("Function 3 called because 2 parameter is passed with String second and age first.");
        System.out.println(name);
        System.out.println(age);
    }

    void showDetail(String name, int age, int salary){
        System.out.println("Function 3 called because 2 parameter is passed with String second and age first.");
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String args[]){
        OverloadingDemo obj = new OverloadingDemo();
        obj.name = "Ironman";
        obj.salary = 100000;
        obj.age = 22;

        obj.showDetail(); 
        obj.showDetail("Thor", 23); //order of parameter
        obj.showDetail(23, "Thanos"); 
        obj.showDetail("Thanos", 23, 50000); //number of parameter
    }
}

//Output

// Function 1 called because no parameter is passed.
// Ironman
// 22
// Function 2 called because 2 parameter is passed with String first and age second.
// Thor
// 23
// Function 3 called because 2 parameter is passed with String second and age first.
// Thanos
// 23
// Function 3 called because 2 parameter is passed with String second and age first.
// Thanos
// 23

class Superclass{
    void showDetail(){
        System.out.println("Method of Parent class is called");
    }
}

class Subclass extends Superclass{
    void showDetail(){
        System.out.println("Method of Child class is called");
    }

    void subclassMethod(){
        System.out.println("This method is only present in the subclass.");
    }
}


public class OverridingDemo {
    public static void main(String args[]){

        Superclass superObj = new Superclass(); //object of superClass.
        Subclass subObj = new Subclass(); //Object of subclass.

        superObj.showDetail(); //superclass method will be called.
        subObj.showDetail(); //subclass method will be called as superclass method is overrided.


        //Dynamic Method Dispatch
        Superclass obj1 = new Subclass(); //possible as a subclass is a type of superclass(UPCASTING).
        // Subclass obj2 = new Superclass();//not allowed

        obj1.showDetail();
        // obj1.subclassMethod(); //it is not possible to run method which is not present
        //  in super class because the reference is of superclass and superclass is not
        //  having this method.
    }    
}

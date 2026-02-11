class A{
    void showDetails(){
        System.out.println("This is outer class A");
    }

    //B and C both are inner class ( class files named A$B and A$C will be created)
    class B{
        void showDetails(){
            System.out.println("This is inner class B");
        }
    }

    static class C{
        void showDetails(){
            System.out.println("This is static inner class C");
        }
    }
}

abstract class Parent{
    String name;
    abstract void show();//method without implementation.
}
//Anonymous innerclass.

public class InnerClassDemo {
    public static void main(String[] args) {
        // B obj = new B(); creating object of inner class like this is not possible.
        // Object of the outer class is necessary to create object of inner class. 

        A outerObj = new A();
        A.B innerObj1 = outerObj.new B(); //using reference of outerclass 
        // A.C innerObj2 = outerObj.new C(); //static inner class

        outerObj.showDetails();
        innerObj1.showDetails();
        // innerObj2.showDetails();



        //Anonymous class --> creating a class while declaring the object.
        Parent obj = new Parent(){
            void show(){
                System.out.println("Implemented by anonymous inner class.");
            }
        };

        obj.show(); //will show new implemented method by the anonymous class.
    }    
}

// eg. 1. Inner class.
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



//eg. 2
//Anonymous innerclass.
abstract class Parent{
    String name;
    abstract void show();//method without implementation.
}

public class InnerClassDemo {
    public static void main(String[] args) {
        //eg. 1
        // B obj = new B(); creating object of inner class like this is not possible.
        // Object of the outer class is necessary to create object of inner class. 

        A outerObj = new A();
        A.B innerObj1 = outerObj.new B(); //using reference of outerclass 
        // A.C innerObj2 = outerObj.new C(); //static inner class

        outerObj.showDetails();
        innerObj1.showDetails();
        // innerObj2.showDetails();


        //eg. 2
        //Anonymous class --> creating a inner class while declaring the object.
        Parent obj = new Parent(){
            void show(){
                System.out.println("Implemented by anonymous inner class.");
            }
            void showChild(){
                System.out.println("Present only in child anonymous class");
            }
        };

        obj.show(); //will show new implemented method by the anonymous class.
        // obj.showChild(); ---> can't call the one which is only present in child anonymous class
        // because reference of outer class is used and it is not having that method.
    }    
}

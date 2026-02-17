interface A{
    void run();
    void eat();
}

interface  B{
    void run();
    void eat();
    void study();
}

class C implements A, B{ //multiple inheritance allowed in java.
    public void run(){
        System.out.println("Running");
    }
    
    public void eat(){
        System.out.println("Eating");
    }
    
    public void study(){
        System.out.println("Studying");
    }
}

public class InterfaceDemo2{
    public static void main(String args[]){
        //eg2
        C obj = new C();
        obj.eat();
    }    
}

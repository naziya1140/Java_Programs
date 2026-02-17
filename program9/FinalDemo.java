package program9;

final class Quadrilateral{
    //this is a final class but I can't extend it.    
}

class Rhombus{
    //this is final Method but it can't be overrided.
    final void printArea(){
        System.out.println("This is the area of a Rhombus");
    }
}

class Square extends Rhombus{
    //cannot rewrite the method which is final.
    // void printArea(){
    //     System.out.println("This is the area of a Sqaure");
    // }
}

public class FinalDemo {
    final double PI = 3.14;
    //PI = 3.1428; //Attempt to change the value of constant variable, to be written in caps lock.
    public static void main(String[] args) {
        System.out.println("Main method of FinalDemo");
    }
}

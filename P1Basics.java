import java.util.*;

class P1Basics{
    public static void main(String args[]){
        //Rules for compilation:- 
        //1.If any class is public then while compiling writing javac filename.java 
        //2. If it is not public then you can give it any name(not recommended)

        //Datatype in java
        //Non Primitive- Integer, Float, Character, Boolean
        //Primitive- Byte (1), Short(2), int(4), long(8), float(4), double(8)

        //double is by default type to decimal values and int is default type of integer number. 
        //for float --> float x = 5.6f;
        //for long --> long x = 6l;

        //TypeCasting, TypeConversion and TypePromotion.

        //No explicit conversion---> TypeConversion.
        int a = 500;
        long b = a;//possible but vice versa is not possible. 
        System.out.println(b);

        //Explicit conversion is called typeCasting.
        long c = (int)5;
        System.out.println(c); 

        //TypePromotion --> promotion from byte-> short -> int -> long implicitly.
        Byte x = 10;
        Byte y = 20;
        //Byte z = x + y ---> throw compile time error. 
        int z = x + y;
        System.out.println(z);

        int w = 6/4.0;//error
        int u = 6/4; //will give integer.
        System.out.println(w);
    }
}
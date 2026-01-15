import java.util.*;

class basics


class P1Basics{
    public static void main(String args[]){

        //No explicit conversion so it is typeconversion.
        int a = 500;
        long b = a;//possible but vice versa is not possible. 
        System.out.println(b);

        //Explicit conversion is called typeCasting.
        long c = (int)5;
        System.out.println(c); 

        int d = Integer.MAX_VALUE * 2;
        System.out.println(d);
    }
}
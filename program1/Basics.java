import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Basics{
    public static void main(String args[]){

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

        //int w = 6/4.0; //error
        int u = 6/4; //will give integer.


        //Taking input in java---> 1. using BufferedReader class.
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        try{
            int num1 = Integer.parseInt(bf.readLine()); // error: unreported exception IOException; must be caught or declared to be thrown
            String s1 = bf.readLine();
        } catch(Exception e){
            System.out.println(e);
        }
        
        //Taking input in java---> 2. using Scanner class.
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        String s2 = sc.nextLine();

    }
}
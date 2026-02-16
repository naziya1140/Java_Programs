import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
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
            int num1 = Integer.parseInt(bf.readLine());
            String s1 = bf.readLine();
        } catch(Exception e){
            System.out.println(e);
        }

        // System.in -> is standard input stream which represents keyboard input.
        // But it provides bytes, not characters.

        // InputStreamReader(System.in) --> This converts byte input into character input.

        //Buffer means reading a chunk into memory and then gives it to you efficiently.
        //Bf is faster, reduces the no of system calls and it reads everything in String and 
        // has to be parsed manually.

        //readLine() means reading until enter is pressed.
        // here bf throws checked exception,
        // checked exceptions are errors that the compiler forces you to handle.
        // so it is must to wrap it in try and catch block.


        //Taking input in java---> 2. using Scanner class.
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        String s2 = sc.nextLine();
        sc.close();

        // Scanner class throws unchecked exception so it is not must to use try-catch block.
        // But if you give wrong input (giving string if int is asked) then program will crash.
        // Close the scanner after using it. 
    }
}
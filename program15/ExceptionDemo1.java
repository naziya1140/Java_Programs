import java.util.*;

// creating your own exception.
class ZeroException extends Exception{
    public ZeroException(){
        System.out.println("We cannot divide with the number as it is zero.");
    }
}

public class ExceptionDemo1 {
    public static void main(String[] args) {
        //eg.1 --> Multiple catch blocks.
        int i = 0;
        
        try{
            int j = 18/i; //critical statement.
        } 
        catch (ArithmeticException e){//object of ArithmeticException class is passed as a parameter.
            //it will be skipped if there is no arithmetic exception.
            System.out.println("ArithmeticException occurs");
        }
        catch(ArrayIndexOutOfBoundsException e){
            //It will also be skipped if there is no Array Index out of bound exception.
            System.out.println("ArrayIndexOutOfBoundsException occurs");

        }
        catch (Exception e){
            //If no catch matches then it will be catched here.
            System.out.println("Common Catch block");
        }
        finally{
            //finally block is used for closing all the resources.
            System.out.println("This will be executed anyway, after excuting throw and catch");
        }


        //eg.2 --> explaination of own exception class ( This will be executed even after an error has been thrown above.)
        try{
            double x = Math.random();
            if (x == 0) throw new ZeroException();

        } catch (ZeroException e){
            System.out.println("In Zero Exception catch block.");
        } catch (Exception e){
            System.out.println("This is common exception block for safety.");
        }


    }
}

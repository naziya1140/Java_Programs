public class ExceptionDemo2 {

    void a() {
        System.out.println("Step 1: Entering method a()");
        int i = 0;
        System.out.println("Step 2: About to divide 15 by 0");
        int j = 15 / i;   // ArithmeticException happens here
        System.out.println("Step 3: This line in a() will NEVER execute");
    }

    void b() {
        System.out.println("Step 4: Entering method b()");
        int[] arr = new int[5];
        System.out.println("Step 5: About to access arr[5]");
        arr[5] = 10;  // IndexOutOfBoundsException
        System.out.println("Step 6: This line in b() will NEVER execute");
    }

    void c() throws Exception {
        System.out.println("Step 0: Entering method c()");
        a();  // control jumps out due to error.
        System.out.println("This line in c() will NEVER execute");
        b();  // b() never runs
    }

    void d() {
        System.out.println("Entering method d()");
        try {
            System.out.println("Inside try block of d()");
            c();
            System.out.println("This line in d() will NOT execute if exception occurs");
        } 
        catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException in d()");
        } 
        catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException in d()");
        } 
        catch (Exception e) {
            System.out.println("Caught General Exception in d()");
        }

        System.out.println("Execution continues after catch block in d()");
    }

    public static void main(String[] args) {
        ExceptionDemo2 obj = new ExceptionDemo2();
        obj.d();

        //Output
        // Entering method d()
        // Inside try block of d()
        // Step 0: Entering method c()
        // Step 1: Entering method a()
        // Step 2: About to divide 15 by 0
        // Caught ArithmeticException in d()
        // Execution continues after catch block in d()

        //main--> d() --> c()--> error occurs --> d() catch block --> execution of d starts again.

        //which means that method b is not executed, why?
        //throws Exception in method c() does NOT handle the exception but just throw it to the one who has called it( ie. d)
        //If you want b() to execute even if a() fails, then you must catch the exception inside c().
    }
}
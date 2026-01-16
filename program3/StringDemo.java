class StringDemo {
    public static void main(String[] args) {
        String name = new String("Java"); //object of string class.
        String type = "Strongly typed language";
    
        System.out.println("Name of the language is " + name + " and it is a " + type);

        //In stack the reference of the string is stored, the actual string are stored in 
        //string constant pool(inside heap memory).
        //if two string have same value, then no different value is assigned to it, it just find if the 
        //String already exists in the heap memory, if yes then same reference is given to the variable.

        String a = "Hello";
        String b = "Hello";
        //both a and b will have same reference. 
    }
}

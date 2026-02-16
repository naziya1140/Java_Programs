class ObjectDemo{
    int age; 
    String name;

    ObjectDemo(int age){
        this.age = age;
    }

    ObjectDemo(String name){
        this.name = name;
    }

    ObjectDemo(int age, String name){
        this.age = age;
        this.name = name;
    }

    public static void main(String args[]){
        ObjectDemo obj = new ObjectDemo(30, "SpiderMan");
        // ObjectDemo-> class (kind of datatype of the varible obj)
        //obj -> name of obj (reference variable);

        System.out.println(obj.age + " " + obj.name);
    }
}


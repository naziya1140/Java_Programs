class Student{
    String name; 
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class ArrayDemo {
    public static void main(String args[]){
        
        //Different ways of declaring and initializing array.

        //first
        int num[] = new int[2];
        num[0] = 2;
        num[1] = 5;

        //Second
        int[] num2 = {5, 6, 7};
        for(int i = 0; i < num2.length; i++){
            System.out.print(num2[i] + " ");
        }
        
        //Third
        int[] num3 = new int[]{3, 2, 1};
        

        //Variation in Array.
        
        //Array of object
        Student arr[] = new Student[2];
        arr[0] = new Student("Tom", 23);
        arr[1] = new Student("Jerry", 22);
    
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[0].name);

        //2D Array.
        // [[1, 1], [1, 1]]
        int[][] arr2 = new int[2][2];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                arr2[i][j] = 1;
            }
        }

        //Jagged Array: Array where number of columns for all the rows are not equal.
        //[[1, 1, 1, 1], [1, 1]]
        int[][] arr3 = new int[2][];
        arr3[0] = new int[4];  //number of cols in row0 is 4
        arr3[1] = new int[2]; //number of cols in row1 is 1

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < arr3[i].length; j++){
                arr3[i][j] = 1;
            }
        }


    }
}

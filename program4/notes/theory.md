## About Static Variable
-> It is a instance of class not a instance of object
-> static block is used to initialize the static variable.
-> Since it is instance of class so it can be accessed using className.
-> It has a common value for all objects of a class.
-> static block is the first thing which is called, (it is called before main class)

## Static Methods
Our main method is a static method because a class is only loaded if it's object is made,
making object is not possible as the execution is not started. It is basically a deadlock.

static helps in loading the class even if it's object is not made. 

## Rules
For any program to execute we need to have a public static void main function which acts as the starting point of execution.

## when classes in java loads?
From above cases we derived that java don't loads class which is not needed, if and only if object of a class is made then only it's class is loaded. 
and to load a class without making object we need psvm. 


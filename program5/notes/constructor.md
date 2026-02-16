## What is constructor overloading? 
linking correct constructor and calling them accordingly( because all constructor have same name.

constructors are nothing but functions which are called during the creation of objects, they have same name as of the class and do not have return type.
we have inbuilt default constructors, if we create one by ourselves then we our constructors will override the inbuilt constructor. 

## Types of Constructor
1. __Default__: A default constructor has no parameters. It’s used to assign default values to an object. If no constructor is explicitly defined, Java provides a default constructor.

2. __Copy Constructor__: Unlike other constructors copy constructor is passed with another object which copies the data available from the passed object to the newly created object.

3. __Parametrized Constructor__: A constructor that has parameters is known as parameterized constructor. If we want to initialize fields of the class with our own values, then use a parameterized constructor. 
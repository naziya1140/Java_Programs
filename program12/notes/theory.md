## Interface
An interface in Java is a blueprint of a class. It has static constants and abstract methods.
The interface in Java is a mechanism to achieve abstraction. There can be only abstract
methods in the Java interface, not method body. It is used to achieve multiple inheritance in Java.
and all the fields are public, static and final by default.

1. It is used to achieve abstraction.
2. By interface, we can support the functionality of multiple inheritance.

It is obvious that we cannot create an object of interface class.

__class -->  extends ---> class__
__interface -->  extends --> interface__
__class --> implement --> interface__


## some more information about interfaces 
1. All the variable in the interface are by default public static final. 
  -> __public__: There is no reason of storing private variable if it cannot be accessed by anyone.
  -> __static__: Since we cannot have the object of class so we can have class variable only.
  -> __final__: you cannot change the value created in interface because interfaces cannot store mutable state. If x were changeable, which class would own the updated value, Multiple inheritance would create chaos.

2. In an Interface all the methods follow this rule.(public, static, default, private)
    -> All the abstracts are by default public even if you don't mention because it will be private
       then it cannot be inherited for implementation.( declare public explicitly in the method where you are implementing it.)
    -> You can have static methods which will belong to the interface not the object.
       InterfaceName.method()--> call this in driver fun.
    -> Private Methods can only be used inside the interface to support default methods.Cannot be accessed or
       overridden by implementing classes.
    -> You can have default method in an interface, A default method behaves like an inherited method.
       A class implementing the interface can override it.

## What is the need of having a default Method.
ans: You create an interface, hundreds of classes implement it. Now after sometime you decided 
that every vehicle should also have a stop() method. If you add void stop(); Every single implementing class breaks.Compilation error everywhere. To deal with this we can add default methods so that all classes can inherit it and even override it if they want.


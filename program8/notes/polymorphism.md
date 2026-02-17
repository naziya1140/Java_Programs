*Superclass obj1 = new Subclass();*<br>
Here, obj is a reference of Superclass, but it is pointing to an object of Subclass.
This is allowed because a subclass is a type of superclass.

When a method is called using obj, Java checks the actual object at runtime.
If the method is overridden, the Subclass method is executed.

However, because the reference is of Superclass, we cannot call methods that exist only in Subclass.
Only methods present in Superclass can be called.

So, the reference type decides what methods can be called, and the object type decides which
method actually runs.

Method overriding is one of the ways in which Java supports Runtime Polymorphism. Dynamic method dispatch is the mechanism by which a call to an overridden method is resolved at run time, rather than compile time.

## Dynamic Method dispatch-->
When an overridden method is called through a superclass reference, Java determines which version
(superclass/subclasses) of that method is to be executed based upon the type of the object being
referred to at the time the call occurs. Thus, this determination is made at run time.
At run-time, it depends on the type of the object being referred to (not the type of the reference 
variable) that determines which version of an overridden method will be executed
A superclass reference variable can refer to a subclass object. This is also known as upcasting.
Java uses this fact to resolve calls to overridden methods at run time.

# TAU.Homework
You can assign a value to a variable in one of several ways including:
1. type a literal value after the equals sign (x=12, isGood =  true, etc)
2. assing the value of one variable to another (x=y)
3. use an expression comining the two (x = y + 43)
4. It must start with a letter, underscore, or dollar sign. You can't start a name with a number.
5. After the first character you can use numbers as well just not starting with a number.
6. It can be anything you like, subject to those two rules, just so long as it isn't one of Java's reserved keywords(a list can be found in w3 schools)


 There is no such thing as an object variable there is only an object reference variable.
 An object reference variable holds buts that represent a way to access an object.

# Headfirst Java Chapter 5 - 10 notes
Built into the Java class library is a class called integer and one of its job is to take Strings
that represent numbers and convert them into acutal numbers.

Java has a huge library found here [Link of the Library](https://docs.oracle.com/javase/8/docs/api/allclasses-noframe.html) 

The Array list class is your best friend [ArrayList Class Doc](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)

ArrayList can only hold objects, primitives cannot be used, although the respective wrapper class (Integer, Double) can be.

We can use inheritance when one class is a MORE SPECIFIC version of another class. By doing this, we avoid code duplication when building similar classes. 
When you call a method under polymorphism, you will call the most specific version of that method for an object. In other words, overridden methods in subclasses are prioritized to be called.
IS A relationship vs. HAS A relationship: IS A relationship means that two classes are associated with inheritance. HAS A relationship means that two classes are related, but have no associations with each other through inheritance (one class may be used by another class under HAS A relationship).

## Overriding vs. Overloading: 
1. Overriding states that arguments must be the same and return types must be compatible.
  
2. Overriding states that the method access modifier must be the same or friendlier(less restrictive). Access modifiers control what has access to certain code. 
Most restrictive -> private default protected public -> least restrictive.

3. Overloading states that argument and return types can be different.
   
4. Overloading states that we can change the level of access in any direction.


Interfaces are similar to abstract classes in that they serve as contracts for how classes behave. 
The difference between abstract classes and interfaces is that interfaces can be applied to several classes with no relationship.

Every class, regardless of whether it was created by you or already built in the Java API, extends the object class. All classes are subclasses of the object class.

The object class serves two purposes: to act as a polymorphic class for methods (how we can use toString for every class) and to provide method code that all Java objects need at runtime.
Using the Object class can come with a price, as specific concrete methods that are referenced to as objects of Object class lose their specific class characteristics and turn into objects of the Object class 

Instance variables reside within the object they belong to, stored on the Heap.

**Constructors are used to initialize the state, including instance variables, of the newly created object.
If you omit a constructor in your class, the compiler will automatically provide a default constructor.
**


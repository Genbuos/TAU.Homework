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

Overriding vs. Overloading: 
1. Overriding states that arguments must be the same and return types must be compatible.
2. Overriding states that the method access modifier must be the same or friendlier(less restrictive). 
3. Overloading states that argument and return types can be different.
4. Overloading states that we can change the level of access in any direction.



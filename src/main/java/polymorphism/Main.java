package polymorphism;

public class Main {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);
        System.out.println("\n");

        Animal sasha = new Dog();
        sasha.makeSound();
        //Because sasha is of type animal i can change sasha into a cat
        sasha = new Cat(); // but because she is of type animal she does not
        // have the methods inside of Cat that is not inherited from Animal
        //but we can get around this by casting sasha to cat
        sasha.makeSound();
        //casting sasha to cat
        ((Cat) sasha ) .scratch();
        feed(sasha);

    }

    public static void feed(Animal animal){
        //instance of is an operator that checks if whatever on the left side
        // is an instance of whatever is on the right side and returns a boolean
        if(animal instanceof Dog){
            System.out.println("Dog food dispensed");
        }else if(animal instanceof  Cat){
            System.out.println("Cat food dispensed");
        }
    }
}

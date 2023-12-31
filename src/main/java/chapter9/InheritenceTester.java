package chapter9;

public class InheritenceTester {
    public static void main(String[] args) {

//        Rectangle rectangle = new Rectangle();
//        rectangle.print();
//
//        Square square = new Square();
//        square.print("square");
        Mother mom = new Mother();
        mom.setName("Sonja");
        System.out.println(mom.getName() + " is a " + mom.getGender());
    }

    public static void testSquareOverride(){
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setWidth(8);
        System.out.println(rectangle.calculatePerimeter());

        Square square = new Square();
        square.setLength(4);
        square.setWidth(8);
        System.out.println(square.calculatePerimeter());
    }
}

package interface_demo;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        IShape iShape = new Rectangle(4,5);
        System.out.println(iShape.getArea());
        System.out.println(iShape.getPerimeter());

        System.out.println("Hình vuông");
        IShape iShape1 = new Square(5);
        System.out.println(iShape1.getPerimeter());
        System.out.println(iShape1.getArea());

        ArrayList<IShape> shapes = new ArrayList<>();
        shapes.add(iShape);
        shapes.add(iShape1);
        shapes.add(new Rectangle(5,6));
        shapes.add(new Square(7));

        System.out.println("Danh sách hình");
        for (IShape shape: shapes){
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
        }

        //IN ra ds hình vuông có trong ds
        System.out.println("Danh sách hình vuông");
        for (IShape shape: shapes){
            if (shape instanceof Square){
                System.out.println(shape);
                System.out.println(shape.getArea());
                System.out.println(shape.getPerimeter());
            }
        }

        System.out.println(IShape.message);
        iShape1.sayHello();
        iShape.sayHello();
    }
}

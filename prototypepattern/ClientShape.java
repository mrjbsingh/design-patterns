package prototypepattern;

import java.util.ArrayList;

public class ClientShape {
    public static void main(String args[]){
        ArrayList<Shape> shapes = new ArrayList<>();
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 10;
        circle.radius = 5;

        Square square = new Square();
        square.height = 5;
        square.width = 5;
        square.x = 9;
        square.y = 9;

        shapes.add(circle);
        shapes.add(circle.clone());
        shapes.add(square);
        shapes.add(square.clone());
        shapes.add(square.clone());
        shapes.add(square.clone());
        shapes.add(circle.clone());

        for (Shape shape: shapes){
            System.out.println("My address "+ shape +" description "+ shape.displayName());
        }
    }
}


/**
 * 
 * @author Nhu Ly
 * @Date 2022-11-11
 */
import java.util.ArrayList;

public class ShapeTest extends Thread {

    public static void main(String[] args) {
        Shapes shapes = new Shapes(new ArrayList<Shape>());
        shapes.addShape(new Circle(11));
        shapes.addShape(new Circle(3));
        shapes.addShape(new Rectangle(5, 5));
        shapes.addShape(new Rectangle(6, 8));
        shapes.addShape(new Hexagon(9));
        shapes.addShape(new Hexagon(10));
        shapes.addShape(new Triangle(5, 7));
        shapes.addShape(new Triangle(6, 4));

        Shape minShape = shapes.min();
        Shape maxShape = shapes.max();
        System.out.println("Min Area is: " + minShape.toString());
        System.out.println();
        System.out.println("Max Area is: " + maxShape.toString());
        /**
         * Make 8 threads
         */
        for (int i = 0; i < 8; i++) {
            new Thread() {

                public void run() {
                    {
                        try {
                            shapes.compute();
                        } catch (Exception ex) {
                            System.out.println(ex);
                        }
                    }
                }
            }.start();
        }

    }
}

/**
 * 
 * @author Nhu Ly
 * @Date 2022-11-11
 */
import java.util.ArrayList;

public class Shapes {

    /**
     * Shape Lists
     */
    private ArrayList<Shape> shapeList = new ArrayList<Shape>();

    public Shapes(ArrayList<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    public void addShape(Shape shape) {
        shapeList.add(shape);
    }

    public void removeShape(Shape shape) {
        shapeList.remove(shape);
    }

    /**
     * Getter and Setter
     */
    public ArrayList<Shape> getShapeList() {
        return shapeList;
    }

    public void setShapeList(ArrayList<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    /**
     * Returns min area 
     */
    public Shape min() {
        Shape min = shapeList.get(0);
        for (Shape shape : shapeList) {
            if (shape.computeArea() < min.computeArea()) {
                min = shape;
            }
        }
        return min;
    }

    /**
     * Returns max area
     * 
     */
    public Shape max() {
        Shape max = shapeList.get(0);
        for (Shape shape : shapeList) {
            if (shape.computeArea() > max.computeArea()) {
                max = shape;
            }
        }
        return max;
    }

    /**
     * This method prints all shape list.
     */
    public synchronized void compute() {
        System.out.println("--------Thread " + Thread.currentThread().getId() + "----------");
        for (Shape shape : shapeList) {
            try {
                System.out.print("Area of a " + shape.getShapeName() + " is ");
                System.out.printf("%.2f", shape.computeArea());
                System.out.println();
            } catch (NullPointerException e) {
                System.out.println(e);
            }
        }
    }
}
/**
 * Circle Class
 * 
 * @author Nhu Ly
 * @Date 2022-11-11
 */
public class Circle extends Shape {
    private int radius;

    /**
     * 
     * @param radius The radius of the circle.
     */
    public Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }

    /** 
     * Getters and Setters
    */
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * 
     * @return The area
     */
    @Override
    public double computeArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * 
     * @return The string for the circle.
     */
    @Override
    public String toString() {
        return super.toString() + " with radius = " + radius + " \nArea=" + String.format("%.2f", computeArea());
    }
}
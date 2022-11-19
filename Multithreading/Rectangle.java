/**
 * Rectangle Class
 * 
 * @author Nhu Ly
 * @Date 2022-11-11
 */
public class Rectangle extends Shape {
    private int length;
    private int width;

    /**
     * 
     * @param length The length of the rectangle.
     * @param width  The width of the rectangle.
     */
    public Rectangle(int length, int width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }
    
    /**
     * Getters and Setters
     * @return
     */
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * 
     * @return The area
     */
    public double computeArea() {
        return (length * width);
    }

    /**
     * 
     * @return The string for the rectangle.
     */
    @Override
    public String toString() {
        return super.toString() + " with length = " + length + " and width = " + width + " \nArea="
                + String.format("%.2f", computeArea());
    }
}
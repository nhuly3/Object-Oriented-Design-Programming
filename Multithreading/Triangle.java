
/**
 * 
 * @author Nhu Ly
 * @Date 2022-11-11
 */
public class Triangle extends Shape {

    private int base;
    private int height;

    /**
     * 
     * @param base   The base of the triangle.
     * @param height The height of the triangle.
     */
    public Triangle(int base, int height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    /**
     * Getter and Setter
     */
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * 
     * @return The strin for the triangle.
     */
    @Override
    public String toString() {
        return super.toString() + " with base = " + base + " and height = " + height + " \nArea="
                + String.format("%.2f", computeArea());
    }

    /**
     * 
     * @return The area of the triangle.
     */
    @Override
    public double computeArea() {
        return (base * height) / 2;
    }
}
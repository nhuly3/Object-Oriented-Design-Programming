
/**
 * Shape Class
 * 
 * @author Nhu Ly
 * @Date 2022-11-8
 */
public abstract class Shape {

    private String shapeName;

    public Shape() {
        this.shapeName = "";
    }

    /**
     * 
     * @param shapeName Indicates what shape
     */
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    @Override
    public String toString() {
        return "Area of a " + shapeName;
    }

    /**
     * Getter and Setter
     */
    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    /**
     * 
     * @return The area of the shape.
     */
    public abstract double computeArea();
}
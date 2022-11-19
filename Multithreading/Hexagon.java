/**
 * This class represents a hexagon.
 * 
 * @author Nhu Ly
 * @Date 2022-11-11
 */
public class Hexagon extends Shape {

    private int side;

    /**
     * 
     * @param side The side of the hexagon.
     */
    public Hexagon(int side) {
        super("Hexagon");
        this.side = side;
    }

    /**
     * Getter and Setter
     */
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    /**
     * 
     * @return The area
     */
    @Override
    public double computeArea() {
        return (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2;
    }

    /**
     * 
     * @return The string for the hexagon.
     */
    @Override
    public String toString() {
        return super.toString() + " with side = " + side + " \nArea=" + String.format("%.2f", computeArea());
    }
}
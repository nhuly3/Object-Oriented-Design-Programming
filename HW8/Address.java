/**
 * 
 * @author Nhu Ly
 * @since 12/09/2022
 */
public class Address {
    private int streetNum;
    private String streetName;
    private String city;
    private String state;
    private String zip;

    public Address() {
        this.streetNum = 0;
        this.streetName = "";
        this.city = "";
        this.state = "";
        this.zip = "";
    }

    /**
     * 
     * @param streetNum  The street number
     * @param streetName The street name
     * @param city       The city
     * @param state      The state
     * @param zip        The zip code
     */
    public Address(int streetNum, String streetName, String city, String state, String zip) {
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    /**
     * A string representation
     */
    @Override
    public String toString() {
        return streetNum + " " + streetName + ", " + city + ", " + state + ", " + zip;
    }

    /**
     * Getters
     */
    public int getStreetNum() {
        return streetNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    /**
     * Setters
     */
    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
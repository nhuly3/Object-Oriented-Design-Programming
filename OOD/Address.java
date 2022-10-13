/**
 * @author Nhu Ly
 * @since 10/02/2022
 */
public class Address {
    private int streetNum;
    private String streetName;
    private String city;
    private String zip;
    private String state;

    /**
     * @param streetNum  Street Number
     * @param streetName Street Name
     * @param city       City
     * @param zip        Zip
     * @param state      State
     */

    public Address(int streetNum, String streetName, String city, String zip, String state) {
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.city = city;
        this.zip = zip;
        this.state = state;
    }
    /**
     * Getters and Setters
     * 
     */
    public int getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * A string for Address
     * 
     * @return String for Address
     */
    @Override
    public String toString() {
        return "Street Number: " + streetNum + ", Street Name: " + streetName + ", City: " + city + ", Zip: " + zip
                + ", State: " + state;
    }
}

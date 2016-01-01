package ravenlabyrinth;

import java.awt.Point;

/**
 * Raven is a class that defines craven's name, coordinates and more.
 * @author Thierry Baribaud
 * @version 1.0.0
 */
public class Raven {
    
    /**
     * Raven's name.
     */
    private String Name;
    
    /**
     * Raven's coordinates on the map.
     */
    private Point Location;
    
    /**
     * Set cravan's name to the value passed as parameter.
     * @param Name craven's name
     */
    public void setName(String Name) {
        this.Name = Name;
    }
    
    /**
     * Get craven's name.
     * @return craven's name.
     */
    public String getName() {
        return(Name);
    }
    
    /**
     * Set craven's coordinates to the Location passed as parameter.
     * @param Location craven's coordinates.
     */
    public void setLocation(Point Location) {
        this.Location = Location;
    }
    
    /**
     * Get craven's coordinates.
     * @return craven's coordinates.
     */
    public Point getLocation() {
        return(Location);
    }
}

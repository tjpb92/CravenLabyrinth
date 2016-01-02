package ravenlabyrinth;

import java.awt.Point;
import static ravenlabyrinth.RavenLabyrinth.RAVEN;

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
     * Raven's status.
     */
    private final int status = RAVEN;
    
    /**
     * Raven's coordinates on the map.
     */
    private Point Location;
    
    /**
     * Value of the previous gem.
     */
    private int gem;
    
    public Raven() {
        setName("Corbeau");
        setGem(0);
        setLocation(new Point(16, 1));
    }
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

    /**
     * Memorize the value of the current gem.
     * @param currentGem Current gem value.
     */
    public void setGem(int currentGem) {
        this.gem = currentGem;
    }
    
    /**
     * Return the value of the previous gem.
     * @return value of the previous gem.
     */
    public int getGem() {
        return(this.gem);
    }

    /**
     * Return raven's status.
     * @return raven's status.
     */
    public int getStatus() {
        return(status);
    }
    
    /**
     * Move raven northward.
     */
    public void moveNorth() {
        Location.setLocation(Location.x-1, Location.y);
    }

    /**
     * Move raven eastward.
     */
    public void moveEast() {
        Location.setLocation(Location.x, Location.y+1);
    }

    /**
     * Move raven southward.
     */
    public void moveSouth() {
        Location.setLocation(Location.x+1, Location.y);
    }
    
    /**
     * Move raven westward.
     */
    public void moveWest() {
        Location.setLocation(Location.x, Location.y-1);
    }

}

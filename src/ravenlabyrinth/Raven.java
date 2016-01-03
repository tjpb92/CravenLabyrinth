package ravenlabyrinth;

import static ravenlabyrinth.RavenLabyrinth.ARRIVING_POINT;
import static ravenlabyrinth.RavenLabyrinth.BLUE_GEM;
import static ravenlabyrinth.RavenLabyrinth.FREE_SLAB;
import static ravenlabyrinth.RavenLabyrinth.RAVEN;
import static ravenlabyrinth.RavenLabyrinth.RED_GEM;

/**
 * Raven is a class that defines craven's name, coordinates and more.
 * @author Thierry Baribaud
 * @version 1.0.5
 */
public class Raven {
    
    /**
     * Raven's name.
     */
    private String Name;
    
    /**
     * Raven's status.
     */
    private static final int status = RAVEN;
    
    /**
     * Value of the previous gem encountered.
     */
    private int previousGem;
    
    /**
     * Reference to the current slab where the raven stands.
     */
    private Slab CurrentSlab;
    
    /**
     * Reference to the expected slab where the raven will stand.
     */
    private Slab ExpectedSlab;
    
    public Raven() {
        setName("Corbeau");
        setPreviousGem(0);
    }
    
    /**
     * Set craven's name to the value passed as parameter.
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
     * Memorize the value of the current gem and set it as previous gem.
     * @param previousGem Current gem value.
     */
    public void setPreviousGem(int previousGem) {
        this.previousGem = previousGem;
    }
    
    /**
     * Return the value of the previous gem.
     * @return value of the previous gem.
     */
    public int getPreviousGem() {
        return(this.previousGem);
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
        Slab NorthSlab;
        
        NorthSlab = CurrentSlab.getNorthSlab();
        if (NorthSlab != null) {
            CurrentSlab = NorthSlab;
        }
    }

    /**
     * Move raven eastward.
     */
    public void moveEast() {
        Slab EastSlab;
        
        EastSlab = CurrentSlab.getEastSlab();
        if (EastSlab != null) {
            CurrentSlab = EastSlab;
        }
    }

    /**
     * Move raven southward.
     */
    public void moveSouth() {
        Slab SouthSlab;
        
        SouthSlab = CurrentSlab.getSouthSlab();
        if (SouthSlab != null) {
            CurrentSlab = SouthSlab;
        }
    }
    
    /**
     * Move raven westward.
     */
    public void moveWest() {
        Slab WestSlab;
        
        WestSlab = CurrentSlab.getWestSlab();
        if (WestSlab != null) {
            CurrentSlab = WestSlab;
        }
    }

    /**
     * Return the reference of the current slab where stands the raven.
     * @return the reference of the current slab where stands the raven.
     */
    public Slab getCurrentSlab() {
        return(CurrentSlab);
    }
    
    /**
     * Set the reference of the current slab where stands the raven.
     * @param MyCurrentSlab the reference of the current slab where stands the raven.
     */
    public void setCurrentSlab(Slab MyCurrentSlab) {
        this.CurrentSlab = MyCurrentSlab;
        this.setPreviousGem(MyCurrentSlab.getGem());
    }
    
    /**
     * Return the reference of the expected slab where the raven will be.
     * @return the reference of the expected slab where the raven will be.
     */
    public Slab getExpectedSlab() {
        return(ExpectedSlab);
    }
    
    /**
     * Set the reference of the expected slab where the raven will be.
     */
    public void setExpectedSlab() {
        
    }

    public boolean scanNorth() {
        return(scanSlab(CurrentSlab.getNorthSlab().getStatus(), getPreviousGem()));
    }
    
    public boolean scanEast() {
        return(scanSlab(CurrentSlab.getEastSlab().getStatus(), getPreviousGem()));
    }
    
    public boolean scanSouth() {
        return(scanSlab(CurrentSlab.getSouthSlab().getStatus(), getPreviousGem()));
    }
    
    public boolean scanWest() {
        return(scanSlab(CurrentSlab.getWestSlab().getStatus(), getPreviousGem()));
    }
    
    private boolean scanSlab(int slabStatus, int ravenStatus) {
        boolean retcode;
        
//        retcode = false;
        if (slabStatus == FREE_SLAB) {
            retcode = true;
        }
        else if (slabStatus == RED_GEM || slabStatus == BLUE_GEM) {
            retcode = ravenStatus != slabStatus;
        } 
        else retcode = slabStatus == ARRIVING_POINT;
        
        return(retcode);
    }
}

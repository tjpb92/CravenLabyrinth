package ravenlabyrinth;

import static ravenlabyrinth.RavenLabyrinth.WALL;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import static ravenlabyrinth.RavenLabyrinth.BLUE_GEM;
import static ravenlabyrinth.RavenLabyrinth.RED_GEM;

/**
 * Represents a slab.
 * @author Thierry Baribaud
 * @version 1.0.5
 */
public class Slab extends JLabel {
       
    private int row;
    private int column;
    private int status;
    private int previousStatus;
    private Slab NorthSlab;
    private Slab EastSlab;
    private Slab SouthSlab;
    private Slab WestSlab;
    
    /**
     * Create a slab, status WALL
     * @param row ordinate of the slab,
     * @param column abscissa of the slab
     */
    public Slab(int row, int column) {
        setRow(row);
        setColumn(column);
        setStatus(WALL);
        saveCurrentStatus();
    }
    
    /**
     * Set slab row value.
     * @param row slab row value.
     */
    public void setRow(int row) {
        this.row = row;
    }
    
    /**
     * Return slab row value.
     * @return slab row value.
     */
    public int getRow() {
        return(this.row);
    }

    /**
     * Set slab abscissa to the value passes as parameter (column).
     * @param column slab column index.
     */
    public void setColumn(int column) {
        this.column = column;
    }
    
    /**
     * Return slab's column.
     * @return slab's column.
     */
    public int getColumn() {
        return(this.column);
    }

    /**
     * Set slab status to the value passed as parameter.
     * @param status slab status.
     */
    public void setStatus(int status) {
        saveCurrentStatus();
        this.status = status;
        loadIcon(status);
    }
    
    /**
     * Return slab status.
     * @return slab status.
     */
    public int getStatus() {
        return(this.status);
    }

    /**
     * Save the current slab status.
     */
    public void saveCurrentStatus() {
        previousStatus = getStatus();
    }
    
    /**
     * Restaure slab status to previous status value.
     */
    public void restaurePreviousStatus() {
        setStatus(previousStatus);
    }
    
    /**
     * Load slab icon according to its status.
     * @param status slab status.
     */
    public void loadIcon(int status) {
        
        String Filename;
        
        switch(status) {
            case RavenLabyrinth.FREE_SLAB: Filename = "/dalle_32x32.jpg";
                break;
            case RavenLabyrinth.RED_GEM: Filename = "/gemme_rouge_32x32.png";
                break;
            case RavenLabyrinth.BLUE_GEM: Filename = "/gemme_bleue_32x32.png";
                break;
            case RavenLabyrinth.RAVEN: Filename = "/corbeau_03_32x32.jpg";
                break;
            case RavenLabyrinth.STARTING_POINT: Filename = "/entree_32x32.jpg";
                break;
            case RavenLabyrinth.ARRIVING_POINT: Filename = "/sortie_32x32.jpg";
                break;
            default: Filename = "/mur_32x32.jpg";
                break;
        }
        setIcon(new ImageIcon(getClass().getResource(Filename)));              
    }
    
    /**
     * Return gem value or 0 if any
     * @return gem value or 0 if any
     */
    public int getGem() {
        int gem;
        
        gem = getStatus();
        if (gem != RED_GEM && gem != BLUE_GEM) gem = 0;
        
        return(gem);
    }
    
    /**
     * Return the desciption of the slab.
     * @return the desciption of the slab.
     */
    @Override
    public String toString() {
        return("Slab(" + getRow() + "," + getColumn() + ")" + ", status=" + getStatus());
    }

    /**
     * Get the reference of the northern slab.
     * @return the reference of the northern slab.
     */
    public Slab getNorthSlab() {
        return(this.NorthSlab);
    }

    /**
     * Set the reference to the northern slab.
     * @param NorthSlab the reference to the northern slab.
     */
    public void setNorthSlab(Slab NorthSlab) {
        this.NorthSlab = NorthSlab;
    }

    /**
     * Get the reference of the eastern slab.
     * @return the reference of the eastern slab.
     */
    public Slab getEastSlab() {
        return(this.EastSlab);
    }

    /**
     * Set the reference to the eastern slab.
     * @param EastSlab the reference to the eastern slab.
     */
    public void setEastSlab(Slab EastSlab) {
        this.EastSlab = EastSlab;
    }

    /**
     * Get the reference of the southern slab.
     * @return the reference of the southern slab.
     */
    public Slab getSouthSlab() {
        return(this.SouthSlab);
    }

    /**
     * Set the reference to the southern slab.
     * @param SouthSlab the reference to the southern slab.
     */
    public void setSouthSlab(Slab SouthSlab) {
        this.SouthSlab = SouthSlab;
    }

    /**
     * Get the reference of the western slab.
     * @return the reference of the western slab.
     */
    public Slab getWestSlab() {
        return(this.WestSlab);
    }

    /**
     * Set the reference to the western slab.
     * @param WestSlab the reference to the western slab.
     */
    public void setWestSlab(Slab WestSlab) {
        this.WestSlab = WestSlab;
    }

}

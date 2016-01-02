package ravenlabyrinth;

import static ravenlabyrinth.RavenLabyrinth.WALL;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

/**
 * Represents a slab.
 * @author Thierry Baribaud
 * @version 1.0.0
 */
public class Slab extends JLabel {
       
    private int column;
    private int row;
    private int status;
    private int previousStatus;
    
    /**
     * Create a slab, default position (0, 0), status WALL
     */
    public Slab() {
        setColumn(0);
        setRow(0);
        setStatus(WALL);
        saveCurrentStatus();
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
}

package ravenlabyrinth;

import static ravenlabyrinth.RavenLabyrinth.WALL;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

/**
 *
 * @author Thierry Baribaud
 * @version 1.0.0
 */
public class Slab extends JLabel {
       
    private int i;
    private int j;
    private int status;
    
    public Slab() {
        setI(0);
        setJ(0);
        setStatus(WALL);
    }
    
    public void setI(int i) {
        this.i = i;
    }
    
    public int getI() {
        return(this.i);
    }

    public void setStatus(int status) {
        this.status = status;
        loadIcon(status);
    }
    
    public int getStatus() {
        return(this.status);
    }

    public void setJ(int j) {
        this.j = j;
    }
    
    public int getJ() {
        return(this.j);
    }

    public void loadIcon(int status) {
        
        String Filename;
        
        switch(status) {
            case RavenLabyrinth.FREE_SLAB: Filename = "/dalle_32x32.jpg";
                break;
            case RavenLabyrinth.REG_GEM: Filename = "/gemme_rouge_32x32.png";
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

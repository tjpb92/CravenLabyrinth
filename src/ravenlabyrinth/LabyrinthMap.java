package ravenlabyrinth;

import static ravenlabyrinth.RavenLabyrinth.ARRIVING_POINT;
import static ravenlabyrinth.RavenLabyrinth.FREE_SLAB;
import static ravenlabyrinth.RavenLabyrinth.COLUMNS;
import static ravenlabyrinth.RavenLabyrinth.STARTING_POINT;
import static ravenlabyrinth.RavenLabyrinth.BLUE_GEM;
import static ravenlabyrinth.RavenLabyrinth.RED_GEM;
import static ravenlabyrinth.RavenLabyrinth.ROWS;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;

/**
 * Class that describes the map of the labyrinth.
 * @author Thierry Baribaud
 * @version 1.0.0
 */
public class LabyrinthMap extends Panel {
   
    /**
     * Labyrinth map represented as a 2D matrix of Slab.
     */
    private Slab[][] Slabs;
    
    /**
     * When the raven lands on a slab, the current slab status is memorized in previousStatus.
    */
    private int previousStatus;
    
    /**
     * Constructor of LabyrinthMap class.
     */
    public LabyrinthMap() {
        

        int i, j;
                
        setBackground(Color.green);
        setLayout(new GridLayout(ROWS, COLUMNS));
        
        Slabs = new Slab[ROWS][COLUMNS];
        for(i = 0; i < ROWS; i++) {
            for(j = 0; j < COLUMNS; j++) {
                Slabs[i][j] = new Slab();
                add(Slabs[i][j]);
//                Thread.sleep(1000);
            }
        }
        
        i = 1;
        for (j=5; j < 18; j++) {
            Slabs[i][j].setStatus(FREE_SLAB);
        }
        Slabs[i][11].setStatus(RED_GEM);
        
        i++;
        Slabs[i][5].setStatus(FREE_SLAB);
        Slabs[i][17].setStatus(FREE_SLAB);

        i++;
        Slabs[i][5].setStatus(BLUE_GEM);
        Slabs[i][17].setStatus(BLUE_GEM);

        i++;
        Slabs[i][5].setStatus(FREE_SLAB);
        Slabs[i][17].setStatus(FREE_SLAB);
        
        i++;
        for (j=1; j < 22; j++) {
            Slabs[i][j].setStatus(FREE_SLAB);
        }
        Slabs[i][3].setStatus(BLUE_GEM);
        Slabs[i][7].setStatus(BLUE_GEM);
        Slabs[i][15].setStatus(RED_GEM);
        
        i++;
        Slabs[i][1].setStatus(FREE_SLAB);
        Slabs[i][5].setStatus(FREE_SLAB);
        Slabs[i][9].setStatus(FREE_SLAB);
        Slabs[i][13].setStatus(FREE_SLAB);
        Slabs[i][17].setStatus(FREE_SLAB);
        Slabs[i][21].setStatus(FREE_SLAB);
        
        i++;
        Slabs[i][1].setStatus(RED_GEM);
        Slabs[i][5].setStatus(RED_GEM);
        Slabs[i][9].setStatus(RED_GEM);
        Slabs[i][13].setStatus(BLUE_GEM);
        Slabs[i][17].setStatus(RED_GEM);
        Slabs[i][21].setStatus(RED_GEM);
        
        i++;
        Slabs[i][1].setStatus(FREE_SLAB);
        Slabs[i][5].setStatus(FREE_SLAB);
        Slabs[i][9].setStatus(FREE_SLAB);
        Slabs[i][13].setStatus(FREE_SLAB);
        Slabs[i][17].setStatus(FREE_SLAB);
        Slabs[i][21].setStatus(FREE_SLAB);

        i++;
        for (j=1; j < 10; j++) {
            Slabs[i][j].setStatus(FREE_SLAB);
        }
        for (j=13; j < 22; j++) {
            Slabs[i][j].setStatus(FREE_SLAB);
        }
        Slabs[i][3].setStatus(BLUE_GEM);
        Slabs[i][7].setStatus(RED_GEM);
        Slabs[i][15].setStatus(RED_GEM);
        Slabs[i][19].setStatus(BLUE_GEM);
        
        i++;
        Slabs[i][1].setStatus(FREE_SLAB);
        Slabs[i][5].setStatus(FREE_SLAB);
        Slabs[i][9].setStatus(FREE_SLAB);
        Slabs[i][13].setStatus(FREE_SLAB);
        Slabs[i][17].setStatus(FREE_SLAB);
        Slabs[i][21].setStatus(FREE_SLAB);

        i++;
        Slabs[i][1].setStatus(BLUE_GEM);
        Slabs[i][5].setStatus(BLUE_GEM);
        Slabs[i][9].setStatus(FREE_SLAB);
        Slabs[i][13].setStatus(FREE_SLAB);
        Slabs[i][17].setStatus(FREE_SLAB);
        Slabs[i][21].setStatus(BLUE_GEM);
        
        i++;
        Slabs[i][1].setStatus(FREE_SLAB);
        Slabs[i][5].setStatus(FREE_SLAB);
        Slabs[i][9].setStatus(FREE_SLAB);
        Slabs[i][13].setStatus(FREE_SLAB);
        Slabs[i][17].setStatus(FREE_SLAB);
        Slabs[i][21].setStatus(FREE_SLAB);

        i++;
        for (j=1; j < 10; j++) {
            Slabs[i][j].setStatus(FREE_SLAB);
        }
        for (j=13; j < 22; j++) {
            Slabs[i][j].setStatus(FREE_SLAB);
        }
        Slabs[i][3].setStatus(RED_GEM);
        Slabs[i][19].setStatus(RED_GEM);
    
        i++;
        Slabs[i][1].setStatus(RED_GEM);
        Slabs[i][21].setStatus(RED_GEM);

        i++;
        Slabs[i][1].setStatus(STARTING_POINT);
        Slabs[i][21].setStatus(ARRIVING_POINT);
 
    }
    
    /**
     * Memorizes the current slab status.
     * @param currentStatus current slab status.
     */
    public void setPreviousStatus(int currentStatus) {
        this.previousStatus = currentStatus;
    }
    
    /**
     * Return the previous slab status.
     * @return previous slab status.
     */
    public int getPreviousStatus() {
        return(this.previousStatus);
    }
    public void putOnMap(Raven MyRaven) {
        int currentRow, currentColumn, status;
        Slab CurrentSlab;
        
        currentRow = (int) MyRaven.getLocation().getX();
        currentColumn = (int) MyRaven.getLocation().getY();
        
        CurrentSlab = Slabs[currentRow][currentColumn];
        CurrentSlab.saveCurrentStatus();
        status = CurrentSlab.getStatus();
        if (status == RED_GEM || status == BLUE_GEM) {
            MyRaven.setGem(status);
        }
        CurrentSlab.setStatus(MyRaven.getStatus());
    }
    
    /**
     * Move raven one step to the north.
     * @param MyRaven raven to move north.
     */
    public void moveNorth(Raven MyRaven) {
        int currentRow, currentColumn;
        Slab CurrentSlab;
        
        currentRow = (int) MyRaven.getLocation().getX();
        currentColumn = (int) MyRaven.getLocation().getY();
        
        CurrentSlab = Slabs[currentRow][currentColumn];
        CurrentSlab.restaurePreviousStatus();
        
        MyRaven.moveNorth();
        
        putOnMap(MyRaven);
    }

    /**
     * Move raven one step to the east.
     * @param MyRaven raven to move east.
     */
    public void moveEast(Raven MyRaven) {
        int currentRow, currentColumn;
        Slab CurrentSlab;
        
        currentRow = (int) MyRaven.getLocation().getX();
        currentColumn = (int) MyRaven.getLocation().getY();
        
        CurrentSlab = Slabs[currentRow][currentColumn];
        CurrentSlab.restaurePreviousStatus();
        
        MyRaven.moveEast();
        
        putOnMap(MyRaven);
    }

    /**
     * Move raven one step to the south.
     * @param MyRaven raven to move south.
     */
    public void moveSouth(Raven MyRaven) {
        int currentRow, currentColumn;
        Slab CurrentSlab;
        
        currentRow = (int) MyRaven.getLocation().getX();
        currentColumn = (int) MyRaven.getLocation().getY();
        
        CurrentSlab = Slabs[currentRow][currentColumn];
        CurrentSlab.restaurePreviousStatus();
        
        MyRaven.moveSouth();
        
        putOnMap(MyRaven);
    }
    
    /**
     * Move raven one step to the west.
     * @param MyRaven raven to move west.
     */
    public void moveWest(Raven MyRaven) {
        int currentRow, currentColumn;
        Slab CurrentSlab;
        
        currentRow = (int) MyRaven.getLocation().getX();
        currentColumn = (int) MyRaven.getLocation().getY();
        
        CurrentSlab = Slabs[currentRow][currentColumn];
        CurrentSlab.restaurePreviousStatus();
        
        MyRaven.moveWest();
        
        putOnMap(MyRaven);
    }
}

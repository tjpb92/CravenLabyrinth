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
 * @version 1.0.5
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

        int row, column;
        Slab CurrentSlab;
        Slab TempSlab;
        int i;
                        
        setBackground(Color.green);
        setLayout(new GridLayout(ROWS, COLUMNS));
        
        CurrentSlab = null;
        TempSlab = null;

        Slabs = new Slab[ROWS][COLUMNS];
        for(row = 0; row < ROWS; row++) {
            for(column = 0; column < COLUMNS; column++) {
                Slabs[row][column] = new Slab(row, column);
                add(Slabs[row][column]);
            }
        }
        
        // Fill four directions references
        for(row = 0; row < ROWS; row++) {
            for (column = 0; column < COLUMNS; column++) {
                CurrentSlab = Slabs[row][column];

                // Fill north reference if possible
                i = row - 1;
                if (i > 0 ) {
                    TempSlab = Slabs[i][column];
                    CurrentSlab.setNorthSlab(TempSlab);
                    TempSlab.setSouthSlab(CurrentSlab);
                }
                
                // Fill east reference if possible
                i = column + 1;
                if (i < COLUMNS) {
                    TempSlab = Slabs[row][i];
                    CurrentSlab.setEastSlab(TempSlab);
                    TempSlab.setWestSlab(CurrentSlab);
                }
                
                // Fill south reference if possible
                i = row + 1;
                if (i < ROWS) {
                    TempSlab = Slabs[i][column];
                    CurrentSlab.setSouthSlab(TempSlab);
                    TempSlab.setNorthSlab(CurrentSlab);
                }
                
                // Fill west reference if possible
                i = column - 1;
                if (i > 0) {
                    TempSlab = Slabs[row][i];
                    CurrentSlab.setWestSlab(TempSlab);
                    TempSlab.setEastSlab(CurrentSlab);
                }
            }
        }
        
        row = 1;
        for (column=5; column < 18; column++) {
            Slabs[row][column].setStatus(FREE_SLAB);
        }
        Slabs[row][11].setStatus(RED_GEM);
        
        row++;
        Slabs[row][5].setStatus(FREE_SLAB);
        Slabs[row][17].setStatus(FREE_SLAB);

        row++;
        Slabs[row][5].setStatus(BLUE_GEM);
        Slabs[row][17].setStatus(BLUE_GEM);

        row++;
        Slabs[row][5].setStatus(FREE_SLAB);
        Slabs[row][17].setStatus(FREE_SLAB);
        
        row++;
        for (column=1; column < 22; column++) {
            Slabs[row][column].setStatus(FREE_SLAB);
        }
        Slabs[row][3].setStatus(BLUE_GEM);
        Slabs[row][7].setStatus(BLUE_GEM);
        Slabs[row][15].setStatus(RED_GEM);
        
        row++;
        Slabs[row][1].setStatus(FREE_SLAB);
        Slabs[row][5].setStatus(FREE_SLAB);
        Slabs[row][9].setStatus(FREE_SLAB);
        Slabs[row][13].setStatus(FREE_SLAB);
        Slabs[row][17].setStatus(FREE_SLAB);
        Slabs[row][21].setStatus(FREE_SLAB);
        
        row++;
        Slabs[row][1].setStatus(RED_GEM);
        Slabs[row][5].setStatus(RED_GEM);
        Slabs[row][9].setStatus(RED_GEM);
        Slabs[row][13].setStatus(BLUE_GEM);
        Slabs[row][17].setStatus(RED_GEM);
        Slabs[row][21].setStatus(RED_GEM);
        
        row++;
        Slabs[row][1].setStatus(FREE_SLAB);
        Slabs[row][5].setStatus(FREE_SLAB);
        Slabs[row][9].setStatus(FREE_SLAB);
        Slabs[row][13].setStatus(FREE_SLAB);
        Slabs[row][17].setStatus(FREE_SLAB);
        Slabs[row][21].setStatus(FREE_SLAB);

        row++;
        for (column=1; column < 10; column++) {
            Slabs[row][column].setStatus(FREE_SLAB);
        }
        for (column=13; column < 22; column++) {
            Slabs[row][column].setStatus(FREE_SLAB);
        }
        Slabs[row][3].setStatus(BLUE_GEM);
        Slabs[row][7].setStatus(RED_GEM);
        Slabs[row][15].setStatus(RED_GEM);
        Slabs[row][19].setStatus(BLUE_GEM);
        
        row++;
        Slabs[row][1].setStatus(FREE_SLAB);
        Slabs[row][5].setStatus(FREE_SLAB);
        Slabs[row][9].setStatus(FREE_SLAB);
        Slabs[row][13].setStatus(FREE_SLAB);
        Slabs[row][17].setStatus(FREE_SLAB);
        Slabs[row][21].setStatus(FREE_SLAB);

        row++;
        Slabs[row][1].setStatus(BLUE_GEM);
        Slabs[row][5].setStatus(BLUE_GEM);
        Slabs[row][9].setStatus(FREE_SLAB);
        Slabs[row][13].setStatus(FREE_SLAB);
        Slabs[row][17].setStatus(FREE_SLAB);
        Slabs[row][21].setStatus(BLUE_GEM);
        
        row++;
        Slabs[row][1].setStatus(FREE_SLAB);
        Slabs[row][5].setStatus(FREE_SLAB);
        Slabs[row][9].setStatus(FREE_SLAB);
        Slabs[row][13].setStatus(FREE_SLAB);
        Slabs[row][17].setStatus(FREE_SLAB);
        Slabs[row][21].setStatus(FREE_SLAB);

        row++;
        for (column=1; column < 10; column++) {
            Slabs[row][column].setStatus(FREE_SLAB);
        }
        for (column=13; column < 22; column++) {
            Slabs[row][column].setStatus(FREE_SLAB);
        }
        Slabs[row][3].setStatus(RED_GEM);
        Slabs[row][19].setStatus(RED_GEM);
    
        row++;
        Slabs[row][1].setStatus(RED_GEM);
        Slabs[row][21].setStatus(RED_GEM);

        row++;
        Slabs[row][1].setStatus(STARTING_POINT);
        Slabs[row][21].setStatus(ARRIVING_POINT);
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
        int status;
        Slab CurrentSlab;
        
        CurrentSlab = MyRaven.getCurrentSlab();
        CurrentSlab.saveCurrentStatus();
        status = CurrentSlab.getStatus();
        if (status == RED_GEM || status == BLUE_GEM) {
            MyRaven.setPreviousGem(status);
        }
        CurrentSlab.setStatus(MyRaven.getStatus());
    }
    
    /**
     * Remove the raven from the map.
     * @param MyRaven the raven to remove from the map.
     */
    public void takeOffMap(Raven MyRaven) {
        Slab CurrentSlab;
        
        CurrentSlab = MyRaven.getCurrentSlab();
        CurrentSlab.restaurePreviousStatus();
    }
    
    /**
     * Return the reference of the slab of coordinate (row, column)
     * @param row ordinate of the slab,
     * @param column abscissa of the slab,
     * @return reference of the slab.
     */
    public Slab getSlab(int row, int column) {
 
        return(Slabs[row][column]);
    }

    /**
     * Return the reference of the starting point.
     * @return the reference of the starting point.
     */
    public Slab getStartingPoint() {
        return(getSlab(15, 1));
    }
}

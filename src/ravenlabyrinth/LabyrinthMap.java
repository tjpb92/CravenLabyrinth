package ravenlabyrinth;

import static ravenlabyrinth.RavenLabyrinth.ARRIVING_POINT;
import static ravenlabyrinth.RavenLabyrinth.FREE_SLAB;
import static ravenlabyrinth.RavenLabyrinth.COLUMNS;
import static ravenlabyrinth.RavenLabyrinth.STARTING_POINT;
import static ravenlabyrinth.RavenLabyrinth.BLUE_GEM;
import static ravenlabyrinth.RavenLabyrinth.REG_GEM;
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
     * Constructor of LabyrinthMap class.
     */
    public LabyrinthMap() {
        
        Slab[][] Slabs;
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
        Slabs[i][11].setStatus(REG_GEM);
        
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
        Slabs[i][15].setStatus(REG_GEM);
        
        i++;
        Slabs[i][1].setStatus(FREE_SLAB);
        Slabs[i][5].setStatus(FREE_SLAB);
        Slabs[i][9].setStatus(FREE_SLAB);
        Slabs[i][13].setStatus(FREE_SLAB);
        Slabs[i][17].setStatus(FREE_SLAB);
        Slabs[i][21].setStatus(FREE_SLAB);
        
        i++;
        Slabs[i][1].setStatus(REG_GEM);
        Slabs[i][5].setStatus(REG_GEM);
        Slabs[i][9].setStatus(REG_GEM);
        Slabs[i][13].setStatus(BLUE_GEM);
        Slabs[i][17].setStatus(REG_GEM);
        Slabs[i][21].setStatus(REG_GEM);
        
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
        Slabs[i][7].setStatus(REG_GEM);
        Slabs[i][15].setStatus(REG_GEM);
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
        Slabs[i][3].setStatus(REG_GEM);
        Slabs[i][19].setStatus(REG_GEM);
    
        i++;
        Slabs[i][1].setStatus(REG_GEM);
        Slabs[i][21].setStatus(REG_GEM);

        i++;
        Slabs[i][1].setStatus(STARTING_POINT);
        Slabs[i][21].setStatus(ARRIVING_POINT);
 
    }
}

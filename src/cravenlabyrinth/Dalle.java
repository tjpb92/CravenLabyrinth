/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cravenlabyrinth;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

/**
 *
 * @author Thierry Baribaud
 */
public class Dalle extends JLabel {
       
    private int i;
    private int j;
    private int status;
    
    private Dalle VersLeNord;
    private Dalle VersLEst;
    private Dalle VersLeSud;
    private Dalle VersLOuest;
    
    public Dalle() {
        setI(0);
        setJ(0);
        setStatus(CravenLabyrinth.MUR);
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
            case CravenLabyrinth.CASE_LIBRE: Filename = "/dalle_32x32.jpg";
                break;
            case CravenLabyrinth.GEMME_ROUGE: Filename = "/gemme_rouge_32x32.png";
                break;
            case CravenLabyrinth.GEMME_BLEUE: Filename = "/gemme_bleue_32x32.png";
                break;
            case CravenLabyrinth.CORBEAU: Filename = "/corbeau_03_32x32.jpg";
                break;
            case CravenLabyrinth.DEPART: Filename = "/entree_32x32.jpg";
                break;
            case CravenLabyrinth.ARRIVEE: Filename = "/sortie_32x32.jpg";
                break;
            default: Filename = "/mur_32x32.jpg";
                break;
        }
        setIcon(new ImageIcon(getClass().getResource(Filename)));              
    }
}

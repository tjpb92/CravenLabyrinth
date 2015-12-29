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
    
    private static final int MUR = 0;
    private static final int CASE_LIBRE = 1;
    private static final int GEMME_ROUGE = 2;
    private static final int GEMME_BLEUE = 3;
    private static final int CORBEAU = 4;
    private static final int NORD = 11;
    private static final int EST = 21;
    private static final int SUD = 31;
    private static final int OUEST = 41;
    private static final int DEPART = 50;
    private static final int ARRIVEE = 60;
    
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
        setStatus(MUR);
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
            case CASE_LIBRE: Filename = new String("/dalle_32x32.jpg");
                break;
            case GEMME_ROUGE: Filename = new String("/gemme_rouge_32x32.png");
                break;
            case GEMME_BLEUE: Filename = new String("/gemme_bleue_32x32.png");
                break;
            case CORBEAU: Filename = new String("/corbeau_03_32x32.jpg");
                break;
            case DEPART: Filename = new String("/entree_32x32.jpg");
                break;
            case ARRIVEE: Filename = new String("/sortie_32x32.jpg");
                break;
            default: Filename = new String("/mur_32x32.jpg");
                break;
        }
//        System.out.println("Filename=" + Filename + ", getClass()=" + getClass() + 
//                ", URL=" + getClass().getResource("/mur_32x32.jpg"));
        setIcon(new ImageIcon(getClass().getResource(Filename)));
//        setIcon(new ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/image.png")));
//        setIcon(new ImageIcon(getClass().getResource("Images/mur_32x32.jpg")));
//        setIcon(new ImageIcon("Images/mur_32x32.jpg"));
                
    }
}

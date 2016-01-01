package ravenlabyrinth;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author Thierry Baribaud
 * @version 1.0.0
 */


public class RavenLabyrinth {

    protected static final int WALL = 0;
    protected static final int FREE_SLAB = 1;
    protected static final int REG_GEM = 2;
    protected static final int BLUE_GEM = 3;
    protected static final int RAVEN = 4;
    protected static final int NORTH = 11;
    protected static final int EAST = 21;
    protected static final int SOUTH = 31;
    protected static final int WEST = 41;
    protected static final int STARTING_POINT = 50;
    protected static final int ARRIVING_POINT = 60;

    protected static final int ROWS = 17;
    protected static final int COLUMNS = 23;
    
    private static final int ICON_SIZE = 32;  
    private static final int HEIGHT = 664;
    private static final int WIDTH = 736;
   

    public RavenLabyrinth() {
        JFrame MyWindow;
        LabyrinthMap MyLabyrinthMap;
        
        JPanel CommandPanel;
        JPanel PalettePanel;
        JPanel TopPanel;
        JPanel DebugPanel;
        
        ImageIcon RedGemIcon;
        ImageIcon BlueGemIcon;
        ImageIcon WallIcon;
        ImageIcon SlabIcon;
        ImageIcon RavenIcon;
        ImageIcon StartingPointIcon;
        ImageIcon SortieIcon;
        
        JLabel RedGemLabel;
        JLabel BlueGemLabel;
        JLabel WallLabel;
        JLabel SlabLabel;
        JLabel RavenLabel;
        JLabel StartingPointLabel;
        JLabel ArrivingPoint;
        
        AgainButton TryAgain;
        SolveButton Solve;
        StopButton Stop;
        
        int i;
        int j;
        
        RedGemIcon = new ImageIcon("Images/gemme_rouge_32x31.png");
        BlueGemIcon = new ImageIcon("Images/gemme_bleue_32x29.png");
        WallIcon = new ImageIcon("Images/mur_32x32.jpg");
        SlabIcon = new ImageIcon("Images/dalle_32x32.jpg");
        RavenIcon = new ImageIcon("Images/corbeau_03_32x32.jpg");
        StartingPointIcon = new ImageIcon("Images/entree_32x32.jpg");
        SortieIcon = new ImageIcon("Images/sortie_32x32.jpg");
        
        TryAgain = new AgainButton();
        Solve = new SolveButton();
        Stop = new StopButton();
        
        MyWindow = new JFrame();
        MyWindow.setTitle("Enigme du corbeau et de la marelle");
        MyWindow.setPreferredSize(new Dimension(WIDTH, HEIGHT));
//        MyWindow.setLocationRelativeTo(null);
        MyWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CommandPanel = new JPanel();
        CommandPanel.setBackground(Color.red);
        CommandPanel.setLayout(new FlowLayout());        
//        CommandPanel.setPreferredSize(new Dimension(WIDTH, ICON_SIZE));
        CommandPanel.add(TryAgain);
        CommandPanel.add(Solve);
        CommandPanel.add(Stop);
        
        PalettePanel = new JPanel();
        PalettePanel.setBackground(Color.blue);
        PalettePanel.setLayout(new FlowLayout());        
        PalettePanel.setPreferredSize(new Dimension(WIDTH, ICON_SIZE));
        
        RedGemLabel = new JLabel();
        RedGemLabel.setIcon(RedGemIcon);
        PalettePanel.add(RedGemLabel);
        
        BlueGemLabel = new JLabel();
        BlueGemLabel.setIcon(BlueGemIcon);
        PalettePanel.add(BlueGemLabel);
       
        WallLabel = new JLabel();
        WallLabel.setIcon(WallIcon);
        PalettePanel.add(WallLabel);
        
        SlabLabel = new JLabel();
        SlabLabel.setIcon(SlabIcon);
        PalettePanel.add(SlabLabel);
        
        RavenLabel = new JLabel();
        RavenLabel.setIcon(RavenIcon);
        PalettePanel.add(RavenLabel);

        StartingPointLabel = new JLabel();
        StartingPointLabel.setIcon(StartingPointIcon);
        PalettePanel.add(StartingPointLabel);

        ArrivingPoint = new JLabel();
        ArrivingPoint.setIcon(SortieIcon);
        PalettePanel.add(ArrivingPoint);

        TopPanel = new JPanel();
        TopPanel.setBackground(Color.pink);
        TopPanel.setLayout(new GridLayout(2, 1));
        TopPanel.add(CommandPanel);
        TopPanel.add(PalettePanel);
        
        MyLabyrinthMap = new LabyrinthMap();
       
        DebugPanel = new JPanel();
        DebugPanel.setBackground(Color.yellow);
        
        MyWindow.setLayout(new BorderLayout());
        MyWindow.getContentPane().add(TopPanel, BorderLayout.NORTH);
        MyWindow.getContentPane().add(MyLabyrinthMap, BorderLayout.CENTER);
        MyWindow.getContentPane().add(DebugPanel, BorderLayout.SOUTH);
        MyWindow.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/corbeau_02_32x32.jpg")));
        
        MyWindow.pack();
        MyWindow.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RavenLabyrinth MyCravenLabyrinth = new RavenLabyrinth();
        
}
}

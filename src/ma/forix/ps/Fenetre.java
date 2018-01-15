package ma.forix.ps;

import ma.forix.ps.buttons.jouer;

import javax.swing.*;

public class Fenetre extends JFrame {

    Panel panel = new Panel();

    static int x=0;
    static int y=0;
    boolean isX=true;

    public Fenetre(){
        this.setTitle("Planetum Spatium");
        this.setSize(735, 575);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        this.setContentPane(panel);
        this.setVisible(true);
        Trame();
    }

    public void Trame(){
        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("ERREUR: Interupted exception");
            }
            panel.repaint();


        }
    }
}

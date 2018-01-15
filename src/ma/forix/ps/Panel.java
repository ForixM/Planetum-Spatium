package ma.forix.ps;

import ma.forix.ps.buttons.*;

import javax.swing.*;
import java.awt.*;

import static ma.forix.ps.Main.*;

public class Panel extends JPanel {
    jouer Jouer = new jouer();
    Construction construction = new Construction();
    ConstructMine CMI = new ConstructMine();
    ConstructUsine CU = new ConstructUsine();
    ConstructMaison CMA = new ConstructMaison();
    ConstructEnergie CE = new ConstructEnergie();
    Spatial spatial = new Spatial();
    SpatialVaisseau SV = new SpatialVaisseau();

    public void paintComponent(Graphics g){
        if (background == "mainmenu") {
            g.setColor(new Color(255, 255, 255));
            g.fillRect(0, 0, this.getSize().width, this.getSize().height);
            g.drawImage(new ImageIcon("src/resources/textures/mainmenu/MainMenu.png").getImage(), 0, 0, null);

            Jouer.setBounds(this.getSize().width / 2 - 150, this.getSize().height / 2 + 100, 300, 150);
            this.add(Jouer);
        }

        if (background == "Nutroria"){
            if (Jouer.isVisible() == true) {
                Jouer.setVisible(false);
            }
           // g.setColor(new Color(255, 255, 255));
           // g.fillRect(0, 0, this.getSize().width, this.getSize().height);
            g.drawImage(new ImageIcon("src/resources/textures/planets/Nutroria.png").getImage(), 0, 0, null);

            construction.setBounds(100, this.getSize().height-50, 150, 45);
            CMI.setBounds(100, this.getHeight()-135, 80, 80);
            CU.setBounds(185, this.getHeight()-135, 80, 80);
            CMA.setBounds(270, this.getHeight()-135, 80, 80);
            CE.setBounds(355, this.getHeight()-135, 80, 80);
            spatial.setBounds(400, this.getSize().height-50, 150, 45);
            SV.setBounds(400, this.getHeight()-135, 80, 80);

            this.add(construction);
            this.add(CMI);
            this.add(CU);
            this.add(CMA);
            this.add(CE);
            this.add(spatial);
            this.add(SV);

            if (constructionVisible){
                CMI.setVisible(true);
                CU.setVisible(true);
                CMA.setVisible(true);
                CE.setVisible(true);
            }
            else{
                CMI.setVisible(false);
                CU.setVisible(false);
                CMA.setVisible(false);
                CE.setVisible(false);
            }
        }
    }
}

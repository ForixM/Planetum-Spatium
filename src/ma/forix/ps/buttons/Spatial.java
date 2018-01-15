package ma.forix.ps.buttons;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import static ma.forix.ps.Main.*;

public class Spatial extends JButton {
    Image img;

    public Spatial(){
        this.setBorderPainted(false);
        try{
            img = ImageIO.read(new File("src/resources/textures/buttons/Spatial button.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.addActionListener(new SpatialL());
    }

    public void paintComponent(Graphics g){
        g.drawImage(img, this.getWidth(), this.getHeight(), 150, 45,this);
    }

    private class SpatialL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("SpatialVisible = "+spatialVisible);
            if (spatialVisible) spatialVisible=false;
            else spatialVisible = true;
        }
    }
}

package ma.forix.ps.buttons;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class ConstructEnergie extends JButton {
    private String name;
    private Image img;

    public ConstructEnergie(String str){
        super(str);
        this.name=str;
        try{
            img = ImageIO.read(new File("src/resources/textures/gui/Construction Energie.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.addActionListener(new ConstructEnergieL());
    }

    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    }

    private class ConstructEnergieL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Construction d'une Energie effectué!");
        }
    }
}

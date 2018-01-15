package ma.forix.ps.buttons;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class ConstructUsine extends JButton {
    private String name;
    private Image img;

    public ConstructUsine(String str){
        super(str);
        this.name=str;
        try{
            img = ImageIO.read(new File("src/resources/textures/gui/Construction Usine.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.addActionListener(new ConstructUsineL());
    }

    @Override
    public void paintComponents(Graphics g) {
        g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    }

    private class ConstructUsineL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Construction d'une Usine effectué!");
        }
    }
}

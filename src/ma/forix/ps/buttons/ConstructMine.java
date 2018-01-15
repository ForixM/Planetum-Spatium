package ma.forix.ps.buttons;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class ConstructMine extends JButton {
    private String name;
    private Image img;

    public ConstructMine(String str){
        super(str);
        this.name=str;
        try{
            img = ImageIO.read(new File("src/resources/textures/gui/Construction Mine.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.addActionListener(new ConstructMineL());
    }

    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    }

    private class ConstructMineL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Construction d'une Mine effectué!");
        }
    }
}

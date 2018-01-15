package ma.forix.ps.buttons;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import static ma.forix.ps.Main.*;

public class Construction extends JButton {
    private String name;
    private Image img;

    public Construction(String str){
        super(str);
        this.setBorderPainted(false);
        this.name=str;
        try{
            img = ImageIO.read(new File("src/resources/textures/gui/Construction.png"));
        }catch (IOException e){
            e.printStackTrace();
        }
        this.addActionListener(new constructionL());
    }

    public void paintComponent(Graphics g){
        g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    }

    private class constructionL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("ConstructionVisible = "+constructionVisible);
            if (constructionVisible) constructionVisible = false;
            else constructionVisible = true;
        }
    }
}

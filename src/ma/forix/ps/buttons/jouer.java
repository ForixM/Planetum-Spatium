package ma.forix.ps.buttons;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import static ma.forix.ps.Main.*;
public class jouer extends JButton {
    private String name;
    private Image img;

    public jouer(String str){
        super(str);
        this.setBorderPainted(false);
        this.name = str;
        try {
            img = ImageIO.read(new File("src/resources/textures/buttons/Jouer.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.addActionListener(new jouerL());
    }

    public void paintComponent(Graphics g){
        g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    }

    private class jouerL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Commencement du jeu");
            background = "Nutroria";
            System.out.println(background);
        }
    }
}

package Main;

import javax.swing.*;
import java.awt.*;

public class Tela extends JPanel {

    public Tela(){

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawRect(50,50,100,100);
    }
}

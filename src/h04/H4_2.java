package h04;

import java.awt.*;
import java.applet.*;

public class H4_2 extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRect(300,300,300,300);
        g.drawLine(300,300,450,150);
        g.drawLine(450,150,600,300);
        g.drawRect(500,450,75,150);
        g.setColor(Color.red);
        g.fillRect(500,450,75,150);
        g.drawRect(425,200,60,60);
        g.setColor(Color.blue);
        g.fillRect(425,200,60,60);
    }

}






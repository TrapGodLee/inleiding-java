package h04;

import java.awt.*;
import java.applet.*;

public class H4_4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(1,200,300,200);
        g.setColor(Color.blue);
        g.fillRect(10,160,50,40);
        g.setColor(Color.red);
        g.fillRect(70,100,50,100);
        g.setColor(Color.green);
        g.fillRect(130,120,50,80);
        g.setColor(Color.black);
        g.drawString("Valerie", 10, 210 );
        g.drawString("Jeroen",70,210);
        g.drawString("Hans",130,210);
        g.drawLine(1,1,1,200);
        g.drawLine(1,180,5,180);
        g.drawLine(1,160,5,160);
        g.drawLine(1,140,5,140);
        g.drawLine(1,120,5,120);
        g.drawLine(1,100,5,100);
        g.drawLine(1,80,5,80);
        g.drawLine(1,60,5,60);
        g.drawLine(1,40,5,40);
        g.drawLine(1,20,5,20);
    }
}





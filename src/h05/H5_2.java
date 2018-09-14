package h05;

import java.awt.*;
import java.applet.*;

public class H5_2 extends Applet {
    int Valerie;
    int Jeroen;
    int Hans;
    int Valerie2;
    int Jeroen2;
    int Hans2;

    public void init() {
        //wat hier eraf gaat.
        Valerie = 160;
        Jeroen = 100;
        Hans = 120;
        //moet hier erbij.
        Valerie2 = 40;
        Jeroen2 = 100;
        Hans2 = 80;
    }

    public void paint(Graphics g) {
        g.drawLine(1,200,300,200);
        g.setColor(Color.blue);
        g.fillRect(10,Valerie,50,Valerie2);
        g.setColor(Color.red);
        g.fillRect(70,Jeroen,50,Jeroen2);
        g.setColor(Color.green);
        g.fillRect(130,Hans,50,Hans2);
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
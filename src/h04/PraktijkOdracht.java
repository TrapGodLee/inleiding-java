package h04;
//import java applet
    import java.awt.*;
    import java.applet.*;

    //start class
public class PraktijkOdracht extends Applet {
    public void init () {


    }

    public void paint(Graphics g) {

        g.drawLine(10, 10, 300, 10);
        g.drawString("Lijn", 150, 30);
        g.drawRect(10, 40, 290, 100);
        g.drawString("Rechthoek", 130, 155);
        g.setColor(Color.magenta);
        g.fillRect(320, 40, 290,100);
        g.setColor(Color.black);
        g.drawOval(320, 40, 290, 100);
        g.drawString("Gevulde rechthoek met ovaal", 390, 155);
        g.drawOval(620, 40, 290, 100);
        g.setColor(Color.magenta);
        g.fillArc(620, 40, 290, 100, 0, 45);
        g.setColor(Color.black);
        g.drawString("Taalpunt met ovaal eromheen", 680, 155);
        g.drawRoundRect(10,170, 290, 100, 15, 15);
        g.drawString("Afgeronde rechthoek", 100, 290);
        g.drawOval(315,170, 290, 100);
        g.drawString("Gevulde ovaal", 410, 290);
        g.setColor(Color.magenta);
        g.fillArc(315,170, 290, 100, 0, 400);
        g.setColor(Color.black);
        g.drawOval(700, 160, 120,120);
        g.drawString("Cirkel", 740, 300);
    }
}

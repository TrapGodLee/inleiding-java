package h05;


import java.awt.*;
import java.applet.*;

public class H5_1 extends Applet{


    //declaratie
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        //initialisatie
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 290;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        //lijn
        g.drawLine(10, 10, 300, 10);
        g.drawString("Lijn", 150, 30);
        //vierkant
        g.drawRect(10, 40, breedte, hoogte);
        g.drawString("Rechthoek", 130, 155);
        g.setColor(Color.magenta);
        //gevullde rechthoek
        g.fillRect(320, 40, breedte,hoogte);
        g.setColor(Color.black);
        //oval
        g.drawOval(320, 40, breedte, hoogte);
        g.drawString("Gevulde rechthoek met ovaal", 390, 155);
        //gevulde oval
        g.drawOval(620, 40, breedte, hoogte);
        g.setColor(Color.magenta);
        g.fillArc(620, 40, breedte, hoogte, 0, 45);
        g.setColor(Color.black);
        g.drawString("Taalpunt met ovaal eromheen", 680, 155);
        g.drawRoundRect(10,170, breedte, hoogte, 15, 15);
        g.drawString("Afgeronde rechthoek", 100, 290);
        g.drawOval(315,170, breedte, hoogte);
        g.drawString("Gevulde ovaal", 410, 290);
        g.setColor(Color.magenta);
        g.fillArc(315,170, breedte, hoogte, 0, 400);
        g.setColor(Color.black);
        g.drawOval(700, 160, 120,120);
        g.drawString("Cirkel", 740, 300);
    }

}

package h02;
/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*
4
*/

//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet
public class Show extends Applet {

    //een (lege) methode die de Applet initialiseert

    //Voorbeeld 2.2

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Lesley!!", 50, 60);
        g.setColor(Color.yellow);
        g.drawString("Reynolds!!", 70, 80);
    }
}





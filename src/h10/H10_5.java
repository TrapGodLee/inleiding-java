package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H10_5 extends Applet{

    TextField invoer;
    Button knop;
    double gemiddelde;
    double getal;
    double teller;
    double totaal;

    public void init(){
        invoer = new TextField(10);
        invoer.addActionListener(new invoerHandler());

        knop = new Button("gemiddelde");
        knop.addActionListener(new knopHandler());

        add(invoer);
        add(knop);
    }

    public void paint(Graphics g) {

        g.drawString("Het gemiddelde" + gemiddelde, 60, 60);
    }

    class knopHandler implements ActionListener {
        public void actionPerformed(ActionEvent e){
            gemiddelde = totaal/teller;
            repaint();
        }
    }
    class invoerHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String invoerstring = invoer.getText();
            getal = Double.parseDouble(invoerstring);
            totaal += getal;
            teller += 1;
            invoer.setText("");

        }

    }

}

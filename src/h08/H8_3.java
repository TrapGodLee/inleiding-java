package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H8_3 extends Applet {
    //declaratie
    //declaratie van tekstvak
    TextField tekstvak;

    //declaratie van Label
    Label label;

    //declaratie van Button
    Button ok;

    //declaratie van Double
    double btw;

    public void init() {
        //intiation
        //initiation van textfield
        tekstvak = new TextField("", 14);
        tekstvak.addActionListener(new KnopListener());
        add(tekstvak);

        //dinitiation van Label
        label = new Label("bereken uw btw");
        add(label);

        //initiation van Button
        ok = new Button("OK");
        ok.addActionListener(new KnopListener());
        add(ok);

    }

    public void paint(Graphics g){
        //print in applet
        //resultaat
        g.drawString("Bedrag inc. btw is:" + (btw*1.21),40 , 70);
    }
    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            //action listener
            //getText haalt de nummer of tekst uit tekstvak op en gebruikt het om de berekening te maken
            String s= tekstvak.getText();

            //parse onthoud de nummer data
            btw= Double.parseDouble(s);

            //refresh
            repaint();
        }
    }
}

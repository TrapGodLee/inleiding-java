package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H8_1 extends Applet {
    TextField tekstvak;
    Label label;
    Button knop;;
    Button dop;
    String schermtekst;
    String hallo;



    public void init() {
    setSize(1000, 1000);
    KnopListener k1 = new KnopListener();
    tekstvak = new TextField("", 30);
    knop = new Button("OK");
    knop.addActionListener(k1);
    dop = new Button("Reset");
    dop.addActionListener(new Wis());
    tekstvak.addActionListener(k1);
    add(tekstvak);
    add(knop);
    add(dop);
    hallo = "";
    }

    public void paint(Graphics g) {
        g.drawString("type hier iets en druk dan op OK"+ hallo, 50, 60);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            hallo = new String();
            hallo = tekstvak.getText();
            repaint();
        }
    }

     class Wis implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                tekstvak.setText("");
                repaint();
            }
     }

    }


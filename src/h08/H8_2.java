package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H8_2 extends Applet {
    //knoppen
    Button knop;
    Button knop2;
    Button knop3;
    Button knop4;
    int teller;
    int teller2;
    int teller3;
    int teller4;
    int totaal;



    public void init() {
        setSize(500, 500);
        //actionlister benaming
        KnopListener kl = new KnopListener();

        //1ste button
        knop = new Button();
        knop.setLabel("vrouwen");
        add(knop);

        //actionlistener 1
        knop.addActionListener(kl);

        //2de button
        knop2 = new Button();
        knop2.setLabel("mannen");
        add(knop2);
        //actionlistener 1
        knop2.addActionListener(new knop2());

        //3de button
        knop3 = new Button();
        knop3.setLabel("potentiële vrouwen");
        add(knop3);
        //actionlistener 1
        knop3.addActionListener(new knop3());

        //4de button
        knop4 = new Button();
        knop4.setLabel("potentiële mannen");
        add(knop4);
        //actionlistener 1
        knop4.addActionListener(new knop4());

        //tellers gezet op 0
        teller = 0;
        teller2 = 0;
        teller3 = 0;
        teller4 = 0;

    }

    public void paint(Graphics g) {
        //painten van opdracht
        g.drawString("aantal vrouwen" + teller, 50, 60);
        g.drawString("aantal mannen" + teller2, 50, 80);
        g.drawString("aantal potentiële vrouwen" + teller3, 50, 100);
        g.drawString("aantal potentiële mannen" + teller4, 50, 120);
        g.drawString("Totaal" + totaal, 50, 140);
        totaal = teller + teller2 + teller3 + teller4;
    }

    //1ste Performed action
    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            teller++;
            totaal++;
            repaint();
        }
    }

    //2de Performed action
    class knop2 implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            teller2++;
            totaal++;
            repaint();
        }
    }

    //3de Performed action
    class knop3 implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            teller3++;
            totaal++;
            repaint();
        }
    }

    //4de Performed action
    class knop4 implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            teller4++;
            totaal++;
            repaint();
        }
    }



}

package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class H10_1 extends Applet {
    private int getal;
    TextField tekstvak;
    String tekst;
    String tekst2;
    Label label;

    int hoogste;

    public void init() {
        tekstvak = new TextField("", 10);
        tekstvak.addActionListener(new nummerListener());
        tekst = "";
        tekst2 = "";
        hoogste = Integer.MIN_VALUE;

        label = new Label("type een getal");

        add(label);
        add(tekstvak);

    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 45);
        g.drawString(tekst2, 50, 60);
    }

    class nummerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;

            s = tekstvak.getText();
            getal = Integer.parseInt(s);
            if (getal > hoogste) {
                hoogste = getal;
                tekst = "Het hoogste getal is: " + hoogste;
                repaint();
            }
        }
    }
}

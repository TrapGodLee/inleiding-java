package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H10_2 extends Applet {
    int hoogste;
    int laagste;
    TextField tekstvak;
    Label label;
    String tekststring;
    String tekststring2;

    public void init() {
//  (als je op een regel staat en ctr+/ veranderd het een regel automatisch in een string)
//        tekstvak
        tekstvak = new TextField("", 10);
//        actionlistener
        tekstvak.addActionListener(new TekstListener());
        add(tekstvak);

//        label
        label = new Label("type een getal in");
        add(label);

//        string
        tekststring = "";
        tekststring2 = "";

        hoogste = Integer.MIN_VALUE;
        laagste = Integer.MAX_VALUE;

    }

    public void paint(Graphics g) {

        g.drawString("het hoogste getal is: " + hoogste, 50, 50);
        g.drawString("het laagste getal is: " + laagste, 50, 70);
    }

    class TekstListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;
            s = tekstvak.getText();
            int invoeren = Integer.parseInt(s);
            if (invoeren > hoogste) {
                hoogste = invoeren;
            }
            String a;
            a= tekstvak.getText();
            int invoeren2 = Integer.parseInt(a);
            if (invoeren2 < laagste) {
             laagste = invoeren2;

            }
            repaint();
        }

    }
}



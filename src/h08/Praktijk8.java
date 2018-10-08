package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijk8 extends Applet {
    //Declaratie 2 tekstvelden
    TextField tekstvak1;
    TextField tekstvak2;

    //Declaratie 4 Buttons
    Button keer;
    Button deel;
    Button plus;
    Button min;

    double Getal1;
    double Getal2;

    public void init() {
        setSize(500, 500);
        //initiation tekstvak1
        tekstvak1 = new TextField("", 15);
        add(tekstvak1);

        //initiation tekstvak2
        tekstvak2 = new TextField("", 18);
        add(tekstvak2);

        //Button1
        keer = new Button("*");
        add(keer);
        //knop action listener *
        keer.addActionListener(new keerknopListener());

        //Button2
        deel = new Button("/");
        add(deel);
        //knop action listener *
        deel.addActionListener(new deelknopListener());

        //Button3
        plus = new Button("+");
        add(plus);
        //knop action listener *
        plus.addActionListener(new plusknopListener());


        //Button4
        min = new Button("-");
        add(min);
        //knop action listener *
        min.addActionListener(new minknopListener());
    }

    //plus knop action listener
    class keerknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //string voor textvaak en ophalen van string tekst of cijfer
            String a = tekstvak1.getText();

            //ingetypte getal opslaan en converten naar cijfer met een punt erachter
            Getal1 = Double.parseDouble(a);

            String b = tekstvak2.getText();
            Getal2 = Double.parseDouble(b);

            //optelling
            double uitkomst = Getal1 * Getal2;

            //uitkomst in eerste tekstvak
            tekstvak1.setText(String.valueOf(uitkomst));

            //tekstvak 2 wordt bij uitkomst leeg
            tekstvak2.setText("");
        }
    }

    //deel knop action listener
    class deelknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String c = tekstvak1.getText();
            Getal1 = Double.parseDouble(c);
            String d = tekstvak2.getText();
            Getal2 = Double.parseDouble(d);
            double uitkomst = Getal1 / Getal2;
            tekstvak1.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
        }
    }

    //plus knop action listener
    class plusknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String f = tekstvak1.getText();
            Getal1 = Double.parseDouble(f);
            String g = tekstvak2.getText();
            Getal2 = Double.parseDouble(g);
            double uitkomst = Getal1 + Getal2;
            tekstvak1.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
        }
    }

    //min knop action listener
    class minknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String h = tekstvak1.getText();
            Getal1 = Double.parseDouble(h);
            String i = tekstvak2.getText();
            Getal2 = Double.parseDouble(i);
            double uitkomst = Getal1 - Getal2;
            tekstvak1.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
        }
    }
}




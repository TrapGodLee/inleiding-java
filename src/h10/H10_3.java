package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H10_3 extends Applet{

    TextField tekstvak;
    Label label;
    String s, tekst;
    int maand;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een jaartal en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt( s);
            if ( ( maand == 1 ) ){
                tekst =  "januari heeft 31 dagen";
            }            s = tekstvak.getText();
            maand = Integer.parseInt( s);
            if ( ( maand == 2 ) ){
                tekst =  "februari heeft 28 dagen";
            }            s = tekstvak.getText();
            maand = Integer.parseInt( s);
            if ( ( maand == 3 ) ){
                tekst =  "maart heeft 31 dagen";
            }            s = tekstvak.getText();
            maand = Integer.parseInt( s);
            if ( ( maand == 4 ) ){
                tekst =  "april heeft 30 dagen";
            }            s = tekstvak.getText();
            maand = Integer.parseInt( s);
            if ( ( maand == 5 ) ){
                tekst =  "mei heeft 31 dagen";
            }            s = tekstvak.getText();
            maand = Integer.parseInt( s);
            if ( ( maand == 6 ) ){
                tekst =  "juni heeft 30 dagen";
            }            s = tekstvak.getText();
            maand = Integer.parseInt( s);
            if ( ( maand == 7 ) ){
                tekst =  "juli heeft 31 dagen";
            }            s = tekstvak.getText();
            maand = Integer.parseInt( s);
            if ( ( maand == 8 ) ){
                tekst =  "september heeft 30 dagen";
            }            s = tekstvak.getText();
            maand = Integer.parseInt( s);
            if ( ( maand == 9 ) ){
                tekst =  "oktober heeft 31 dagen";
            }            s = tekstvak.getText();
            maand = Integer.parseInt( s);
            if ( ( maand == 11 ) ){
                tekst =  "november heeft 30 dagen";
            }            s = tekstvak.getText();
            maand = Integer.parseInt( s);
            if ( ( maand == 12 ) ){
                tekst =  "december heeft 31 dagen";
            }            s = tekstvak.getText();
            maand = Integer.parseInt( s);
            if ( ( maand == 1 ) ){
                tekst =  "januari heeft 31 dagen";
            }

            repaint();
        }
    }
}


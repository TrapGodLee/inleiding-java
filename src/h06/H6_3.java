package h06;

import java.awt.*;
import java.applet.*;

public class H6_3 {

    public class Opdracht3 extends Applet {
        int Grootgetal;
        int Kleingetal;
        int uitkomst;

        public void init() {
            Grootgetal = 2147483647;
            Kleingetal = 1;
            uitkomst = Grootgetal + Kleingetal;
            // Sneaky beaky shit hiero
        }

        public void paint(Graphics g) {
            g.drawString("Sneaky AF booiii = " + uitkomst, 20, 20);
        }
    }
}

package h04;

import java.awt.*;
import java.applet.*;

public class H4_1 extends Applet {

        public void init() {
        }

        public void paint(Graphics g) {
            g.drawLine(50,200,250,200);
            g.drawLine(50,200,150,75);
            g.drawLine(150,75,250,200);
        }
}


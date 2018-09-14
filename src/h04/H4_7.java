package h04;

import java.awt.*;
import java.applet.*;

public class H4_7 extends Applet{

    public void init() {
        setBackground(Color.red);
    }

    public void paint(Graphics g) {

        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(4,4,100,100);
        g.fillOval(12,12,20,20);
        g.fillOval(12,72,20,20);
        g.fillOval(72,12,20,20);
        g.fillOval(72,72,20,20);
    }
}


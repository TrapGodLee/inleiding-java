package h04;

import java.awt.*;
import java.applet.*;

public class H4_3 extends Applet{

    public void init() {
        setBackground(Color.black);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawRect(50, 50, 10, 270);
        g.fillRect(50, 50, 10, 270);
        g.setColor(Color.green);
        g.drawRect(61, 50, 150, 45);
        g.fillRect(61, 50, 150, 45);
        g.setColor(Color.yellow);
        g.drawRect(61, 90, 150, 45);
        g.fillRect(61, 90, 150, 45);
    }
}

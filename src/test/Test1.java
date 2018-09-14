package test;

//Test vierkant

import java.awt.*;
        import java.applet.*;

public class Test1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.red);
        g.setColor(Color.yellow);
        g.drawRect(200 ,200,100,100);

    }
}

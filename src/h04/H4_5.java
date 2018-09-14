package h04;


import java.awt.*;
import java.applet.*;

public class H4_5 extends Applet{

    public void init() {
    }
    public void paint (Graphics g){
        setBackground(Color.blue);
        g.setColor(Color.black);
        /*Arc*/
        g.setColor(Color.yellow);
        g.fillArc(80,80,160,160,0,360);
    }

}




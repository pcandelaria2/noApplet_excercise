package noapplet.example;

import java.awt.*;

public class Balloon2 extends Balloon{
    public Balloon2(String[] params) { super(params); }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension d = getSize();
        if (x == 300 && y == 300){
            x = x - d.width;
            y = y - d.height;
            g.setColor(Color.green);
            g.fillOval(0,0,x,y);
        }
    }

    public static void main(String[] args) {
        new Balloon2(new String[] {"width=300", "height=300"}).run();
    }
}

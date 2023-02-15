package noapplet.drawingboard;

import java.awt.*;


public class circle extends Shape {

    public circle(int x, int y, Color c) {
        super(x, y, c);

    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.drawOval(getX()+100,getY()+100,getX(),getY());
    }
}

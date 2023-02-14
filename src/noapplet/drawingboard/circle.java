package noapplet.drawingboard;

import java.awt.*;


public class circle extends Shape {
    private int x;
    private int y;
    private Color c;
    protected circle(int x, int y, Color c) {
        super(x, y, c);

    }

    @Override
    public void draw(Graphics g) {
        g.setColor(c);
        g.fillOval(x,y,x,y);
    }
}

package noapplet.drawingboard;

import java.awt.*;

public class rectangle  extends Shape{
    protected rectangle(int x, int y, Color c) {
        super(x, y, c);
    }

    public void draw(Graphics g) {
        g.setColor(getColor());
        g.drawRect(getX(),getY(),getX(),getY());
    }
}

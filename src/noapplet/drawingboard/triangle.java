package noapplet.drawingboard;

import java.awt.*;

public abstract class triangle extends Shape{
    protected triangle(int x, int y, Color c) {
        super(x, y, c);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());

    }
}

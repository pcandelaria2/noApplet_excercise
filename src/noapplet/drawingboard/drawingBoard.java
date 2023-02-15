package noapplet.drawingboard;

import noapplet.NoApplet;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
public class drawingBoard extends NoApplet {
    private List<Shape> shapes;
    public static void main(String[] args){
        new drawingBoard().run();
    }

    @Override
    public void init(){
        shapes = new ArrayList<>();
        shapes.add(new circle(10, 10, Color.BLUE));
        shapes.add(new rectangle(10,30, Color.RED));
        //shapes.add(new triangle());

    }
    @Override
    public void paintComponents(Graphics g){
        for (Shape s: shapes) {
            s.draw(g);
        }

    }
}

package noapplet.solar_system;


import noapplet.example.AnimationNoApplet;

import java.awt.*;

public class main {
    public static void main(String[] args) {
        sun Sun = new sun(20,20,20,Color.yellow);

    }
}
class sun extends AnimationNoApplet {
    private int x;
    private int y;
    private int radius;
    private Color color;

    public sun(int x, int y, int radius, Color color){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;

        //planets = new ArrayList<>();
        //planets.add(new planet(40,10,0,Color.orange, sun));
    }
    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(x-radius,y-radius,radius*2, radius*2);


    }


}

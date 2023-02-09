package noapplet.solar_system;


import noapplet.example.AnimationNoApplet;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class main extends AnimationNoApplet {
    sun Sun;
    public static void main(String[] args) {
        new main().run();

    }
    @Override
    public void initAnimation(){
        Sun = new sun(20,20,20,Color.yellow);
    }
    @Override
    public void paintComponent(Graphics g) {
        Sun.draw(g);
    }
}
class sun extends AnimationNoApplet {
    private int x;
    private int y;
    private int radius;
    private Color color;

    //private final List<planet> planets;

    public sun(int x, int y, int radius, Color color){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;

        //planets = new ArrayList<>();
        //planets.add(new planet(40,10,0,10,Color.orange, S));
    }

    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(x-radius,y-radius,radius*2, radius*2);

    }


}
class planet{
    private int distance;
    private int radius;
    private int angle;
    private int speed;
    private Color color;
    private sun Sun;
    private Dimension dim = Sun.getSize();

    public planet(int distance, int radius, int angle, int speed, Color color, sun Sun){
        this.distance = distance;
        this.radius = radius;
        this.angle = angle;
        this.speed = speed;
        this.color = color;
        this.Sun = Sun;

    }
    public void draw(Graphics g){
        var ran = new Random();
        var x = ran.nextInt(distance);
        var y = ran.nextInt(distance);

        x = calX() + x;

        g.setColor(color);
        g.fillOval(x-radius,y-radius, radius*2,radius*2);
    }
    private int calX() {
        int center = dim.width / 2;   // dim: dimension of this planet
        return (int) (center + distance * Math.cos(Math.toRadians(angle))); // angle in degrees (0-360)
    }

}
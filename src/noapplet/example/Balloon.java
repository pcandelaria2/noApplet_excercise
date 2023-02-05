package noapplet.example;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Balloon extends noapplet.NoApplet{
    protected Timer timer;
    protected int x=0, y=0;
    protected int delay = 100; // millis



    public Balloon(){
    }
    public Balloon(String[] params) { super(params); }
    public void init(){
        timer = new Timer(delay, e->repaint());

    }
    protected void paintComponent(Graphics g) {
        Dimension d = getSize();
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, d.width, d.height);
        x+=10;
        y+=10;
        g.setColor(Color.green);
        g.fillOval(0,0,x,y);

    }
    public void start() {
        timer.start();
    }

    public void stop() {
        timer.stop();
    }


    public static void main(String[] args) {

        new Balloon(new String[] {"width=300", "height=300"}).run();
    }
}


package noapplet.example;

public class Balloon2 extends Balloon{
    public Balloon2(String[] params) { super(params); }


    public static void main(String[] args) {
        new Balloon2(new String[] {"width=300", "height=300"}).run();
    }
}

import sas.Picture;
import sas.Rectangle;

import java.awt.*;
import java.util.Random;

public class Laser {
int x;
int y;
    private Rectangle laserbild;
    public Laser(double pX,double pY)
    {

        laserbild=  new Rectangle(pX,pY,7.5,15, Color.red);
    }

    public void verschwinden()
    {
    laserbild.setHidden(true);
    }

    public void bewegen() {
        while (laserbild.getHidden() == false) {
            y = y + 10;
        }
    }

    public Rectangle getLaserbild(){
        return laserbild;
    }

    public static void main(String[] args) {
        new Laser();
    }

}

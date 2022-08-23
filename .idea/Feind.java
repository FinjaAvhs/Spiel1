import sas.Picture;

import java.util.Random;

public class Feind{

    private Spiel1 spiel;
    private Rakete rakete;
    private int x=0, y=0;
    private Picture pic;
    private boolean tot=false;

    public Feind(Spiel1 pSpiel, Rakete pRakete, int pX)
    {
        spiel = pSpiel;
        rakete= pRakete;
        x= pX;
        pic = new Picture(x, y,100,75,"racket.jpg");
        while (!tot)
        {
            pic.move(x,y++);
        }
    }

    public Picture getPic()
    {
        return pic;
    }



    public void verschwinden()
    {
        tot = true;
    }

    public void explodieren()
    {

        tot= true;
    }

    public void zielErreicht()
    {

    }

    public void raketeBeruehrt()
    {

        if (rakete.getRaketenbild().intersects(this.pic))
        {
            this.verschwinden();
            tot=true;
        }


    }


}

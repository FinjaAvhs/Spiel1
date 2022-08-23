import sas.Picture;

public class Rakete extends Dummy{
    private double pX;
    private double pY;
    private int leben =5;
    private Picture raketebild;
    public Rakete(double lX, double lY)
    { pX= lX;
        pY=lY;
      raketebild=  new Picture(pX,pY,35,70,"racket.jpg");


    }

    public double bewegen()
    { double x;
        x=super.getX1();
        pX= pX+ x*10;
        return x*10;
    }

    public void schiessen()
    { Laser neu= new Laser(pX+13,pY-17);
        while(!neu.getLaserY()==0 || !neu.feindBerührt()) {
            neu.getLaserbild().move(0, -10);
            neu.bewegen();
        }
        neu.setHidden(true);
    }

    public void lebenAbziehen(int anzahl)
    {
     leben=leben-anzahl;
    }

    public boolean istTot(){
        if(leben==0){
            return true;
        }else{
            return false;
        }
    }

    public Picture getRaketenbild(){
        return raketebild;
    }

}

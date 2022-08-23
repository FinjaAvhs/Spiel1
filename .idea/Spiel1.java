import sas.Rectangle;
import sas.Text;
import sas.Tools;
import sas.View;

import javax.swing.SwingConstants;
import java.awt.*;

public class Spiel1 {

    //Attribute
    private long zeit;
    private long startzeit;
    private View view;
    private Rakete rakete;
    private Rectangle ende;
    private Text tEnde;

    //Konstruktor
    public Spiel1()
    {
        view = new View(1000,1000);
        rakete = new Rakete(450,900);
        ende = new Rectangle(0,0,1000,1000,Color.BLACK);
        ende.setHidden(true);
        tEnde = new Text(300,500,"");
        tEnde.setHidden(true);
    }

    //Methoden
    public void start()
    {
        startzeit = Tools.getStartTime();
        zeit = Tools.getStartTime();
        while(!rakete.istTot()){
            if(zeit-startzeit >= 2000){
                this.feindErstellen();
            }
        }
        this.sterben();
    }

    public void neuStarten(){
        
    }

    public void sterben()
    {
        float lEndzeit = Tools.getElapsedTime(startzeit)*1000;
        ende.setHidden(false);
        String lAusgabe = "Deine Zeit in Sekunden: " + lEndzeit;
        Text lText = new Text(c, lAusgabe);
    }

    public void lebenAbziehen(int pAnzahl)
    {
      rakete.lebenAbziehen(pAnzahl);
    }

    public int zufallszahlErstellen(){
        return (int) Math.random()*990;
    }

    public void feindErstellen(){
        new Feind(this, rakete, this.zufallszahlErstellen());
    }
    public void bewegeRakete(){

        rakete.getRaketenbild().move(rakete.bewegen());
    }

    //Getter und Setter
    public void setZeit(long pZeit){
        zeit = pZeit;
    }

    public long getZeit() {
        return zeit;
    }

    public void setStartzeit(long startzeit) {
        this.startzeit = startzeit;
    }

    public long getStartzeit() {
        return startzeit;
    }

    public void setRakete(Rakete rakete) {
        this.rakete = rakete;
    }

    public Rakete getRakete() {
        return rakete;
    }

    public void setView(View view) {
        this.view = view;
    }

    public View getView() {
        return view;
    }
}
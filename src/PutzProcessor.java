import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class PutzProcessor {

    public static void main(String[] args) {

        Mitbewohner serafin = new Mitbewohner("Serafin");
        Mitbewohner luca = new Mitbewohner("Luca");
        Mitbewohner lennart = new Mitbewohner("Lennart");
        Mitbewohner leonard = new Mitbewohner("Leonard");

        Zimmer kueche = new Zimmer("Kueche");
        Zimmer bad = new Zimmer("Bad");
        Zimmer flur = new Zimmer("Flur");
        Zimmer klo = new Zimmer("Klo");
        Zimmer balkon = new Zimmer("Balkon");

        //Der Küche Dinge zuordnen, die in Ihr geputzt werden müssen.
        DingZuPutzen kuehlschrank = new DingZuPutzen("Kuehlschrank", 60);
        try{
            kueche.DingZuPutzenHinzuFuegen(kuehlschrank);
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }
        DingZuPutzen ofen = new DingZuPutzen("Ofen", 90);
        try{
            kueche.DingZuPutzenHinzuFuegen(ofen);
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }
        DingZuPutzen schraenke = new DingZuPutzen("Schraenke", 90);
        try{
            kueche.DingZuPutzenHinzuFuegen(schraenke);
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }

        Set<Zimmer> alleZimmer = new HashSet<>();
        alleZimmer.add(kueche);
        alleZimmer.add(bad);
        alleZimmer.add(flur);
        alleZimmer.add(klo);
        alleZimmer.add(balkon);

        LocalDate today;
        while(true){
            today = LocalDate.now();


            try{
                TimeUnit.SECONDS.sleep(2); //zum Test, da es sonst zu lange dauert
                //TimeUnit.DAYS.sleep(1);
            }catch(Exception e){
                e.printStackTrace();
            }
        }//endless loop
    }//main method
}//class

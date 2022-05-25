import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Zimmer {

    private static final long PUTZEN_FAELLIG_NACH_TAGEN = 7;
    private String name;
    private LocalDate zuletztGeputzt;
    private Set<DingZuPutzen> DingeZuPutzen;

    public Zimmer(String name){
        this.name = name;
        zuletztGeputzt = LocalDate.now();
        DingeZuPutzen = new HashSet<>();
    }

    /**
     * Fuegt ein Ding was zu putzen in das Zimmer hinzu
     * @param ding (darf nicht null sein)
     * @throws IllegalArgumentException
     */
    public void DingZuPutzenHinzuFuegen(DingZuPutzen ding) throws IllegalArgumentException {
        if( null == ding ) throw new IllegalArgumentException("Ding existiert nicht");
        DingeZuPutzen.add(ding);
        System.out.printf("Ding wurde zu %s als zu putzende Sache hinzugefuegt.", this.name);
    }

    /**
     * checkt ob das Zimmer mal wieder geputzt werden muss
     * @param today
     * @return false wenn es erst vor kurzem geputzt wurde, true wenn es mal wieder geputzt werden sollte
     */
    public boolean mussGeputztWerden(LocalDate today){
        long tageSeitLetztemPutzen = ChronoUnit.DAYS.between(zuletztGeputzt, today);
        if(tageSeitLetztemPutzen >= PUTZEN_FAELLIG_NACH_TAGEN ){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Setzt den übergeben Tag als den, an dem das Zimmer zuletzt geputzt wurde,
     * wenn NULL übergeben wird wird der heutige Tag genommen.
     * @param tag
     */
    public void wurdeGeputztAm(LocalDate tag){
        if(tag == null){
            zuletztGeputzt = LocalDate.now();
        }else{
            zuletztGeputzt = tag;
        }
    }

    public String getName() {
        return name;
    }

    public LocalDate getZuletztGeputzt() {
        return zuletztGeputzt;
    }

    public Set<DingZuPutzen> getDingeZuPutzen() {
        return DingeZuPutzen;
    }
}

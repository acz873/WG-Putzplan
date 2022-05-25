import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DingZuPutzen {

    private long tageBisZumPutzen;
    private String name;
    private LocalDate zuletztGeputzt;

    /**
     * KOnstrukter für ein Ding, was auch mal geputzt werden muss und einem Zimmer zugeordnet werden kann
     * @param name
     * @param tageBisZumPutzen
     */
    public DingZuPutzen(String name, long tageBisZumPutzen){
        this.name = name;
        this.tageBisZumPutzen = tageBisZumPutzen;
    }

    /**
     * checkt ob das Ding mal wieder geputzt werden muss
     * @param today
     * @return false, wenn es erst vor kurzem geputzt wurde. true, wenn es mal wieder geputzt werden sollte
     */
    public boolean mussGeputztWerden(LocalDate today){
        long tageSeitLetztemPutzen = ChronoUnit.DAYS.between(zuletztGeputzt, today);
        if(tageSeitLetztemPutzen >= tageBisZumPutzen){
            return true;
        }else{
            return false;
        }
    }

}

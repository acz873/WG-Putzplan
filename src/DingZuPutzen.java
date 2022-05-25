import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DingZuPutzen {

    private static final long PUTZEN_FAELLIG_NACH_TAGEN = 7;
    private String name;
    private LocalDate zuletztGeputzt;

    public DingZuPutzen(String name){
        this.name = name;
    }

    /**
     * checkt ob das Ding mal wieder geputzt werden muss
     * @param today
     * @return false, wenn es erst vor kurzem geputzt wurde. true, wenn es mal wieder geputzt werden sollte
     */
    public boolean mussGeputztWerden(LocalDate today){
        long tageSeitLetztemPutzen = ChronoUnit.DAYS.between(zuletztGeputzt, today);
        if(tageSeitLetztemPutzen >= PUTZEN_FAELLIG_NACH_TAGEN ){
            return true;
        }else{
            return false;
        }
    }

}

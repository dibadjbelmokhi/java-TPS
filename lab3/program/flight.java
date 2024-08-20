
import java.time.LocalDate;
import java.util.Date;

public class flight {
    private final String flightid;
     private plane p;
     private pilot pilo;
     private String  depcity;
     private String arvcity;
     private LocalDate date;
    public flight(String flightid,plane p, pilot pilo, String depcity, String arvcity, LocalDate localDate) {
        this.p = p;
        this.pilo = pilo;
        this.depcity = arvcity;
        this.arvcity = arvcity;
        this.date = localDate;
        this.flightid=flightid;
    }
    
    

    public void setPlan(plane plan) {
        this.p = plan;
    }
    public void setPilo(pilot pilo) {
        this.pilo = pilo;
    }
    public void setDepcity(String  depcity) {
        this.depcity = depcity;
    }
    public void setArvcity(String  arvcity) {
        this.arvcity = arvcity;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
   
    public plane getPlan() {
        return p;
    }
    public pilot getPilo() {
        return pilo;
    }
    public String  getDepcity() {
        return depcity;
    }
    public String  getArvcity() {
        return arvcity;
    }
    public LocalDate  getDate() {
        return date;
    }
     

}

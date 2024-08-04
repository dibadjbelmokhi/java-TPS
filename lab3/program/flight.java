package program;

import java.util.Date;

public class flight {
    private final int flightid;
     private String plan;
     private String pilo;
     private String  depcity;
     private String arvcity;
     private Date date;
    public flight(int flightid,String plan, String pilo, String string, String string2, Date date) {
        this.plan = plan;
        this.pilo = pilo;
        this.depcity = arvcity;
        this.arvcity = arvcity;
        this.date = date;
        this.flightid=flightid;
    }
    
    

    public void setPlan(String plan) {
        this.plan = plan;
    }
    public void setPilo(String pilo) {
        this.pilo = pilo;
    }
    public void setDepcity(String  depcity) {
        this.depcity = depcity;
    }
    public void setArvcity(String  arvcity) {
        this.arvcity = arvcity;
    }
    public void setDate(Date date) {
        this.date = date;
    }
   
    public String getPlan() {
        return plan;
    }
    public String getPilo() {
        return pilo;
    }
    public String  getDepcity() {
        return depcity;
    }
    public String  getArvcity() {
        return arvcity;
    }
    public Date getDate() {
        return date;
    }
     

}

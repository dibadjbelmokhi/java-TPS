package exo3;
import java.time.LocalDate;

public class Vi {
    private String marque;
     private LocalDate date;
     private Double prixach;
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public Double getPrixach() {
        return prixach;
    }
    public void setPrixach(Double prixach) {
        this.prixach = prixach;
    }
    public Vi(String marque, LocalDate date, Double prixach) {
        this.marque = marque;
        this.date = date;
        this.prixach = prixach;
    }
     public void afficher(){
        System.out.println("la marque est"+getMarque()+"le prix est "+getPrixach()+"la date est"+getDate());
     }

     public double calculeprix(){
        int currentYear = LocalDate.now().getYear();
        double  anc=  (currentYear - getPrixach());
     return  getPrixach()*(1-0.05*anc);
     }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vi other = (Vi) obj;
        if (marque == null) {
            if (other.marque != null)
                return false;
        } else if (!marque.equals(other.marque))
            return false;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        if (prixach == null) {
            if (other.prixach != null)
                return false;
        } else if (!prixach.equals(other.prixach))
            return false;
        return true;
    }
   
     
}

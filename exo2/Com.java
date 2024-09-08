package exo2;
import java.time.LocalDate;
public class Com extends Employer{
    public Com(String nom, String prénom, Double an, Double nbh, Double nbhs) {
        super(nom, prénom, an, nbh, nbhs);
        
    }
    public double calculepai(){
        return super.getNbh()*350;
    }




    public double calculsupp(){
        return super.getNbhs()*500;
       }
       
       public double caltot(){
           int currentYear = LocalDate.now().getYear();
           double  years=  (currentYear - super.getAn());
           return calculepai()+calculsupp()+years*200;
       }
       @Override
       public String toString() {
        return super.toString() + ", Paie Finale: " + caltot();
    }
       
}


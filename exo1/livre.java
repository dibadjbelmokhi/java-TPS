import java.time.LocalDate;
import java.util.List;

public class livre extends Docu{
    public double ISBN;
     public double Prix; 
     public double anne;
    public livre(String nom, List<personne> auteur, double iSBN, double prix, double anne) {
        super(nom, auteur);
        ISBN = iSBN;
        Prix = prix;
        this.anne = anne;
    }
    @Override
    public String toString() {
        return "livre [ISBN=" + ISBN + ", anne=" + anne + ", " + super.toString() + "]";
    }
    public double privente(personne p){
       int currentYear = LocalDate.now().getYear();
        
        double age = (int) (currentYear - p.getAn());
        if(age<20){
            Prix=Prix*0.8;
        }else {
            if(super.auteur.contains(p)){
                Prix=0;
            }
        }
        return Prix;
    }
   
}

import java.util.ArrayList;
import java.util.List;

public class Docu {
    private String nom;
    protected List<personne>auteur=new ArrayList<>();
    public Docu(String nom, List<personne> auteur) {
        if(auteur.size()<5)
         throw new IllegalArgumentException("Un document ne peut avoir que jusqu'à 5 auteurs.");
        
        this.nom=nom;
        this.auteur=auteur;
     
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<personne> getAuteur() {
        return auteur;
    }

    public void setAuteur(List<personne> auteur) {
        this.auteur = auteur;
    }

    public int na(List<personne> auteur){
        return auteur.size();
    }

    public String toString() {
        StringBuilder auteursStr = new StringBuilder();
        for (personne auteur : auteur) {
            if (auteursStr.length() > 0) {
                auteursStr.append(", ");
            }
           
            auteursStr.append(auteur.getName());
        }
        return "Nom: " +getNom()+ ", Auteurs: " + auteursStr.toString();
    }
   
 
}


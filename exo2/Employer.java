package exo2;

public class Employer {private String  nom;
    private String prénom;
     private Double an;
    private Double nbh;
    private Double nbhs;
    public Employer(String nom, String prénom, Double an, Double nbh, Double nbhs) {
        this.nom = nom;
        this.prénom = prénom;
        this.an = an;
        this.nbh = nbh;
        this.nbhs = nbhs;
    }
    @Override
    public String toString() {
        return "Employer [nom=" +getNom()+ ", prénom=" + getPrénom()+ ", an=" + getAn() + ", nbh=" + getNbh() + ", nbhs=" +getNbhs()+ "]";
    }
    
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrénom() {
        return prénom;
    }
    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }
    public Double getAn() {
        return an;
    }
    public void setAn(Double an) {
        this.an = an;
    }
    public Double getNbh() {
        return nbh;
    }
    public void setNbh(Double nbh) {
        this.nbh = nbh;
    }
    public Double getNbhs() {
        return nbhs;
    }
    public void setNbhs(Double nbhs) {
        this.nbhs = nbhs;
    }
    
}

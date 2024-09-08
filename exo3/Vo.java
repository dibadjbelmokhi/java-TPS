package exo3;

import java.time.LocalDate;

public class Vo extends Vi{

    private int NbrPortes;
     private Double Puissances;
    private double Kilométrage ;
    public Vo(String marque, LocalDate date, Double prixach, int nbrPortes, Double puissances, double kilométrage) {
        super(marque, date, prixach);
        NbrPortes = nbrPortes;
        Puissances = puissances;
        Kilométrage = kilométrage;
    }
    @Override
    public double calculeprix (){
        double prixBase = super.calculeprix();
        double anciensKilometres = Kilométrage / 100000;
        return prixBase * (1 - 0.10 * anciensKilometres);
    }
    public int getNbrPortes() {
        return NbrPortes;
    }
    public void setNbrPortes(int nbrPortes) {
        NbrPortes = nbrPortes;
    }
    public Double getPuissances() {
        return Puissances;
    }
    public void setPuissances(Double puissances) {
        Puissances = puissances;
    }
    public double getKilométrage() {
        return Kilométrage;
    }
    public void setKilométrage(double kilométrage) {
        Kilométrage = kilométrage;
    }
    @Override
    public void afficher(){
        System.out.println("la marque est"+getMarque()+"le prix est "+getPrixach()+"la date est"+getDate()+"nombre de portes est"+getNbrPortes()+"le kilometrage est"+getKilométrage()+"la puissance de car est "+getPuissances());
     }

}
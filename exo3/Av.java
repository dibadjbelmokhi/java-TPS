package exo3;

import java.time.LocalDate;

public class Av extends Vi{
  private int hrvole;

  public Av(String marque, LocalDate date, Double prixach, int hrvole) {
    super(marque, date, prixach);
    this.hrvole = hrvole;
  }
  @Override
  public double calculeprix (){
      double prixBase = super.calculeprix();
      double ancienshr =hrvole / 5000;
      return prixBase * (1 - 0.8 * ancienshr);
  }
  @Override
  public void afficher(){
    System.out.println("la marque est"+getMarque()+"la date est"+getDate()+"le prix de achte"+getPrixach()+"les heurs de vols"+getHrvole());
 }
  public int getHrvole() {
    return hrvole;
  }
  public void setHrvole(int hrvole) {
    this.hrvole = hrvole;
  }
  
}
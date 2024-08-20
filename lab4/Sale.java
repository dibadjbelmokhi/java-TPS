import java.time.LocalDate;

public class Sale extends deed {
  private double price;
    public Sale(Accom ac, Owner ow, Pers client, LocalDate date,double price) {
        super(ac, ow, client, date);
       this.price=price;
    }

    

    @Override
    public void sign() {
        System.out.println("Sale of " + getAc() + " for price " + getPrice() + " has been signed.");
   
    }

    @Override
    public void cancel() {
        System.out.println("Sale of " + getAc() + " for price " + getPrice() + " has been signed.");
   
    }



    public double getPrice() {
        return price;
    }



    public void setPrice(double price) {
        this.price = price;
    }
    
}

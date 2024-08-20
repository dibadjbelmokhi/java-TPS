import java.time.LocalDate;

public class Rental extends deed {
   private LocalDate startdate;
   private LocalDate enddate;
   private double rent;
    

    public Rental(Accom ac, Owner ow, Pers client, LocalDate date, LocalDate startdate, LocalDate enddate, double rent) {
    super(ac, ow, client, date);
    this.startdate = startdate;
    this.enddate = enddate;
    this.rent = rent;
}

   

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }



    public void setEnddate(LocalDate enddate) {
        this.enddate = enddate;
    }



    public void setRent(double rent) {
        this.rent = rent;
    }



    public LocalDate getStartdate() {
        return startdate;
    }



    public LocalDate getEnddate() {
        return enddate;
    }



    public double getRent() {
        return rent;
    }





    @Override
    public void sign() {
        System.out.println("Sale of " + getAc() + " for startdate " + getStartdate() + " and end date"+getEnddate()+"and rent "+getRent());
    }



    @Override
    public void cancel() {
        System.out.println("Sale of " + getAc() + " for startdate " + getStartdate() + " and end date"+getEnddate()+"and rent "+getRent());
  ;
    }
    
}

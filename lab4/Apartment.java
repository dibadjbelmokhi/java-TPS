public class Apartment  extends Accom{
  private int floore;
    public Apartment(String adr, String area, int nmbroom,int floore) {
        super(adr, area, nmbroom);
        this.floore=floore;
    }

    @Override
    public void rent() { 
        System.out.println("add of this rent appartment "+getAdr()+"in area"+getArea()+"and for floore there is:"+getFloore())
    ;}

    @Override
    public void sell() {
        System.out.println("add of this sell appartment "+getAdr()+"in area"+getArea()+"and for floore there is:"+getFloore())
  ;
        
    }

    public int getFloore() {
        return floore;
    }

    public void setFloore(int floore) {
        this.floore = floore;
    }
    
}

public class Studio extends Accom{
   private boolean kitchenette;
    public Studio(String adr, String area, int nmbroom,boolean kitchenette) {
        super(adr, area, nmbroom);
        this.kitchenette=kitchenette;
       
    }

    @Override
    public void rent() {
        System.out.println("Studio at " + getAdr() + " with kitchenette: " +getKitchenette()+ " is being sold.");
   
        
    }

    @Override
    public void sell() {
        System.out.println("Studio at " + getAdr() + " with kitchenette: " +getKitchenette()+ " is being sold.");
  
        
    }

    public boolean getKitchenette() {
        return kitchenette;
    }

    public void setKitchenette(boolean kitchenette) {
        this.kitchenette = kitchenette;
    }
    
}

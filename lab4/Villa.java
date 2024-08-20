public class Villa extends Accom{
   private boolean garden;
    public Villa(String adr, String area, int nmbroom,boolean garden) {
        super(adr, area, nmbroom);
        this.garden=garden;
        
    }

    @Override
    public void rent() {
        System.out.println("add of rent this villa "+getAdr()+"in area"+getArea()+"and for garden there is:"+getGarden());
        
    }

    @Override
    public void sell() {
        System.out.println("add of sell this villa "+getAdr()+"in area"+getArea()+"and for garden there is:"+getGarden());
    }

    public boolean getGarden() {
        return garden;
    }

    public void setGarden(boolean garden) {
        this.garden = garden;
    }
    
}

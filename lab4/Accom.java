public abstract class Accom {
    private String adr;
    private String area;
    private int nmbroom;
    public Accom(String adr, String area, int nmbroom) {
        this.adr = adr;
        this.area = area;
        this.nmbroom = nmbroom;
    }
    public String getAdr() {
        return adr;
    }
    public void setAdr(String adr) {
        this.adr = adr;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public int getNmbroom() {
        return nmbroom;
    }
    public void setNmbroom(int nmbroom) {
        this.nmbroom = nmbroom;
    }
    public abstract void sell();
    public abstract void rent();
}

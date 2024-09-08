public class personne {
    private String name;
    private String fname;
    private double an;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public  double getAn() {
        return an;
    }
    public void setAn(double an) {
        this.an = an;
    }
    public personne(String name, String fname, double an) {
        this.name = name;
        this.fname = fname;
        this.an = an;
    }

}

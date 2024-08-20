abstract class Pers {
    private String name;
    private String fname;
    private String Address;
    public Pers(String n,String fn,String add){
     this.name=n;
     this.fname=fn;
     this.Address=add;
    }
    //setters
    public void Setname(String n){
        this.name=n;
    
    }
    public void Setfname(String fn){
        this.fname=fn;
    
    }
    public void Setaddress(String add){
        this.Address=add;
    
    }
    //getters:
    public String getname(){
       return name;
    
    }
    public String getFname() {
        return fname;
    }
    public String getAddress() {
        return Address;
    }
    public abstract void buy(Accom ac);
    public abstract void rent(Accom ac);

}
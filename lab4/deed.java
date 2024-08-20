import java.time.LocalDate;

public abstract  class deed {
   private Accom ac;
    private Owner ow;
    private Pers client;
    private LocalDate date;
    public deed(Accom ac, Owner ow, Pers client, LocalDate date) {
        this.ac = ac;
        this.ow = ow;
        this.client = client;
        this.date = date;
    }
    public Accom getAc() {
        return ac;
    }
    public Owner getOw() {
        return ow;
    }
    public Pers getClient() {
        return client;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setAc(Accom ac) {
        this.ac = ac;
    }
    public void setOw(Owner ow) {
        this.ow = ow;
    }
    public void setClient(Pers client) {
        this.client = client;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public abstract void sign();
    public abstract void cancel();


}

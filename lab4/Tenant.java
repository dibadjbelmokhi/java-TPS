import java.util.ArrayList;
import java.util.List;

public class Tenant  extends Pers{
   List<Accom> att;
    public Tenant(String n, String fn, String add) {
        super(n, fn, add);
        this.att=new ArrayList<Accom>();
        
    }

    @Override
    public void buy(Accom a) {
        System.out.println(getFname() + " " + getname() + "  buy " + a);
        
    }

    @Override
    public void rent(Accom a) {
        System.out.println(getFname() + " " + getname() + "  rent lsit " + a);
    }

    public List<Accom> getAtt() {
        return att;
    }

    public void setAtt(List<Accom> att) {
        this.att = att;
    }
    
}

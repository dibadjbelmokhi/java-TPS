import java.util.ArrayList;
import java.util.List;

public class Owner extends Pers{
    //1
  private List<Accom> app;
public Owner(String n, String fn, String add) {
        super(n, fn, add);
        this.app=new ArrayList<Accom>();
       
    }

public List<Accom> getApp() {
  return app;
}
public void setApp(List<Accom> app) {
  this.app = app;
}
@Override
public void buy(Accom ac) {
  app.add(ac);
for(Accom a: app){
  
 if (a instanceof Apartment){
  System.out.println("its a apartment");
 }
  if(a instanceof Villa){
    System.out.println("its a vila");
  }
  else {
    if(a instanceof Studio){
      System.out.println("its a stuid");
    }
   }
 }
}
@Override
public void rent(Accom ac) {
  System.out.println("your first name&name are"+getFname()+" "+getname()+" your adress is"+getAddress()+"and your rent list of accomendation is");

}
   


  

   
    
}

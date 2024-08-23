import java.util.ArrayList;
import java.util.List;

class Touriste{
    private String nom;
    private String pnom;
    private int age;
private String natio;
private List <String> pyv;
private List <String> cmn;
public Touriste(String nom, String pnom, int age, String natio) {
    this.nom = nom;
    this.pnom = pnom;
    this.age = age;
    this.natio = natio;
this. pyv=new ArrayList<>();
this.cmn=new ArrayList<>();
   
}
public String getNom() {
    return nom;
}
public void setNom(String nom) {
    this.nom = nom;
}
public String getPnom() {
    return pnom;
}
public void setPnom(String pnom) {
    this.pnom = pnom;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public String getNatio() {
    return natio;
}
public void setNatio(String natio) {
    this.natio = natio;
}
public void ajouterPays(String pays) {
    if (!pyv.contains(pays)) {
        pyv.add(pays);
    } else {
        System.out.println(pays + " est déjà dans la liste des pays visités.");
    }
}

public void afficherlistpays(){
  if(pyv.isEmpty()){
    System.out.println("qucun pqys a visiter");
  }else{
    for(String pyv : pyv){
     System.out.println("le pays est visiter :"+pyv);
    }
  }
}
public void lc(String cm){
    cmn.add(cm);
   }
  
public void afc(){
    if(cmn.isEmpty()){
        System.out.println("no comment");
    }else{
        
            System.out.println("les cmnt sont"+cmn);
    
    }
}
}
public class exo3 {
    public static void main(String[] args) {
        
        Touriste t=new Touriste("abderrahmen", "braa", 21, "algerian");
        t.ajouterPays("Egypt");
        t.ajouterPays("turkie");
        t.ajouterPays("Tunisia");
        t.afficherlistpays();
        t.lc("it was so good"); 
        t.lc(" Egypt was so bad"); 
        t.afc();  
    
    }
    
}

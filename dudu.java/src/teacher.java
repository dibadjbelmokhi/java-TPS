public class teacher extends person {
   int mc;
    String name;int cod;
    public teacher(String name, int age) {
        super(name, name, age);
    }
     public module createmod(int mc,int cod){
        return new module(mc,cod);
     }
  
}


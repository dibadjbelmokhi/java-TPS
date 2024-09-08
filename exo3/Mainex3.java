package exo3;

import java.time.LocalDate;

public class Mainex3 {
    public static void main(String[] args) {
        Vo v2=new Vo("mrcedes", LocalDate.now() ,5.0, 566,888.0, 69.0);
        Vo v1=new Vo("mrcedes", LocalDate.now() ,5.0, 566,888.0, 69.0);
        Vi v3=new Vi("lion", LocalDate.now(),8888.6);
        System.out.println( v1.equals(v1));
        System.out.println(v3.equals(v1));
   
   
    }
}

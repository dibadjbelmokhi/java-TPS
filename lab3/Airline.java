import Entities.passenger;
import Entities.pilot;
import Entities.plane;
import program.booking;
import program.flight;
import java.util.Date;

public class Airline {
  static String ne;
  
    public static void main(String[] args) {
      
        pilot p1=new pilot(05,"dudu", 5.0);
        pilot p2=new pilot(06, "nunu", 9.0);
         plane pa1=new plane("mer", "200", 500.0, 1994);
        plane pa2=new plane("mr", "500", 400.0, 1993);
       passenger pe=new passenger(5,"nihel" , "kiki");
       passenger pe1=new passenger(9,"nil" , "kii");
       passenger pe2=new passenger(10,"niel" , "ki");
       passenger pe3=new passenger(50,"nhel" , "kki");
       
       flight flight1 = new flight(1, "plane1", "pilot1", "New York", "Los Angeles", new Date());

      booking b=new booking(5,"hi" , "kuku", "active");
      System.out.println();

     /* creating  normal array type pilote
     
     pilot p[]=new pilot[2];
      p[0]=p1;
      p[1]=p2;
      for(int i=0;i<p.length;i++){
        System.out.println(p[i].getName());
        System.out.print(p[i].getFlighthours());}*/
 /*   creatin jagged array to see practise
    
    int arr [][]=new int[2][];
      arr[0]=new int[2];
      arr[1]=new int [3];
    
      for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++)
      {
       arr[i][j]=(int)(Math.random()*10);
       
      
      }
      
      }


      for(int n[]:arr){
        for(int m:n){
          System.out.println( " "+m);;
        }
        System.out.println(" "); */
        // public everywhere.protected in same package same class w diffrent package fih subclass.private in the same class .default in the same packege.

      
      }



      }
    
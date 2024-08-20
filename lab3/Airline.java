

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Airline {
  static String ne;
  
    public static void main(String[] args) {
      
        List<pilot> mp=new ArrayList<pilot>();
        mp.add(new pilot(01, "p0", 11.4));
        mp.add(new pilot(02, "p0", 11.5));
        List<plane> p=new ArrayList<>();
         p.add(new plane("Boeing", "737", 180, 2018));
         p.add(new plane("Airbus", "A320", 160, 2020));
        
   
    List<passenger> pa=List.of(new passenger(001, "p01", "dudu"),new passenger(002, "p02", "dud"),new passenger(003, "p03", "du"),new passenger(004, "p04", "d"));
    List<flight> f = new ArrayList<>();
      f.add(new flight("F001",p.get(0), mp.get(0), "New York", "Los Angeles", LocalDate.of(2024, 8, 21)));
      f.add(new flight("F002",p.get(1), mp.get(1), "Chicago", "Houston", LocalDate.of(2024, 8, 22)));
      f.add(new flight("F003",p.get(0), mp.get(0), "San Francisco", "Seattle", LocalDate.of(2024, 8, 23)));

  
      
     List<booking> b=new ArrayList<>();
     b.add(new booking(9,pa.get(0), f.get(0), "confiremed"));
     b.add(new booking(5,pa.get(1), f.get(0), "confiremed"));

   System.out.println(pa.size());
   System.out.println(f.size());
   b.get(0).setStatus("canceled");
        System.out.println("Booking " + b.get(0).getBooknb() + " status: " + b.get(0).getStatus());
        
      
        for (booking n : b) {
            System.out.println("Booking number: " + n.getBooknb());
        }
      }




       

 


      
      }
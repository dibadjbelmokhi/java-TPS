import java.util.List;

import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {
        Owner o1=new Owner("dudu", "bel", "hayriyad");
        Owner o2=new Owner("abdou", "br", "1200elkhrube");
        Tenant t1=new Tenant("da", "dudu", "wedelehed");
        Tenant t2=new Tenant("dia", "duu", "wedq!elehed"); 
       Villa v1=new Villa("lux", "algeria", 4, true);
       Apartment ap1=new Apartment("F4", "jijel", 2, 2);
       Studio s1=new Studio("babelkantra", "constantine", 1, true);
       Sale sa=new Sale(s1, o2,t1,LocalDate.now(),100);
       Sale s11=new Sale(v1, o1,t2,LocalDate.now(),5000);
       Rental r1=new Rental(s1, o2, t2, LocalDate.now(),LocalDate.of(2005,10,5),LocalDate.of(2010,10,5), 50000000);
       Rental r2=new Rental(ap1, o2, t1, LocalDate.now(),LocalDate.of(2000,10,5),LocalDate.of(2023,10,5), 5000);
      o1.buy(ap1);
      o1.buy(s1);
     
    }
}



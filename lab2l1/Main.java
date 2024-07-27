package lab2l1;

import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        point a=new point(5,6);
        point b=new point(2,4);
        point c=new point(3,4);
        System.out.println(a.getX());
        System.out.println(b.getX());
        System.out.println(c.getX());
        System.out.println(a.getY());
        System.out.println(b.getY());
        System.out.println(c.getY()); 

      double ab=a.distance(b);
      double bc=b.distance(c);
      double ca=c.distance(a);
      System.out.println(ab);
      System.out.println(bc);
      System.out.println(ca);
    double raduisa=scn.nextDouble();
    double raduisb=scn.nextDouble();
    double raduisc=scn.nextDouble();
   circle ci=new circle(c, raduisc);
   circle ce=new circle(b, raduisb);
    circle cc=new circle(a, raduisa);
    System.out.println("area of ci is "+ci.surface());
    System.out.println(ce.surface());
    System.out.println(cc.surface());
     
    double s=scn.nextDouble();
    double l=scn.nextDouble();
    point d= new point(s, l);
     

    if(ci.inclus(d)){
        System.out.println("rehi mea a");
    }if(ce.inclus(d)){
        System.out.println("rehi mea b");
    }if(cc.inclus(d)){
        System.out.println("rehi mea c");
    }
    rectang r=new rectang(a, b);
     System.out.println(r.perimetre());
     System.out.println(r.surface());
   
   
    }
}

public class Main {
    class du{
        public void show(){
            System.out.println("hi");
        }
       
    }
    static class dudu{
        public void show(){
            System.out.println("hi" +"dudu");
        }
    }
abstract public class c{
    abstract public void show1();
}

public static void main(String[] args) {
        A ob=new B();
        ob.show();
        ob.add(5, 20);
      //ida ken abstract meth tkun ghir f abst class w abst class n9drush ndirulha created l object bseh t9der tkun refrence , w extends l class abstract lezm nzidu fiha chwya methods li rehom abstract .. w ida dernehmsh bkl implement f sub class ,nroduha hata hya abstract
      //inner class hya class dekhl class wn3aytolha b classlikbira.classlidekhleha 
      //ki ncryiw menha obj ndiru te3 new  =obj(ncriyiweh men class kbira psq class wlet non static method).new class lildkhl(); 
       Main ma=new Main();
       Main.du du=ma.new du();
       du.show();
       //ida class li ldakhl static we kan do :classlkbira.limndekhl f new
        Main.dudu nu=new Main.dudu();
        nu.show();
        //ne9drou ndiru define te3 meth wra create obj 9ebel ; ida kuna reh nsts3mlu override te3 method hdik mara berk
        A a=new A(){
            public void show(){
                System.out.println("hello in main class");
            }
        };//wsmeha anonymous class f files nlgaha $1

        a.show();
    //ok ne9dru blama ndiru extends l abstract class ki ncryiw object mn abstract *mene9drush *ndiruh anonymous l meth te3 abstract whaka ne9dru ncryiw obj mn abstract

     Main nun=new Main();
     Main.c cu=nun.new c(){
        public void show1(){
            System.out.println("hi dudu");
        }
     };
     //voila exmple li 3da .
     
    }
    }
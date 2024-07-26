public class Main {
    public static void main(String[] args) {
    
        person p= new person("diba","bel", 4);
        person f=new person("dudu", "nu", 36);
        teacher t=new teacher("fouzia", 15);
        module m=t.createmod(60, 90);
        System.out.println(m.getModcode());
        System.out.println(m.getTeachercode());
        m.setmodcode(50);
        System.out.println(m.getModcode());

    }
}

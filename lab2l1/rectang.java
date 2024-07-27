package lab2l1;

import java.util.Scanner;

public class rectang {
    point cor1;
    point cor2;
    
    public rectang(point cor1, point cor2) {
        this.cor1 = cor1;
        this.cor2 = cor2;
    }

    
    public point getCor1() {
        return cor1;
    }


    public point getCor2() {
        return cor2;
    }
public double perimetre(){
    double width = Math.abs(cor2.getX() - cor1.getX());
    double height = Math.abs(cor2.getY() - cor1.getY());
    return 2*(width +height);

}

    public double surface(){
        double width = Math.abs(cor2.getX() - cor1.getX());
        double height = Math.abs(cor2.getY() - cor1.getY());
        return width * height;
    }
  
}

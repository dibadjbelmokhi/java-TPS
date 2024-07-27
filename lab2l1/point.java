package lab2l1;

public class point {
    private double x;
    private double y;
    public point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public point symx(){
        return new point(x,-y);
    }
    public point symy(){
        return new point(-x, y);
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double distance(point ot){
        double dx=this.x-ot.x;
        double dy=this.y-ot.y;
        return Math.sqrt(dx*dx+dy*dy);
    }
}

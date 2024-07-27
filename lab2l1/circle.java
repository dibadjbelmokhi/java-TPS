package lab2l1;

public class circle {
    point center;
    private double raduis;
    public circle(point center,double raduis){
        this.center=center;
        this.raduis=raduis;
    }
    public double getrad(){
        return raduis;
    }
    public point getCenter() {
        return center;
    }
    public double surface(){
        return Math.PI*raduis*raduis;
    }
    public boolean inclus(point p){
      double distance=center.distance(p);
      if (distance<=raduis){
      return true;
      }else{
        return false;
      }
    }
    public double distance( point c){
        double distance=this.distance(c);
        return distance;
    }
}


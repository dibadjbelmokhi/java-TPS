
public class plane{
    private String brand;
    private final String model;
    private  final int capacity;
    private final  int year;
    public plane(String brand,String model,int i,int year){
        this.brand=brand;
        this.model=model;
        this.capacity=i;
        this.year=year;
    }
    public String getBrand() {
        return brand;
    }
    

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    
}
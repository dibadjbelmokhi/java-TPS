package Entities;
public class plane{
    private String brand;
    private final String model;
    private  final Double capacity;
    private final  int year;
    public plane(String brand,String model,Double capacity,int year){
        this.brand=brand;
        this.model=model;
        this.capacity=capacity;
        this.year=year;
    }
    public String getBrand() {
        return brand;
    }
    

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    
}
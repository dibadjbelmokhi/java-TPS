package Entities;
public class plane{
    private String brand;
    private static String model;
    private  static Double capacity;
    private static  int year;
    public plane(String brand,String model,Double capacity,int year){
        this.brand=brand;
        this.model=model;
        this.capacity=capacity;
        this.year=year;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public Double getCapacity() {
        return capacity;
    }
    public int getYear() {
        return year;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }
    public void setYear(int year) {
        this.year = year;
    }
    
}
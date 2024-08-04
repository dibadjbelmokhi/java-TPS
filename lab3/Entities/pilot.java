package Entities;
public class pilot {
    private final int id;
    private String name;
    private Double flighthours;
    public pilot( int id,String name, Double flighthours) {
        this.name = name;
        this.id=id;
        this.flighthours = flighthours;
    }
  
    public String getName() {
        return name;
    }
    public Double getFlighthours() {
        return flighthours;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setFlighthours(Double flighthours) {
        this.flighthours = flighthours;
    }
    
    
}

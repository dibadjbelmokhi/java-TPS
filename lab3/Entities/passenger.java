package Entities;
public class passenger {
    private int passengernb;
    private String name;
    private String surname;
    private String email;
    private Double phone;
    public passenger(int passengernb, String name, String surname, String email, Double phone) {
        this.passengernb = passengernb;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
    }
    public passenger(int passengernb, String name, String surname) {
        this.passengernb = passengernb;
        this.name = name;
        this.surname = surname;
    }
    public void setPassengernb(int passengernb) {
        this.passengernb = passengernb;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(Double phone) {
        this.phone = phone;
    }
    public int getPassengernb() {
        return passengernb;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getEmail() {
        return email;
    }
    public Double getPhone() {
        return phone;
    }
    
}

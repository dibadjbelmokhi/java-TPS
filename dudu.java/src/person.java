public class person {
private String name;
private String fname;
private int nin;
public person(String name, String fname, int nin) {
    this.name = name;
    this.fname = fname;
    this.nin = nin;
}
public void setName(String name) {
    this.name = name;
}
public void setFname(String fname) {
    this.fname = fname;
}
public void setNin(int nin) {
    this.nin = nin;
}
public String getName() {
    return name;
}
public String getFname() {
    return fname;
}
public int getNin() {
    return nin;
} 


}

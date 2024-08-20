

public class booking {
    private  int booknb;
    private final passenger passer;
    private final flight flit;
    private String Status;
    public booking(int booknb,passenger passer,flight flit,String status) {
        this.Status = status;
        this.passer=passer;
        this.flit=flit;
        this.booknb=booknb;

    }
    public  int getBooknb() {
        return booknb;
    }
    public String getStatus() {
        return Status;
    }
    public static void setBooknb(int booknb) {
        booknb = booknb;
    }
    public void setStatus(String status) {
        Status = status;
    }
    

    
}

package program;

public class booking {
    private static int booknb;
    private final String passer;
    private final String flit;
    private String Status;
    public booking(int booknb,String passer,String flit,String status) {
        this.Status = status;
        this.passer=passer;
        this.flit=flit;
        this.booknb=booknb;

    }
    public static int getBooknb() {
        return booknb;
    }
    public String getStatus() {
        return Status;
    }
    public static void setBooknb(int booknb) {
        booking.booknb = booknb;
    }
    public void setStatus(String status) {
        Status = status;
    }
    

    
}

class Movie{
    private String title;
    private String duration;
    public Movie(String title,String duration){
        this.title = title;
        this.duration = duration;
    }
    public String getTitle() {
        return title;
    }
    public String getDuration() {
        return duration;
    }
}
class Ticket extends Movie{
    private String seatNo;
    private double price;
    public Ticket(String title,String duration,String seatNo,double price){
        super(title, duration);
        this.price = price;
        this.seatNo = seatNo;
    }
    void ticketDetails(){
        System.out.println("\tTicket Details");
        System.out.println("----------------------------");
        System.out.println("Movie Name     : "+getTitle());
        System.out.println("Movie Duration : "+getDuration());
        System.out.println("Seat Number    : "+seatNo);
        System.out.println("Ticket Price   : Rs."+price);
        System.out.println("----------------------------");
    }
    public void bookTickets(int noOfTickets) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'bookTickets'");
    }
}
public class MovieTicketSystem {
    public static void main(String[] args) {
        Ticket t1 = new Ticket("Dragon", "3hrs20min", "k14", 180);
        t1.ticketDetails();
    }
}
// 10. Movie-Theater Ticket
// Parent Class: Movie with title and duration.

// Child Class: Ticket with seatNo, price.

// Task: Display ticket details including movie info.
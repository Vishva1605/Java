package Others.Threads;
class Tickets{
    private int tickets;
    Tickets(int tickets){
        this.tickets = tickets;
    }
    public synchronized void bookTickets(int noOfTickets){
            try{Thread.sleep(1000);}catch(InterruptedException e){Thread.currentThread().interrupt();};
            System.out.println(Thread.currentThread().getName()+" wants to Book "+noOfTickets+" Tickets.");
            try{Thread.sleep(1000);}catch(InterruptedException e){Thread.currentThread().interrupt();};
            if(tickets == 0){
                System.out.println("Ticket Housefull. No Tickets Available.");
            }else if(noOfTickets<=tickets){
                tickets-=noOfTickets;
                System.out.println("Booking Successfull.");
            }else{
                System.out.println("Booking Failed. Total Number Of Tickets Avilable : "+tickets);
            }
    }
}
class Mytickets extends Thread{
    private Tickets ticket;
    private int noOfTickets;
    Mytickets(Tickets ticket,String name,int noOfTickets){
        super(name);
        this.ticket = ticket;
        this.noOfTickets = noOfTickets;
    }
    public void run(){
            ticket.bookTickets(noOfTickets);
    }
}
public class TicketBookingSystem {
    public static void main(String[] args) {
        int noOfTickets = 20;
        Tickets t = new Tickets(noOfTickets);

        Mytickets t1 = new Mytickets(t,"Vishva",7);
        Mytickets t2 = new Mytickets(t, "Ramesh", 8);
        Mytickets t3 = new Mytickets(t,"Suresh", 4);
        Mytickets t4 = new Mytickets(t,"Naina",6);
        Mytickets t5 = new Mytickets(t, "Sanjai", 1);

        t1.start();t2.start();t3.start();t4.start();t5.start();
        
    }
}

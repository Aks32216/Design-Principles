abstract public class TicketHandler {
    TicketHandler ticketHandler;

    TicketHandler(TicketHandler ticketHandler){
        this.ticketHandler=ticketHandler;
    }

    public void supportTicket(Priority priority){
        if(ticketHandler!=null){
            ticketHandler.supportTicket(priority);
        } else {
            System.out.println("Ticket cannot be handled");
        }
    }
}

public class LevelOneTicketHandler extends TicketHandler{
    LevelOneTicketHandler(TicketHandler ticketHandler) {
        super(ticketHandler);
    }

    @Override
    public void supportTicket(Priority priority) {
        if(priority == Priority.LOW){
            System.out.println("Level 1 support provided");
        } else {
            super.supportTicket(priority);
        }
    }
}

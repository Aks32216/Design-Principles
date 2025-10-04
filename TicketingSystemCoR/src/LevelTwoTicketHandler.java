public class LevelTwoTicketHandler extends  TicketHandler{
    LevelTwoTicketHandler(TicketHandler ticketHandler) {
        super(ticketHandler);
    }

    @Override
    public void supportTicket(Priority priority) {
        if(priority == Priority.MEDIUM || priority == Priority.LOW) {
            System.out.println("Level 2 support provided");
        } else {
            super.supportTicket(priority);
        }
    }
}

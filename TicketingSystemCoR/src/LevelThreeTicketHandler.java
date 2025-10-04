public class LevelThreeTicketHandler extends TicketHandler{
    LevelThreeTicketHandler(TicketHandler ticketHandler) {
        super(ticketHandler);
    }

    @Override
    public void supportTicket(Priority priority) {
        if(priority == Priority.HIGH || priority == Priority.MEDIUM || priority == Priority.LOW){
            System.out.println("Level 3 support provided");
        } else {
            super.supportTicket(priority);
        }
    }
}

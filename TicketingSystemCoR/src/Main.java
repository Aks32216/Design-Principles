//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TicketHandler ticketHandler = new LevelOneTicketHandler(new LevelTwoTicketHandler(new LevelThreeTicketHandler(null)));

        ticketHandler.supportTicket(Priority.LOW);
        ticketHandler.supportTicket(Priority.MEDIUM);
        ticketHandler.supportTicket(Priority.HIGH);
        ticketHandler.supportTicket(Priority.UNKNOWN);
    }
}
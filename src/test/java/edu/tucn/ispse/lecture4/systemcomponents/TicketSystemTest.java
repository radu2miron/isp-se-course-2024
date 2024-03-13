package edu.tucn.ispse.lecture4.systemcomponents;

import edu.tucn.ispse.lecture4.Main;
import edu.tucn.ispse.lecture4.systemcomponents.AuthenticationModule;
import edu.tucn.ispse.lecture4.systemcomponents.TicketSystem;
import edu.tucn.ispse.lecture4.model.Ticket;
import edu.tucn.ispse.lecture4.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

/**
 * @author Radu Miron
 * @version 1
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TicketSystemTest {
    private TicketSystem ticketSystem;

    @BeforeAll
    public void init() {
        User[] users = Main.createUsers();
        AuthenticationModule authenticationModule = new AuthenticationModule(users);
        ticketSystem = new TicketSystem(authenticationModule);
    }

    @Test
    public void testBuyTickets() {
        Ticket ticket = ticketSystem.buyTicket();
        Assertions.assertNotNull(ticket, "the ticket should have been created");
        Assertions.assertTrue(ticket.isValid(), "initially, the ticket should be valid");
        Assertions.assertNotNull(ticket.getSerialNumber(), "the serial number should be not null");
        Assertions.assertNotNull(ticket.getImagePath(), "the image path number should be not null");
    }

    @Test
    public void testScanTickets() {
        Ticket ticket = ticketSystem.buyTicket();
        Assertions.assertNotNull(ticket, "the ticket should have been created");

        Assertions.assertTrue(ticketSystem.scanTicket(ticket.getImagePath()), "the ticket should pass the scan");
        Assertions.assertFalse(ticket.isValid(), "the ticket should be invalidated after the scan");
    }

    @Test
    public void testCancelTicket() {
        Ticket ticket = ticketSystem.buyTicket();
        Assertions.assertNotNull(ticket, "the ticket should have been created");
        ticketSystem.cancelTicket(ticket.getSerialNumber());
        Assertions.assertNotNull(ticket, "the ticket should be not null after the cancellation");
        Assertions.assertFalse(ticket.isValid());
    }
}

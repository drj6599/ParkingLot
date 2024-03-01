package ParkingLot.repository;

import ParkingLot.exception.TicketNotFoundException;
import ParkingLot.model.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {

    private static TicketRepository instance;
    private Map<Integer, Ticket> ticketMap;

    private TicketRepository() {
        this.ticketMap = new HashMap<>();
    }

    public static TicketRepository getInstance()
    {
        if(instance == null)
        {
            return new TicketRepository();
        }
        return instance;
    }

    public Ticket getTicket(int ticketId)
    {
        Ticket ticket = ticketMap.get(ticketId);
        if(ticket == null){
            throw new TicketNotFoundException("Ticket not found for id : " + ticketId);
        }
        return ticket;
    }

    public void addTicketToRepository(Ticket ticket)
    {
        ticketMap.put(ticket.getId(),ticket);
        System.out.println("The Ticket is added to Repository Successfully");
    }
}

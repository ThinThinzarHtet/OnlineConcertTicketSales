package com.ttzh.concertTicket.service;

import com.ttzh.concertTicket.model.Ticket;
import com.ttzh.concertTicket.model.TicketType;

import java.util.List;

public interface TicketTypeService {
    List<TicketType> getAll();
    TicketType getById(Long id);
    TicketType create(TicketType ticketType);
    TicketType update(TicketType ticketType);
    void deleteById(Long id);
}

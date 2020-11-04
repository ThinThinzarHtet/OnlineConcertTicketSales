package com.ttzh.concertTicket.service;

import com.ttzh.concertTicket.model.Ticket;

import java.util.List;

public interface TicketService {
    List<Ticket> getAll();
    Ticket getById(Long id);
    Ticket create(Ticket ticket);
    Ticket update(Ticket ticket);
    void deleteById(Long id);
}

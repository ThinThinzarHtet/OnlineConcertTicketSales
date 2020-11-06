package com.ttzh.concertTicket.service;

import com.ttzh.concertTicket.model.Ticket;
import com.ttzh.concertTicket.repository.TicketRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService{
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public List<Ticket> getAll() {
        return ticketRepository.findAll();
    }

    @Override
    public Ticket getById(Long id) {
        return ticketRepository.getOne(id);
    }

    @Override
    public Ticket create(Ticket ticket) {
        return ticketRepository.saveAndFlush(ticket);
    }

    @Override
    public Ticket update(Ticket ticket) {
        Ticket oldTicket = ticketRepository.getOne(ticket.getId());
        BeanUtils.copyProperties(ticket, oldTicket,"id","serialNo");
        return ticketRepository.saveAndFlush(ticket);
    }

    @Override
    public void deleteById(Long id) {
        ticketRepository.deleteById(id);
    }
}

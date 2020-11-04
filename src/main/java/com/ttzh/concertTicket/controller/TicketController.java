package com.ttzh.concertTicket.controller;

import com.ttzh.concertTicket.model.Ticket;
import com.ttzh.concertTicket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @GetMapping
    public List<Ticket> getAll(){
        return ticketService.getAll();
    }
    @GetMapping("{id}")
    public Ticket getById(@PathVariable Long id){
        return ticketService.getById(id);
    }
    @PostMapping
    public Ticket create(@RequestBody Ticket ticket){
        return ticketService.create(ticket);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Ticket update(@RequestBody Ticket ticket){
        return ticketService.update(ticket);
    }
    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id){
        ticketService.deleteById(id);
    }
}

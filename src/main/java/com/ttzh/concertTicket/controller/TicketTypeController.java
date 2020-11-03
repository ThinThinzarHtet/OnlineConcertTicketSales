package com.ttzh.concertTicket.controller;

import com.ttzh.concertTicket.model.TicketType;
import com.ttzh.concertTicket.service.TicketTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/ticketType")
public class TicketTypeController {
    @Autowired
    private TicketTypeService ticketTypeService;

    @GetMapping
    public List<TicketType> getAll(){
        return ticketTypeService.getAll();
    }
    @GetMapping("{id}")
    public TicketType getById(@PathVariable Long id){
        return ticketTypeService.getById(id);
    }
    @PostMapping
    public TicketType create(@RequestBody TicketType ticketType){
        return ticketTypeService.create(ticketType);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public TicketType update(@RequestBody TicketType ticketType){
        return ticketTypeService.update(ticketType);
    }
    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id){
        ticketTypeService.deleteById(id);
    }
}

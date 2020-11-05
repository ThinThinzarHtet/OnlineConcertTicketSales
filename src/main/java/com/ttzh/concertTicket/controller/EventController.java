package com.ttzh.concertTicket.controller;

import com.ttzh.concertTicket.model.Event;
import com.ttzh.concertTicket.service.EventService;
import com.ttzh.concertTicket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/event")
public class EventController {
    @Autowired
    private EventService eventService;

    @Autowired
    private TicketService ticketService;

    @GetMapping
    public List<Event> getAll(){
        return eventService.getAll();
    }
    @GetMapping("{id}")
    public Event getById(@PathVariable Long id){
        return eventService.getById(id);
    }
    @PostMapping
    public Event create(@RequestBody Event event){
        return eventService.create(event);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Event update(@RequestBody Event event){
        return eventService.update(event);
    }
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id){
        eventService.deleteById(id);
    }
}

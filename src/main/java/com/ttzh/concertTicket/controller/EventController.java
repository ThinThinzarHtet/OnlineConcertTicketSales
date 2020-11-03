package com.ttzh.concertTicket.controller;

import com.ttzh.concertTicket.model.Event;
import com.ttzh.concertTicket.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/event")
public class EventController {
    @Autowired
    private EventService eventService;

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
    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteById(Long id){
        eventService.deleteById(id);
    }
}

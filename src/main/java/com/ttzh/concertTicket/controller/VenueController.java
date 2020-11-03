package com.ttzh.concertTicket.controller;

import com.ttzh.concertTicket.model.Venue;
import com.ttzh.concertTicket.service.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/venue")
public class VenueController {
    @Autowired
    private VenueService venueService;

    @GetMapping
    public List<Venue> getALl(){
        return venueService.getAll();
    }
    @GetMapping("{id}")
    public Venue getById(@PathVariable Long id){
        return venueService.getById(id);
    }
    @PostMapping
    public Venue create(@RequestBody Venue venue){
        return venueService.create(venue);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Venue update(@RequestBody Venue venue){
        return venueService.update(venue);
    }
    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id){
        venueService.deleteById(id);
    }
}

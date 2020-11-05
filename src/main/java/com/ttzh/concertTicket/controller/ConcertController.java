package com.ttzh.concertTicket.controller;

import com.ttzh.concertTicket.model.Concert;
import com.ttzh.concertTicket.service.ArtistService;
import com.ttzh.concertTicket.service.ConcertService;
import com.ttzh.concertTicket.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/concert")
public class ConcertController {
    @Autowired
    private ConcertService concertService;

    @Autowired
    private EventService eventService;

    @GetMapping
    public List<Concert> getAll(){
        return concertService.getAll();
    }
    @GetMapping("{id}")
    public Concert getById(@PathVariable Long id){
        return concertService.getById(id);
    }
    @PostMapping
    public Concert create(@RequestBody Concert concert){
        return concertService.create(concert);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Concert update(@RequestBody Concert concert){
        return concertService.update(concert);
    }
    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id){
        concertService.deleteById(id);
    }

    //find concerts by artist id
    @GetMapping("artist/{id}")
    public List<Concert> getByArtistsId(@PathVariable Long id){
        return concertService.getByArtistsId(id);
    }

    //find concerts by artist name
    @GetMapping("artist/name/{name}")
    public List<Concert> getByArtistsName(@PathVariable String name){
        return concertService.getByArtistsName(name);
    }
    //add events to concert
   /*@PostMapping(value = "event")
    public Concert addEvent(@RequestBody Map<String, Object> concertEvent){
        return concertService.create();
    }*/

}

package com.ttzh.concertTicket.controller;

import com.ttzh.concertTicket.model.Artist;
import com.ttzh.concertTicket.model.Concert;
import com.ttzh.concertTicket.service.ArtistService;
import com.ttzh.concertTicket.service.ConcertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/artist")
public class ArtistController {
    @Autowired
    private ArtistService artistService;

    @GetMapping
    public List<Artist> getAll(){
        return artistService.getAll();
    }
    @GetMapping("{id}")
    public Artist getById(@PathVariable Long id){
        return artistService.getById(id);
    }
    @PostMapping
    public Artist create(@RequestBody Artist artist){
        return artistService.create(artist);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Artist update(@RequestBody Artist artist){
        return artistService.update(artist);
    }
    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id){
        artistService.deleteById(id);
    }

}

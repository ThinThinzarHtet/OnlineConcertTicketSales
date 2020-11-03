package com.ttzh.concertTicket.controller;

import com.ttzh.concertTicket.model.Concert;
import com.ttzh.concertTicket.service.ConcertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/concert")
public class ConcertController {
    @Autowired
    private ConcertService concertService;

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
    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id){
        concertService.deleteById(id);
    }
}

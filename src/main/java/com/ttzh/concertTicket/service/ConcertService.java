package com.ttzh.concertTicket.service;

import com.ttzh.concertTicket.model.Concert;

import java.util.List;

public interface ConcertService {
    List<Concert> getAll();
    Concert getById(Long id);
    Concert create(Concert concert);
    Concert update(Concert concert);
    void deleteById(Long id);
}

package com.ttzh.concertTicket.service;

import com.ttzh.concertTicket.model.Venue;

import java.util.List;

public interface VenueService {
    List<Venue> getAll();
    Venue getById(Long id);
    Venue create(Venue venue);
    Venue update(Venue venue);
    void deleteById(Long id);
}

package com.ttzh.concertTicket.service;

import com.ttzh.concertTicket.model.Event;

import java.util.List;

public interface EventService {
    List<Event> getAll();
    Event getById(Long id);
    Event create(Event event);
    Event update(Event event);
    void deleteById(Long id);
}

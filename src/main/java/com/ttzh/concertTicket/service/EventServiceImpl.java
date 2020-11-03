package com.ttzh.concertTicket.service;

import com.ttzh.concertTicket.model.Event;
import com.ttzh.concertTicket.repository.EventRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService{
    @Autowired
    private EventRepository eventRepository;
    @Override
    public List<Event> getAll() {
        return eventRepository.findAll();
    }

    @Override
    public Event getById(Long id) {
        return eventRepository.getOne(id);
    }

    @Override
    public Event create(Event event) {
        return eventRepository.saveAndFlush(event);
    }

    @Override
    public Event update(Event event) {
        Event oldEvent = eventRepository.getOne(event.getId());
        BeanUtils.copyProperties(oldEvent, event,"id");
        return eventRepository.saveAndFlush(oldEvent);
    }

    @Override
    public void deleteById(Long id) {
        eventRepository.deleteById(id);
    }
}

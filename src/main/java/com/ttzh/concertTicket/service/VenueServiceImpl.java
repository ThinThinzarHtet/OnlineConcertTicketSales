package com.ttzh.concertTicket.service;

import com.ttzh.concertTicket.model.Venue;
import com.ttzh.concertTicket.repository.VenueRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VenueServiceImpl implements VenueService {
    @Autowired
    private VenueRepository venueRepository;

    @Override
    public List<Venue> getAll() {
        return venueRepository.findAll();
    }

    @Override
    public Venue getById(Long id) {
        return venueRepository.getOne(id);
    }

    @Override
    public Venue create(Venue venue) {
        return venueRepository.saveAndFlush(venue);
    }

    @Override
    public Venue update(Venue venue) {
        Venue oldVenue = venueRepository.getOne(venue.getId());
        BeanUtils.copyProperties(venue, oldVenue,"id");
        return venueRepository.saveAndFlush(oldVenue);
    }

    @Override
    public void deleteById(Long id) {
        venueRepository.deleteById(id);
    }
}

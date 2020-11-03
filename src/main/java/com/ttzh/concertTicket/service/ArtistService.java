package com.ttzh.concertTicket.service;

import com.ttzh.concertTicket.model.Artist;

import java.util.List;

public interface ArtistService {
    List<Artist> getAll();
    Artist getById(Long id);
    Artist create(Artist artist);
    Artist update(Artist artist);
    void deleteById(Long id);
}

package com.ttzh.concertTicket.service;

import com.ttzh.concertTicket.model.Artist;
import com.ttzh.concertTicket.repository.ArtistRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistServiceImpl implements ArtistService{
    @Autowired
    private ArtistRepository artistRepository;
    @Override
    public List<Artist> getAll() {
        return artistRepository.findAll();
    }

    @Override
    public Artist getById(Long id) {
        return artistRepository.getOne(id);
    }

    @Override
    public Artist create(Artist artist) {
        return artistRepository.saveAndFlush(artist);
    }

    @Override
    public Artist update(Artist artist) {
        Artist oldArtist = artistRepository.getOne(artist.getId());
        BeanUtils.copyProperties(artist, oldArtist, "id");
        return artistRepository.saveAndFlush(oldArtist);
    }

    @Override
    public void deleteById(Long id) {
        artistRepository.deleteById(id);
    }
}

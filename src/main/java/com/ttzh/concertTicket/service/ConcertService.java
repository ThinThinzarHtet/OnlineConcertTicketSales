package com.ttzh.concertTicket.service;

import com.ttzh.concertTicket.model.Concert;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface ConcertService {
    List<Concert> getAll();

    Concert getById(Long id);

    Concert create(Concert concert);

    Concert update(Concert concert);

    void deleteById(Long id);

    List<Concert> getByArtistsId(Long id);

    List<Concert> getByArtistsName(String name);

    //Concert addEvent(Map<String, Object> concertEvent);

}

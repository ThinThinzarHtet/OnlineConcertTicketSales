package com.ttzh.concertTicket.repository;

import com.ttzh.concertTicket.model.Concert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ConcertRepository extends JpaRepository<Concert, Long> {
    List<Concert> findByArtistsId(Long id);

    List<Concert> findByArtistsName(String name);

}

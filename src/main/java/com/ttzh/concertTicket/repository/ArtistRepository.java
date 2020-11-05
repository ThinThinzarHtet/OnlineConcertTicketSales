package com.ttzh.concertTicket.repository;

import com.ttzh.concertTicket.model.Artist;
import com.ttzh.concertTicket.model.Concert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {
}

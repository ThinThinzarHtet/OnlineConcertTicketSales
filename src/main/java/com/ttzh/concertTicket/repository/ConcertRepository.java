package com.ttzh.concertTicket.repository;

import com.ttzh.concertTicket.model.Concert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ConcertRepository extends JpaRepository<Concert, Long> {
    List<Concert> findByArtistsId(Long id);

    List<Concert> findByArtistsName(String name);

    @Modifying
    @Query(value = "insert into event values (:name, :startDate, :endDate, :startTime, :endTime",nativeQuery = true)
    public void saveEvent(@Param("name") String name, @Param("startDate") Date startDate, @Param("endDate") Date endDate,@Param("startTime") Date startTime,@Param("endTime") Date endTime);
}

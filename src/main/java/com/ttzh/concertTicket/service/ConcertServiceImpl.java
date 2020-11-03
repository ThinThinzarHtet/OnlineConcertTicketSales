package com.ttzh.concertTicket.service;

import com.ttzh.concertTicket.model.Concert;
import com.ttzh.concertTicket.repository.ConcertRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConcertServiceImpl implements ConcertService{
    @Autowired
    ConcertRepository concertRepository;
    @Override
    public List<Concert> getAll() {
        return concertRepository.findAll();
    }

    @Override
    public Concert getById(Long id) {
        return concertRepository.getOne(id);
    }

    @Override
    public Concert create(Concert concert) {
        return concertRepository.saveAndFlush(concert);
    }

    @Override
    public Concert update(Concert concert) {
        Concert oldConcert = concertRepository.getOne(concert.getId());
        BeanUtils.copyProperties(oldConcert, concert,"id");
        return concertRepository.saveAndFlush(oldConcert);
    }

    @Override
    public void deleteById(Long id) {
        concertRepository.deleteById(id);
    }
}

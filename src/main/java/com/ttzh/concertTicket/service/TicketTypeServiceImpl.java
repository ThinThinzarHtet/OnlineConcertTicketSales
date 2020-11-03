package com.ttzh.concertTicket.service;

import com.ttzh.concertTicket.model.TicketType;
import com.ttzh.concertTicket.repository.TicketTypeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketTypeServiceImpl implements TicketTypeService {
    @Autowired
    private TicketTypeRepository ticketTypeRepository;

    @Override
    public List<TicketType> getAll() {
        return ticketTypeRepository.findAll();
    }

    @Override
    public TicketType getById(Long id) {
        return ticketTypeRepository.getOne(id);
    }

    @Override
    public TicketType create(TicketType ticketType) {
        return ticketTypeRepository.saveAndFlush(ticketType);
    }

    @Override
    public TicketType update(TicketType ticketType) {
        TicketType oldTicketType = ticketTypeRepository.getOne(ticketType.getId());
        BeanUtils.copyProperties(oldTicketType, ticketType,"id");
        return ticketTypeRepository.saveAndFlush(ticketType);
    }

    @Override
    public void deleteById(Long id) {
        ticketTypeRepository.deleteById(id);
    }
}

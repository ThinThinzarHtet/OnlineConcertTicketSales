package com.ttzh.concertTicket.service;

import com.ttzh.concertTicket.model.CustomerOrder;

import java.util.List;

public interface CustomerOrderService {
    List<CustomerOrder> getAll();
    CustomerOrder getById(Long id);
    CustomerOrder create(CustomerOrder customerOrder);
    CustomerOrder update(CustomerOrder customerOrder);
    void deleteById(Long id);
}

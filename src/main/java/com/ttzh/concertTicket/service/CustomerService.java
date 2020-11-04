package com.ttzh.concertTicket.service;

import com.ttzh.concertTicket.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAll();
    Customer getById(Long id);
    Customer create(Customer customer);
    Customer update(Customer customer);
    void deleteById(Long id);
}

package com.ttzh.concertTicket.service;

import com.ttzh.concertTicket.model.Customer;
import com.ttzh.concertTicket.repository.CustomerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getById(Long id) {
        return customerRepository.getOne(id);
    }

    @Override
    public Customer create(Customer customer) {
        return customerRepository.saveAndFlush(customer);
    }

    @Override
    public Customer update(Customer customer) {
        Customer oldCustomer = customerRepository.getOne(customer.getId());
        BeanUtils.copyProperties(customer, oldCustomer,"id");
        return customerRepository.saveAndFlush(oldCustomer);
    }

    @Override
    public void deleteById(Long id) {
        customerRepository.deleteById(id);
    }
}

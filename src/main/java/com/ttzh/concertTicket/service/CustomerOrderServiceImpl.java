package com.ttzh.concertTicket.service;

import com.ttzh.concertTicket.model.CustomerOrder;
import com.ttzh.concertTicket.repository.CustomerOrderRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {
    @Autowired
    private CustomerOrderRepository customerOrderRepository;

    @Override
    public List<CustomerOrder> getAll() {
        return customerOrderRepository.findAll();
    }

    @Override
    public CustomerOrder getById(Long id) {
        return customerOrderRepository.getOne(id);
    }

    @Override
    public CustomerOrder create(CustomerOrder customerOrder) {
        return customerOrderRepository.saveAndFlush(customerOrder);
    }

    @Override
    public CustomerOrder update(CustomerOrder customerOrder) {
        CustomerOrder oldCustomerOrder = customerOrderRepository.getOne(customerOrder.getId());
        BeanUtils.copyProperties(customerOrder, oldCustomerOrder,"id");
        return customerOrderRepository.saveAndFlush(oldCustomerOrder);
    }

    @Override
    public void deleteById(Long id) {
        customerOrderRepository.deleteById(id);
    }
}

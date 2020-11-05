package com.ttzh.concertTicket.controller;

import com.ttzh.concertTicket.model.Customer;
import com.ttzh.concertTicket.model.CustomerOrder;
import com.ttzh.concertTicket.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/customerOrder")
public class CustomerOrderController {
    @Autowired
    private CustomerOrderService customerOrderService;

    @GetMapping
    public List<CustomerOrder> getAll(){
        return customerOrderService.getAll();
    }
    @GetMapping("{id}")
    public CustomerOrder getById(@PathVariable Long id){
        return customerOrderService.getById(id);
    }
    @PostMapping
    public CustomerOrder create(@RequestBody CustomerOrder customerOrder){
        return customerOrderService.create(customerOrder);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public CustomerOrder update(@RequestBody CustomerOrder customerOrder){
        return  customerOrderService.update(customerOrder);
    }
    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id){
        customerOrderService.deleteById(id);
    }
    }


package com.ttzh.concertTicket.controller;

import com.ttzh.concertTicket.model.Customer;
import com.ttzh.concertTicket.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> getAll(){
        return customerService.getAll();
    }
    @GetMapping("{id}")
    public Customer getById(@PathVariable Long id){
        return customerService.getById(id);
    }
    @PostMapping
    public Customer create(@RequestBody Customer customer){
        return customerService.create(customer);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Customer update(@RequestBody Customer customer){
        return customerService.update(customer);
    }
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id){
        customerService.deleteById(id);
    }
}

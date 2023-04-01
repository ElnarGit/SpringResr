package com.saparov.SpringRest.service;

import com.saparov.SpringRest.model.Customer;
import com.saparov.SpringRest.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CustomerServiceImp implements CustomerService{

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImp(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAll() {
        log.info("IN CustomerServiceImp getAll");
        return customerRepository.findAll();
    }

    @Override
    public Customer getById(Long id) {
        log.info("IN CustomerServiceImp getById {}", id);
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        log.info("IN CustomerServiceImp save {}", customer);
        customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        log.info("IN CustomerServiceImp delete {}", id);
        customerRepository.deleteById(id);
    }


}

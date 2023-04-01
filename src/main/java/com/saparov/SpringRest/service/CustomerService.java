package com.saparov.SpringRest.service;

import com.saparov.SpringRest.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer getById(Long id);

    void save(Customer customer);

    void delete(Long id);

    List<Customer> getAll();
}

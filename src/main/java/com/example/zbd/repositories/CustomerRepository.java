package com.example.zbd.repositories;

import com.example.zbd.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    public Customer findCustomerByEmail(String email);
    public Customer findCustomerById(Long id);

}

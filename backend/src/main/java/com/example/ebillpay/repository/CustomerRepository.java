package com.example.ebillpay.repository;

import com.example.ebillpay.dto.CustomerDTO;
import com.example.ebillpay.entity.Connections;
import com.example.ebillpay.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    CustomerDTO findByUserName(String userName);
}

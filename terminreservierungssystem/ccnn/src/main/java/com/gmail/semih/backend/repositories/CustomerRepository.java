package com.gmail.semih.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmail.semih.backend.data.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

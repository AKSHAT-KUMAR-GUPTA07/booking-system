package com.hackthon_project.bookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackthon_project.bookingsystem.entity.Customer;

public interface CustomerRespository extends JpaRepository<Customer , Long>{
    
}

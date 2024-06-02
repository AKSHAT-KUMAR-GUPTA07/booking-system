package com.hackthon_project.bookingsystem.service.serviceimpl;

import org.springframework.stereotype.Service;

import com.hackthon_project.bookingsystem.entity.Customer;
import com.hackthon_project.bookingsystem.repository.CustomerRespository;
import com.hackthon_project.bookingsystem.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
    
    private CustomerRespository customerRespository;

    public CustomerServiceImpl(CustomerRespository customerRespository){
        super();
        this.customerRespository=customerRespository;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRespository.save(customer);
    }
}

package com.hackthon_project.bookingsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hackthon_project.bookingsystem.entity.Customer;
import com.hackthon_project.bookingsystem.service.CustomerService;

@Controller
public class CustomerController {
    
    private CustomerService customerService;

    public CustomerController(CustomerService customerService){
        super();
        this.customerService=customerService;
    }


    @GetMapping("/adhar/new")
    public String createAdharForm(Model model){
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "create_adhar";
    }

    @PostMapping("/adhar/save")
    public String saveCustomer(@ModelAttribute("customer") Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/home";
    }


}

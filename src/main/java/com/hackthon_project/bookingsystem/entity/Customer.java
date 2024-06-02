package com.hackthon_project.bookingsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="customer")
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customer_name" , nullable = false)
    private String name;

    @Column(name = "customer_address" , nullable = false)
    private String address;

    @Column(name = "customer_number" , nullable = false)
    private Long phone_number;

    @Column(name = "customer_email")
    private String email;

    @Column(name = "customer_gender")
    private String gender;
}

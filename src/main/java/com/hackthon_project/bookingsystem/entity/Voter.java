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
@Table(name = "voters")
public class Voter {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "voter_name" , nullable = false)
    private String name;

    @Column(name = "voter_address" , nullable = false)
    private String address;

    @Column(name = "voter_number" , nullable = false)
    private Long phone_number;

    @Column(name = "voter_email")
    private String email;

    @Column(name = "voter_gender")
    private String gender;
}

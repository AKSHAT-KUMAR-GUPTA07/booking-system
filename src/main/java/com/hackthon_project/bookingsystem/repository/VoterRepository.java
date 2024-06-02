package com.hackthon_project.bookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackthon_project.bookingsystem.entity.Voter;

public interface VoterRepository extends JpaRepository<Voter , Long>{
    
}

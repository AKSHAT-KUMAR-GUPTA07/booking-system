package com.hackthon_project.bookingsystem.service.serviceimpl;

import org.springframework.stereotype.Service;

import com.hackthon_project.bookingsystem.entity.Voter;
import com.hackthon_project.bookingsystem.repository.VoterRepository;
import com.hackthon_project.bookingsystem.service.VoterService;

@Service
public class VoterServiceImpl implements VoterService{
    
    private VoterRepository voterRepository;

    public VoterServiceImpl(VoterRepository voterRepository){
        super();
        this.voterRepository=voterRepository;
    }

    @Override
    public Voter saveVoter(Voter voter) {
        return voterRepository.save(voter);
    }
}

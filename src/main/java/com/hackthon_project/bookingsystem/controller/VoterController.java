package com.hackthon_project.bookingsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hackthon_project.bookingsystem.entity.Voter;
import com.hackthon_project.bookingsystem.service.VoterService;

@Controller
public class VoterController {
    
    @SuppressWarnings("unused")
    private VoterService voterService;

    public VoterController(VoterService voterService){
        super();
        this.voterService=voterService;
    }

    @GetMapping("/voter/new")
    public String createVoterForm(Model model){
        Voter voter = new Voter();
        model.addAttribute("voter", voter);
        return "create_voter";
    }

    @PostMapping("/voter/save")
    public String saveVoter(@ModelAttribute("voter") Voter voter){
        voterService.saveVoter(voter);
        return "redirect:/home";
    }
}

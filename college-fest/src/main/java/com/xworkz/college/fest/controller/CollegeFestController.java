package com.xworkz.college.fest.controller;

import com.xworkz.college.fest.dto.CollegeFestDto;
import com.xworkz.college.fest.repository.CollegeFestRepo;
import com.xworkz.college.fest.repository.CollegeFestRepoImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")

public class CollegeFestController {
    @PostMapping("/college")
    public String post(@RequestParam String name,
                       @RequestParam String email,
                       @RequestParam String contact,
                       @RequestParam String competition,
                       @RequestParam String college, Model model)
    {
        System.out.println(name);
        System.out.println(email);
        System.out.println(contact);
        System.out.println(competition);
        System.out.println(college);
        CollegeFestDto collegeFestDto=new CollegeFestDto();
        collegeFestDto.setName(name);
        collegeFestDto.setEmail(email);
        collegeFestDto.setContact(contact);
        collegeFestDto.setCompetition(competition);
        collegeFestDto.setCollege(college);
        System.out.println(collegeFestDto);
        CollegeFestRepo collegeFestRepo=new CollegeFestRepoImpl();
        collegeFestRepo.save(collegeFestDto);
        System.out.println("Running in controller!");
        model.addAttribute("message","saved");
        model.addAttribute("collegeFestDto",collegeFestDto);
        return "postSuccess.jsp";
    }
}

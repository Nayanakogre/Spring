package com.xworkz.hiring.controller;

import com.xworkz.hiring.dto.HiringDto;
import com.xworkz.hiring.service.HiringService;
import com.xworkz.hiring.service.HiringServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")

public class HiringController {
    @Autowired
    private HiringService hiringService;
    public HiringController() {
        System.out.println("Running in HiringController");
    }

    @GetMapping("/job")
    public String getJobRoles(Model model) {
        List<String> list = new ArrayList<>();
        list.add("Software Enginneer");
        list.add("Software developer");
        list.add("Cloud Enginner");
        list.add("M L Enginnner");
        model.addAttribute("List", list);
        return "success.jsp";
    }

    @PostMapping("/role")
   public String save(
//           @RequestParam("name") String name,
//                       @RequestParam("email") String email,
//                       @RequestParam("role") String role,
            @ModelAttribute HiringDto hiringDto,
                       Model model) {
        System.out.println("Running in save");
        System.out.println("Hiring dto"+hiringDto);
//        HiringDto hiringDto = new HiringDto();
//        hiringDto.setName(name);
//        hiringDto.setEmail(email);
//        hiringDto.setRole(role);
         boolean save=hiringService.save(hiringDto);
        hiringService.save(hiringDto);

        if(save!=true)
        {
            model.addAttribute("result","not saved");
        }
        else {
            model.addAttribute("result","saved");
        }

        return "saveSuccess.jsp";
    }
}

package com.xworkz.seed.controller;

import com.xworkz.seed.dto.SeedInfoDto;
import com.xworkz.seed.service.SeedInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class SeedInfoController {

    @Autowired
    private SeedInfoService seedInfoService;

    public SeedInfoController() {

        System.out.println("Running in SeedInfoController");
    }

    @PostMapping("/addSuccess")
    public String save(@ModelAttribute SeedInfoDto seedInfoDto, Model model) {
        System.out.println("Running in save");
        System.out.println("SeedInfoDto " + seedInfoDto);
        boolean save = seedInfoService.save(seedInfoDto);

        if (save) {
            model.addAttribute("seedInfoDto", "saved");
        } else {
            model.addAttribute("seedInfoDto", "not saved");
        }

        return "addSeedSuccess";
    }



    @GetMapping("/getbyid")
    public String searchById(@RequestParam int id,Model model){
       SeedInfoDto seedInfoDto = seedInfoService.searchById(id);
       model.addAttribute("seedDto",seedInfoDto);
       return "searchSuccess";
    }
    @GetMapping("/update")
    public String update(@RequestParam int id,Model model){
        SeedInfoDto seedInfoDto = seedInfoService.searchById(id);
        model.addAttribute("seedDto",seedInfoDto);
        return "update.jsp";
    }
    @GetMapping("/delete")
    public String deleteById(@RequestParam int id, Model model) {
        boolean deleted = seedInfoService.deleteById(id);
        if (deleted) {
            model.addAttribute("result", "Deleted successfully");
            List<SeedInfoDto> seeds = seedInfoService.viewAll();
            model.addAttribute("seeds", seeds);
        } else {
            model.addAttribute("result", "Failed to delete");
        }
        return "viewAll";  // create simple JSP to show result
    }
    @GetMapping("/viewAll")
    public String viewAllSeeds(Model model) {
        List<SeedInfoDto> seeds = seedInfoService.viewAll();
        model.addAttribute("seeds", seeds);
        System.out.println(seeds);
        return "viewAll";
    }
//    @PostMapping("/update")
//    public String update(@ModelAttribute SeedInfoDto dto, Model model) {
//        boolean updated = seedInfoService.update(dto);
//
//        if (updated) {
//            model.addAttribute("result", "Updated successfully");
//        } else {
//            model.addAttribute("result", "Failed to update");
//        }
//
//        List<SeedInfoDto> seeds = seedInfoService.viewAll();
//        model.addAttribute("seeds", seeds);
//
//        return "viewAll.jsp";c  bv
//    }
@GetMapping("/edit")
public String editForm(@RequestParam int id, Model model) {
    SeedInfoDto dto = seedInfoService.searchById(id);
    model.addAttribute("seedInfoDto", dto);
    return "editSeed";
}

    @PostMapping("/update")
    public String update(@ModelAttribute SeedInfoDto dto, Model model) {
        boolean updated = seedInfoService.update(dto);

        if (updated) {
            model.addAttribute("result", "Updated successfully");
        } else {
            model.addAttribute("result", "Failed to update");
        }

        List<SeedInfoDto> seeds = seedInfoService.viewAll();
        model.addAttribute("seeds", seeds);

        return "viewAll";
    }
    @GetMapping("/getByType")
    public String viewByType(@RequestParam String type, Model model) {
        List<SeedInfoDto> seedList = seedInfoService.searchByType(type);
        System.out.println(seedList);
        model.addAttribute("seeds", seedList);
        return "viewAll";
    }




}




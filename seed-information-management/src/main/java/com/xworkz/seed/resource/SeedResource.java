package com.xworkz.seed.resource;

import com.xworkz.seed.dto.SeedInfoDto;
import com.xworkz.seed.service.SeedInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SeedResource {
    @Autowired
    private SeedInfoService seedInfoService;

    @GetMapping("/getName")
    public String getName()
    {
        System.out.println("Running in SeedResource");
        return "Nayana";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/viewAll", produces = "application/json")
    public List<SeedInfoDto> readAll()
    {
        //return new ArrayList();
        System.out.println(seedInfoService.viewAll());
        return seedInfoService.viewAll();
    }
    @PostMapping("/insert")
    public boolean save(@ModelAttribute SeedInfoDto seedInfoDtos)
    {
        System.out.println("Running in save");
        return seedInfoService.save(seedInfoDtos);
    }
//    @RequestMapping(method = RequestMethod.DELETE, value = "/delete")
//    @DeleteMapping("/delete")
//    public boolean deleteById(@RequestParam int id)
//    {
//        System.out.println("Running in deleteById");
//        return  seedInfoService.deleteById(id);
//    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteById(@PathVariable int id)
    {
        System.out.println("Running in deleteById");
        return  seedInfoService.deleteById(id);
    }
    @RequestMapping(method = RequestMethod.GET, value = "/update", produces = "application/json")
    public boolean update(@PathVariable int id, @RequestBody SeedInfoDto seedInfoDto) {
        seedInfoDto.setId(id); // manually set id from path to DTO
        return seedInfoService.update(seedInfoDto);
    }

}

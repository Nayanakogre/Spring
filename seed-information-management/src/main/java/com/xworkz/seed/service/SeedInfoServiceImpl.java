package com.xworkz.seed.service;

import com.xworkz.seed.dto.SeedInfoDto;
import com.xworkz.seed.repository.SeedInfoRepo;
import com.xworkz.seed.repository.SeedInfoRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service

public class SeedInfoServiceImpl implements SeedInfoService{
    @Autowired
    SeedInfoRepo seedInfoRepo;
    @Override
    public boolean save(SeedInfoDto seedInfoDto) {
        if(seedInfoDto!=null)
        {
            System.out.println("proceed");
            seedInfoRepo.save(seedInfoDto);
            return true;
        }
        else {
            System.out.println("Dto is null");
            return false;
        }

    }

    @Override
    public SeedInfoDto searchById(int id) {
        if(id!=0)
        {
            return seedInfoRepo.searchById(id);
        }
        else {
            System.out.println("id is is 0");
            return null;
        }
    }

    @Override
    public boolean deleteById(int id) {
        if(id!=0)
        {
            return seedInfoRepo.deleteById(id);
        }
        else {
            System.out.println("id is null");
            return false;

        }

    }

    @Override
    public List<SeedInfoDto> viewAll() {
        return seedInfoRepo.viewAll();
    }

    @Override
    public boolean update(SeedInfoDto seedInfoDto) {
        if(seedInfoDto!=null)
        {
            return seedInfoRepo.update(seedInfoDto);
        }
        else {
            return false;
        }
    }

    @Override
    public List<SeedInfoDto> searchByType(String type) {
        return seedInfoRepo.serachByType(type);
    }
}

package com.xworkz.seed.repository;

import com.xworkz.seed.dto.SeedInfoDto;

import java.util.List;


public interface SeedInfoRepo {
     boolean save(SeedInfoDto seedInfoDto);
     SeedInfoDto searchById(int id);
     boolean deleteById(int id);
     List<SeedInfoDto> viewAll();
     boolean update(SeedInfoDto seedInfoDto);
     List<SeedInfoDto> serachByType(String type);
}

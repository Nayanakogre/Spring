package com.xworkz.seed.service;

import com.xworkz.seed.dto.SeedInfoDto;

import java.util.List;

public interface SeedInfoService {
     boolean save(SeedInfoDto seedInfoDto);
     SeedInfoDto searchById(int id);
     boolean deleteById(int id);
     List<SeedInfoDto> viewAll();
     boolean update(SeedInfoDto seedInfoDto);
     List<SeedInfoDto> searchByType(String type);

}

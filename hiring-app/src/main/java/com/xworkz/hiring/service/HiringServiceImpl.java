package com.xworkz.hiring.service;

import com.xworkz.hiring.dto.HiringDto;
import com.xworkz.hiring.repository.HiringRepo;
import com.xworkz.hiring.repository.HiringRepoImpl;
import org.springframework.stereotype.Service;

@Service

public class HiringServiceImpl implements HiringService{
    HiringRepo hiringRepo=new HiringRepoImpl();
    @Override
    public boolean save(HiringDto hiringDto) {
        if(hiringDto!=null)
        {
            System.out.println("service proceded");
            hiringRepo.save(hiringDto);
            return true;
        }
        else {
            System.out.println("dto is null");
            return false;
        }
    }
}

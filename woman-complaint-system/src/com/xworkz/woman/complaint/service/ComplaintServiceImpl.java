package com.xworkz.woman.complaint.service;

import com.xworkz.woman.complaint.dto.ComplaintDto;
import com.xworkz.woman.complaint.repository.ComplaintRepository;
import com.xworkz.woman.complaint.repository.ComplaintRepositoryImpl;

import java.util.Collections;
import java.util.List;

public class ComplaintServiceImpl implements ComplaintService{
    ComplaintRepository complaintRepository=new ComplaintRepositoryImpl();
    @Override
    public boolean save(ComplaintDto complaintDto) {
        if (complaintDto != null) {
            System.out.println("procced");
            complaintRepository.save(complaintDto);

            return true;
        }

        else
        {
            System.out.println("dto is null");
            return false;
        }
    }

    @Override
    public List<ComplaintDto> view() {




        return complaintRepository.view();
    }

}

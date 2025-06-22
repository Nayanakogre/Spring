package com.xworkz.woman.complaint.service;

import com.xworkz.woman.complaint.dto.ComplaintDto;

import java.util.List;

public interface ComplaintService {
    public boolean save(ComplaintDto complaintDto);
    public List<ComplaintDto> view();
}

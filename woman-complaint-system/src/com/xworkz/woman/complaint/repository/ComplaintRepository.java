package com.xworkz.woman.complaint.repository;

import com.xworkz.woman.complaint.dto.ComplaintDto;

import java.util.List;

public interface ComplaintRepository {
    public boolean save(ComplaintDto complaintDto);
    public List<ComplaintDto> view();
}

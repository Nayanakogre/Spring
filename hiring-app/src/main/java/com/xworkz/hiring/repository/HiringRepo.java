package com.xworkz.hiring.repository;

import com.xworkz.hiring.dto.HiringDto;

public interface HiringRepo {
    boolean save(HiringDto hiringDto);
}

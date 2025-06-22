package com.xworkz.woman.complaint.dto;

import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class ComplaintDto {
    private int complaintId;
    private String name;
    private long phoneNo;
    private String issue;
    private String issueType;
    private Timestamp dateTime;
    private String location;

}

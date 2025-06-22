package com.xworkz.seed.dto;

import lombok.*;

import java.beans.ConstructorProperties;
import java.time.LocalDateTime;
@Setter
@Getter

@NoArgsConstructor
@ToString

public class SeedInfoDto {




    private int id;
    private String seedName;
    private String type;
    private String variety;
    private double quantity;
    private double price;
    private String createdBy="System";
    private LocalDateTime createdAt=LocalDateTime.now();
    @ConstructorProperties({"id","seedName","type","variety","quantity","price","createdBy","createdAt"})

    public SeedInfoDto(int id, String seedName, String type, String variety, double quantity, double price, String createdBy, LocalDateTime createdAt) {
        this.id = id;
        this.seedName = seedName;
        this.type = type;
        this.variety = variety;
        this.quantity = quantity;
        this.price = price;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
    }

}

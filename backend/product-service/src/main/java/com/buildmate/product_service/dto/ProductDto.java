package com.buildmate.product_service.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
/*@Builder*/
@Entity
public class ProductDto {
    private Long id;
    private String name;
    private String description;
    private String category;
    private String imageUrl;
    private BigDecimal price;
    private int stockQuantity;
}


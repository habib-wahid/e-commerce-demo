package org.example.ecommerce.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_description", length = 5000)
    private String productDescription;
    @Column(name = "product_price")
    private Double productPrice;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
}

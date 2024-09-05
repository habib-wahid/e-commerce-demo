package org.example.ecommerce.dto;

public interface TopSellItemsDto {
    Long getId();
    String getProductName();
    String getProductDescription();
    Double getProductPrice();
    Double getTotalSellAmount();
}

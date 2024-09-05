package org.example.ecommerce.controller;

import lombok.RequiredArgsConstructor;
import org.example.ecommerce.dto.SaleAmountDto;
import org.example.ecommerce.service.SaleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class SaleController {

    private final SaleService saleService;

    @GetMapping("/total-sale-amount-of-current-date")
    public ResponseEntity<SaleAmountDto> getTotalSaleAmount() {
        return new ResponseEntity<>(saleService.getTotalSales(), HttpStatus.OK);
    }

}

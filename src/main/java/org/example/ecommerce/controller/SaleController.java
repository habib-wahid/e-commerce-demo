package org.example.ecommerce.controller;

import lombok.RequiredArgsConstructor;
import org.example.ecommerce.dto.MaxSaleDateDto;
import org.example.ecommerce.dto.SaleAmountDto;
import org.example.ecommerce.dto.TopSellItemsDto;
import org.example.ecommerce.service.SaleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class SaleController {

    private final SaleService saleService;

    @GetMapping("/total-sale-amount-of-current-date")
    public ResponseEntity<SaleAmountDto> getTotalSaleAmount() {
        return new ResponseEntity<>(saleService.getTotalSales(), HttpStatus.OK);
    }

    @GetMapping("/max-sale-date-in-between")
    public ResponseEntity<MaxSaleDateDto> getMaxSaleDate(
            @RequestParam(name = "startDate") LocalDate startDate,
            @RequestParam(name = "endDate") LocalDate endDate) {
         return new ResponseEntity<>(saleService.getMaxSaleDate(startDate, endDate), HttpStatus.OK);
    }
    @GetMapping("/top-items-on-amount")
    public ResponseEntity<List<TopSellItemsDto>> getTopSellItemsOnAmount() {
        return new ResponseEntity<>(saleService.getTopSellItemsOnAmount(), HttpStatus.OK);
    }
}

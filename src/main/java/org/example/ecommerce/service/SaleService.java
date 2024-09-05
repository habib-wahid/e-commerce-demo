package org.example.ecommerce.service;

import lombok.RequiredArgsConstructor;
import org.example.ecommerce.dto.MaxSaleDateDto;
import org.example.ecommerce.dto.SaleAmountDto;
import org.example.ecommerce.repository.SaleRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class SaleService {
    private final SaleRepository saleRepository;

    public SaleAmountDto getTotalSales() {
        LocalDate currentDate = LocalDate.now();
        return saleRepository.getTotalSaleAmountOfCurrentDay(currentDate);
    }

    public MaxSaleDateDto getMaxSaleDate(LocalDate startDate, LocalDate endDate) {
        return saleRepository.getMaxSaleDateBetween(startDate, endDate);
    }
}

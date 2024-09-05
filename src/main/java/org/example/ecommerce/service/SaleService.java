package org.example.ecommerce.service;

import lombok.RequiredArgsConstructor;
import org.example.ecommerce.dto.MaxSaleDateDto;
import org.example.ecommerce.dto.SaleAmountDto;
import org.example.ecommerce.dto.TopSellItemsDto;
import org.example.ecommerce.repository.SaleRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

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

    public List<TopSellItemsDto> getTopSellItemsOnAmount() {
        return saleRepository.getTopSellItemsBasedOnSaleAmount();
    }

    public List<TopSellItemsDto> getTopSellingItemsInLastMonth() {
        LocalDateTime startDate = LocalDateTime.now().minusMonths(1).withDayOfMonth(1);
        LocalDateTime endDate = LocalDateTime.now().withDayOfMonth(1);
        return saleRepository.findTopSellingItemsLastMonth(startDate, endDate);
    }
}

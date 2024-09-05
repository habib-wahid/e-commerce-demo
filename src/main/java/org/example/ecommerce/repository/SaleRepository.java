package org.example.ecommerce.repository;

import org.example.ecommerce.dto.SaleAmountDto;
import org.example.ecommerce.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query(value = "select sum(sale.price) as totalSaleAmount from sale where DATE(sale.sale_date) = :currentDate", nativeQuery = true)
    SaleAmountDto getTotalSaleAmountOfCurrentDay(@Param("currentDate") LocalDate currentDate);
}

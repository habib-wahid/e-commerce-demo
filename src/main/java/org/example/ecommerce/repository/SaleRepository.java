package org.example.ecommerce.repository;

import org.example.ecommerce.dto.MaxSaleDateDto;
import org.example.ecommerce.dto.SaleAmountDto;
import org.example.ecommerce.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.time.LocalDate;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query(value = "select sum(sale.total_price) as totalSaleAmount from sale where DATE(sale.sale_date) = :currentDate", nativeQuery = true)
    SaleAmountDto getTotalSaleAmountOfCurrentDay(@Param("currentDate") LocalDate currentDate);

    @Query(value = "select DATE(sale.sale_date) as maxSaleDate, sum(total_price) as price from sale\n" +
            "    where DATE(sale_date) between :startDate and :endDate \n" +
            "    group by DATE(sale_date) order by price desc limit 1", nativeQuery = true)
    MaxSaleDateDto getMaxSaleDateBetween(@Param("startDate") LocalDate startDate,@Param("endDate") LocalDate endDate);
}

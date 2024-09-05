package org.example.ecommerce.repository;

import org.example.ecommerce.dto.MaxSaleDateDto;
import org.example.ecommerce.dto.SaleAmountDto;
import org.example.ecommerce.dto.TopSellItemsDto;
import org.example.ecommerce.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.awt.print.Pageable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query(value = "select sum(sale.total_price) as totalSaleAmount from sale where DATE(sale.sale_date) = :currentDate", nativeQuery = true)
    SaleAmountDto getTotalSaleAmountOfCurrentDay(@Param("currentDate") LocalDate currentDate);

    @Query(value = "select DATE(sale.sale_date) as maxSaleDate, sum(total_price) as price from sale\n" +
            "    where DATE(sale_date) between :startDate and :endDate \n" +
            "    group by DATE(sale_date) order by price desc limit 1", nativeQuery = true)
    MaxSaleDateDto getMaxSaleDateBetween(@Param("startDate") LocalDate startDate,@Param("endDate") LocalDate endDate);

    @Query(value = "select product.id as id, product.product_name as productName, product.product_description as productDescription, product.product_price as productPrice, " +
            "sum(sale.total_price) as totalSellAmount from sale inner join product \n" +
            "on sale.product_id = product.id group by sale.product_id order by totalSellAmount desc limit 5", nativeQuery = true)
    List<TopSellItemsDto> getTopSellItemsBasedOnSaleAmount();

    @Query(value = "select product.id as id, product.product_name as productName, product.product_description as productDescription, " +
            "product.product_price as productPrice, sum(sale.quantity) as totalSellQuantity\n" +
            " from sale inner join product\n" +
            " on sale.product_id = product.id and sale_date >= DATE(:startDate) and sale_date < DATE(:endDate) \n" +
            " group by sale.product_id order by totalSellQuantity desc limit 5", nativeQuery = true)
    List<TopSellItemsDto> findTopSellingItemsLastMonth(@Param("startDate") LocalDateTime startDate, @Param("endDate") LocalDateTime endDate);
}

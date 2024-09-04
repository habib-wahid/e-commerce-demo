package org.example.ecommerce.repository;

import org.example.ecommerce.dto.WishListDto;
import org.example.ecommerce.entity.WishList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface WishListRepository extends JpaRepository<WishList, Long> {

    @Query(
            value = "select wi.id as id, p.product_name as productName, p.product_description as productDescription, " +
                    "p.product_price as productPrice from wish_item wi inner join wishlist wl \n" +
                    "on wi.wish_list_id = wl.id inner join product p on p.id = wi.product_id "+
                    "and wl.customer_id = :customerId", nativeQuery = true)
    List<WishListDto> getWishList(@Param("customerId") Long customerId);
}

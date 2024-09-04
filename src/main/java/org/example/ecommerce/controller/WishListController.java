package org.example.ecommerce.controller;

import lombok.RequiredArgsConstructor;
import org.example.ecommerce.dto.WishListDto;
import org.example.ecommerce.service.WishListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class WishListController {
    private final WishListService wishListService;

    @GetMapping("/wish-list/{customerId}")
    public List<WishListDto> getWishList(@PathVariable Long customerId) {
        return wishListService.getWishList(customerId);
    }
}

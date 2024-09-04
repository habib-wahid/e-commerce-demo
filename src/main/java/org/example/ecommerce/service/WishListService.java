package org.example.ecommerce.service;

import lombok.RequiredArgsConstructor;
import org.example.ecommerce.dto.WishListDto;
import org.example.ecommerce.repository.WishListRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WishListService {

    private final WishListRepository wishListRepository;

    public List<WishListDto> getWishList(Long customerId) {
        return wishListRepository.getWishList(customerId);
    }
}

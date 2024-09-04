package org.example.ecommerce.repository;

import org.example.ecommerce.entity.WishItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishItemRepository extends JpaRepository<WishItem, Long> {
}

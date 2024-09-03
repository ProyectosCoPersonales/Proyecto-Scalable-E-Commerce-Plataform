package com.shop.jordancode.Repositories.Shop;



import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.jordancode.Entities.Shop.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem,Long>{

}

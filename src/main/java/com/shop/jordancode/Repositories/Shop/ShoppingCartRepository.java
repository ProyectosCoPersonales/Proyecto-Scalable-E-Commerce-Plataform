package com.shop.jordancode.Repositories.Shop;



import org.springframework.data.jpa.repository.JpaRepository;
import com.shop.jordancode.Entities.Shop.ShoppingCart;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long>{

}

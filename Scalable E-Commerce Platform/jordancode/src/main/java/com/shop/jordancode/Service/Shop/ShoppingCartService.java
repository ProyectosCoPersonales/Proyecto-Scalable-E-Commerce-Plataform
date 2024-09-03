package com.shop.jordancode.Service.Shop;
import org.springframework.stereotype.Service;

import com.shop.jordancode.Entities.Shop.ShoppingCart;
import com.shop.jordancode.Repositories.Shop.ShoppingCartRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ShoppingCartService {

    private final ShoppingCartRepository shoppingCartRepository;

    public ShoppingCartService(ShoppingCartRepository shoppingCartRepository) {
        this.shoppingCartRepository = shoppingCartRepository;
    }

    public List<ShoppingCart> getAllShoppingCarts() {
        return shoppingCartRepository.findAll();
    }

    public Optional<ShoppingCart> getShoppingCartById(Long id) {
        return shoppingCartRepository.findById(id);
    }

    public ShoppingCart saveShoppingCart(ShoppingCart shoppingCart) {
        return shoppingCartRepository.save(shoppingCart);
    }
}


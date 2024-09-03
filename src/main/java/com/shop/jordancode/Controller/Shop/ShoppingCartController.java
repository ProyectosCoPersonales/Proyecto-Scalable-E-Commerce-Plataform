package com.shop.jordancode.Controller.Shop;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.shop.jordancode.Entities.Shop.ShoppingCart;
import com.shop.jordancode.Service.Shop.ShoppingCartService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/admin/shopping-carts")
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping
    public ResponseEntity<List<ShoppingCart>> getAllShoppingCarts() {
        return ResponseEntity.ok(shoppingCartService.getAllShoppingCarts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ShoppingCart> getShoppingCartById(@PathVariable Long id) {
        Optional<ShoppingCart> shoppingCart = shoppingCartService.getShoppingCartById(id);
        return shoppingCart.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ShoppingCart> createShoppingCart(@RequestBody ShoppingCart shoppingCart) {
        ShoppingCart createdShoppingCart = shoppingCartService.saveShoppingCart(shoppingCart);
        return ResponseEntity.ok(createdShoppingCart);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ShoppingCart> updateShoppingCart(@PathVariable Long id, @RequestBody ShoppingCart shoppingCart) {
        Optional<ShoppingCart> existingShoppingCart = shoppingCartService.getShoppingCartById(id);
        if (existingShoppingCart.isPresent()) {
            shoppingCart.setId(id);
            ShoppingCart updatedShoppingCart = shoppingCartService.saveShoppingCart(shoppingCart);
            return ResponseEntity.ok(updatedShoppingCart);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}


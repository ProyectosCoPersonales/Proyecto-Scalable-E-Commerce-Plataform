package com.shop.jordancode.Controller.Shop;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.jordancode.Entities.Shop.CartItem;
import com.shop.jordancode.Service.Shop.CartItemService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/admin/cart-items")
public class CartItemController {

    private final CartItemService cartItemService;

    public CartItemController(CartItemService cartItemService) {
        this.cartItemService = cartItemService;
    }

    @GetMapping
    public ResponseEntity<List<CartItem>> getAllCartItems() {
        return ResponseEntity.ok(cartItemService.getAllCartItems());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CartItem> getCartItemById(@PathVariable Long id) {
        Optional<CartItem> cartItem = cartItemService.getCartItemById(id);
        return cartItem.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<CartItem> createCartItem(@RequestBody CartItem cartItem) {
        CartItem createdCartItem = cartItemService.saveCartItem(cartItem);
        return ResponseEntity.ok(createdCartItem);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CartItem> updateCartItem(@PathVariable Long id, @RequestBody CartItem cartItem) {
        Optional<CartItem> existingCartItem = cartItemService.getCartItemById(id);
        if (existingCartItem.isPresent()) {
            cartItem.setId(id);
            CartItem updatedCartItem = cartItemService.saveCartItem(cartItem);
            return ResponseEntity.ok(updatedCartItem);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}

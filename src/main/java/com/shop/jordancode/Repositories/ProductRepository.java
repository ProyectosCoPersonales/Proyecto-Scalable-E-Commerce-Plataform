package com.shop.jordancode.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shop.jordancode.Entities.Product.Product;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}


package com.foodsquad.repositoty;

import com.foodsquad.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {


}

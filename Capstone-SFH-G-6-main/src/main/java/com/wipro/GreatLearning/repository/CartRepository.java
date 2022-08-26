package com.wipro.GreatLearning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.GreatLearning.entity.Cart;

public interface CartRepository extends JpaRepository<Cart,Long> {

	List<Cart> findAllByUserId(long id);
}

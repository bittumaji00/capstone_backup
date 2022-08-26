package com.wipro.GreatLearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.GreatLearning.entity.Wishlist;

public interface WishlistRepository extends JpaRepository<Wishlist, Long> {

}

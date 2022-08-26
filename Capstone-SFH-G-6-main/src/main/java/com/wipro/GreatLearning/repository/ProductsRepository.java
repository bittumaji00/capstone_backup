package com.wipro.GreatLearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.GreatLearning.entity.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {

}

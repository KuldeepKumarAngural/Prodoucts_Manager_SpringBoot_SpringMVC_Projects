package com.spring.Repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Products;

public interface ProductRepository extends JpaRepository<Products, Long> {

}

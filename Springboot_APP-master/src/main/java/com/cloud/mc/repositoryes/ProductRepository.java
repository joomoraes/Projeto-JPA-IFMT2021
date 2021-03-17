package com.cloud.mc.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cloud.mc.entites.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}

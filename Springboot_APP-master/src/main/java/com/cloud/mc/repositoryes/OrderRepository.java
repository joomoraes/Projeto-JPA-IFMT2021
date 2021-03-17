package com.cloud.mc.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cloud.mc.entites.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}

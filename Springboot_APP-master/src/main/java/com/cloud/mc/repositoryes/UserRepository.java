package com.cloud.mc.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cloud.mc.entites.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

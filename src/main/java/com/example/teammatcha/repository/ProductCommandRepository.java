package com.example.teammatcha.repository;

import com.example.teammatcha.beans.ProductCommandBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCommandRepository extends JpaRepository<ProductCommandBean, Integer> {
}


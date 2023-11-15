package com.example.teammatcha.repository;

import com.example.teammatcha.beans.ProductBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductBean, Integer> {
    boolean existsByNomProduit(String nomProduit);
}


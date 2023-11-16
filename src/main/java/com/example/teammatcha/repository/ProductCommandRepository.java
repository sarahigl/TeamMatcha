package com.example.teammatcha.repository;

import com.example.teammatcha.beans.MergedCommandBean;
import com.example.teammatcha.beans.ProductCommandBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductCommandRepository extends JpaRepository<ProductCommandBean, Integer> {
    @Query("SELECT DISTINCT NEW com.example.teammatcha.beans.MergedCommandBean(c, p, pc) " +
            "FROM CommandBean c " +
            "JOIN ProductCommandBean pc ON c.id_commande = pc.id_commande " +
            "JOIN ProductBean p ON pc.id_produit = p.id_produit")
    List<MergedCommandBean> getAllMergedData();

}


package com.example.teammatcha.services;

import com.example.teammatcha.beans.ProductBean;
import com.example.teammatcha.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRep;
    public List<ProductBean> getAll() {
        return productRep.findAll();
    }

}

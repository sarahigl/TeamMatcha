package com.example.teammatcha.services;

import com.example.teammatcha.beans.CommandBean;
import com.example.teammatcha.beans.ProductBean;
import com.example.teammatcha.repository.CommandRepository;
import com.example.teammatcha.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCommandService {
    @Autowired
    private ProductRepository productRep;
    @Autowired
    private CommandRepository commandRep;
    public List<CommandBean> getAllCommand() {
        return commandRep.findAll();
    }
    public List<ProductBean> getAllProduct() {
        return productRep.findAll();
    }

}

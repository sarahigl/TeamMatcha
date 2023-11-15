package com.example.teammatcha.services;

import com.example.teammatcha.beans.CommandBean;
import com.example.teammatcha.repository.CommandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandService {
    @Autowired
    private CommandRepository commandRep;
    public List<CommandBean> getAll() {
        return commandRep.findAll();
    }

}

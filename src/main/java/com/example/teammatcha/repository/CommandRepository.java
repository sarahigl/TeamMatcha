package com.example.teammatcha.repository;

import com.example.teammatcha.beans.CommandBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandRepository extends JpaRepository<CommandBean, Integer> {
}


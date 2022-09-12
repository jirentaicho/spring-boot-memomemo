package com.example.zanzan.sample;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StockJpa extends JpaRepository<Stock,Integer> {
}

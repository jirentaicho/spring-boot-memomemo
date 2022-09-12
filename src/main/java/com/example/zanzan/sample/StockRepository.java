package com.example.zanzan.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class StockRepository {

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private StockJpa stockJpa;
    public List<Stock> findAll(){
        return this.stockJpa.findAll();
    }
    public Stock findById(int id){
        return stockJpa.findById(id).orElseThrow();
    }

    public Stock findByName(String name){
        Stock stock = entityManager
                .createQuery("from Stock where name = :name",Stock.class)
                .setParameter("name",name)
                .getSingleResult();
        return stock;
    }
}

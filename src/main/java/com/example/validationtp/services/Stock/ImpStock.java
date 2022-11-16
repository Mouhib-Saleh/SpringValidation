package com.example.validationtp.services.Stock;

import com.example.validationtp.entity.Stock;
import com.example.validationtp.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ImpStock implements StockInterface {

    @Autowired
    StockRepository repo;
    @Override
    public List<Stock> showAll() {
        return repo.findAll();
    }

    @Override
    public void DeleteStock(Long id) {
         repo.deleteById(id);

    }

    @Override
    public void updateStock(Stock s) {
     repo.save(s);
    }

    @Override
    public Stock addStock(Stock s) {
        return repo.save(s);

    }

    @Override
    public Stock retrievebyId(Long id) {
     return repo.findById(id).get();
    }
}

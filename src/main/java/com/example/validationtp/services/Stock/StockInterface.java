package com.example.validationtp.services.Stock;

import com.example.validationtp.entity.Stock;
import com.example.validationtp.repository.StockRepository;

import java.util.List;

public interface StockInterface  {


    public List<Stock> showAll();
    public void DeleteStock (Long id) ;
    public void updateStock (Stock s) ;
    public Stock addStock (Stock s) ;
    public Stock retrievebyId(Long id);




}

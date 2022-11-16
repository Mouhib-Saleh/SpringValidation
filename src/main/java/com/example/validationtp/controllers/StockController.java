package com.example.validationtp.controllers;
import com.example.validationtp.entity.Produit;
import com.example.validationtp.entity.Stock;
import com.example.validationtp.services.Stock.ImpStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "/stock")
public class StockController {
    @Autowired
    private ImpStock stockService;
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Stock save(@RequestBody Stock con) throws Exception {
        Stock StockResponse = (Stock) stockService.addStock(con);
        return StockResponse;
    }
}

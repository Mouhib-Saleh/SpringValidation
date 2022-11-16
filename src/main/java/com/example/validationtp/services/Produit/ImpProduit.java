package com.example.validationtp.services.Produit;

import com.example.validationtp.Generic.GenericRepository;
import com.example.validationtp.Generic.ImplementationGeneric;
import com.example.validationtp.entity.Produit;
import com.example.validationtp.entity.Stock;
import com.example.validationtp.repository.ProduitRepo;
import com.example.validationtp.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpProduit extends ImplementationGeneric<Produit,Long> implements ProduitInt{
    @Autowired
    ProduitRepo repo;
    @Autowired
    StockRepository repoS;

    @Override
    public void assignProduitToStock(Long idProduct, Long idStock) {
        /*recuperation des objet*/
        Produit prod = repo.findById(idProduct).orElse(null);
        Stock stock = repoS.findById(idStock).orElse(null);
        if (prod!=null && stock!=null){
            prod.setStock(stock);
            repo.save(prod);
        }
        else{
            System.out.println("NULL FOUND");
        }
    }
}

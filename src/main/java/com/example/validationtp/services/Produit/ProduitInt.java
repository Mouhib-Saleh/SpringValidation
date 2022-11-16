package com.example.validationtp.services.Produit;

import com.example.validationtp.Generic.InterfaceGeneric;
import com.example.validationtp.entity.Produit;

import java.util.Date;
import java.util.List;

public interface ProduitInt  extends InterfaceGeneric<Produit,Long> {
    void assignProduitToStock(Long idProduct, Long idStock);
}

package com.example.validationtp.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.validationtp.entity.Produit;
import com.example.validationtp.services.Produit.ImpProduit;

import java.util.List;
@RestController
@RequestMapping(value = "/produit")
public class ProduitController {
    @Autowired
    private ImpProduit produitService;
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Produit save(@RequestBody Produit con) throws Exception {
        Produit ProduitResponse = (Produit) produitService.save(con);
        return ProduitResponse;
    }
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Produit> findAll() {
        try {
            return produitService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteContrat(@PathVariable Long id) {
        try {
            produitService.delete(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return "Produit supprimé";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT)
    public String UpdateContrat(@RequestBody Produit e,@PathVariable Long id) {
        try {
            Produit updateProduit= produitService.retrieve(id);
            if (updateProduit==null){
                return "Produit not found with id :";
            }
            updateProduit.setDateCreation(e.getDateCreation());
            updateProduit.setCodeProduit(e.getCodeProduit());
            updateProduit.setLibelleProduit(e.getLibelleProduit());
            produitService.update(updateProduit);

        } catch (Exception err) {
            throw new RuntimeException(err);
        }
        return "Produit modifié ";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Produit getContrat(@PathVariable Long id) throws Exception {
        Produit ContratResponse = (Produit) produitService.retrieve(id);
        return ContratResponse;
    }
    @RequestMapping(value = "/assignProd/{idP}/{idS}", method = RequestMethod.PUT)
    @ResponseBody
    public String AssignPrd(@PathVariable Long idP,@PathVariable Long idS) {
        try {
            produitService.assignProduitToStock(idP,idS);
        } catch (Exception err) {
            throw new RuntimeException(err);
        }
        return "ADDED Product AND ASSIGNED TO Stock";
    }

}

package com.example.validationtp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prix;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Temporal(TemporalType.DATE)
    private Date dateDerniereModification;
    @OneToMany(mappedBy = "produit")
    @JsonIgnore
    private Set<DetailFacture> DetailFacture;

    @ManyToOne(cascade =CascadeType.PERSIST)
    @JsonIgnore
    private Stock stock;

    @ManyToOne(cascade =CascadeType.PERSIST)
    @JsonIgnore
    private CategorieProduit categorieProduit;


}

package com.example.validationtp.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idStock;
    public int qte;
    public int qteMin;
    public String libelleStock;
    @OneToMany(mappedBy = "stock")
    @JsonIgnore
    private Set<Produit> Produit;
}

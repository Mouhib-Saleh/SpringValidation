package com.example.validationtp.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Facture
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idFacture;
    public float montantRemise;
    public float montantFacture;
    @Temporal(TemporalType.DATE)
    public Date dateCreationFacture ;
    @Temporal(TemporalType.DATE)
    public Date dateDerniereModification;
    public boolean archivee;

    @OneToMany(mappedBy = "facture")
    @JsonIgnore
    private Set<DetailFacture> DetailFacture;

    @OneToMany(mappedBy = "facture")
    @JsonIgnore
    private Set<Reglement> Reglement;

    @ManyToOne(cascade =CascadeType.PERSIST)
    @JsonIgnore
    private Fournisseur fournisseur;
}

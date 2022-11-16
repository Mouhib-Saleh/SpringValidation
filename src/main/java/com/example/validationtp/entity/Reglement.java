package com.example.validationtp.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reglement
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idReglement;
    public float montantPaye;
    public float MontatRestant;
    public boolean payee;
    @Temporal(TemporalType.DATE)
    public Date Date;

    @ManyToOne(cascade =CascadeType.PERSIST)
    @JsonIgnore
    private Facture facture;
}

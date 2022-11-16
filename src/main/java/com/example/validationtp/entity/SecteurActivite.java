package com.example.validationtp.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Set;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SecteurActivite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idSecteurActivite;
    public String codeSecteurActivite;
    public String libelleSecteurActivite;
    @ManyToMany
    private Set<Fournisseur> fournisseur;
}

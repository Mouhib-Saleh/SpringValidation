package com.example.validationtp.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DetailFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFacture;
    @ManyToOne(cascade =CascadeType.PERSIST)
    @JsonIgnore
    private Produit produit;
    @ManyToOne(cascade =CascadeType.PERSIST)
    @JsonIgnore
    private Facture facture;

    public int qteCommandee;
    public float prixTotalDetail;
    public int pourcentageRemise;
    public float montantRemise;

}

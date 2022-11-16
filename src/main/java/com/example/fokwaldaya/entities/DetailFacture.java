package com.example.fokwaldaya.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFacture;
    private int qteCommande;
    private float prixTotalDetail;
    private int pourcentageRemise;
    private float montantRemise;
    @ManyToOne
    private Produit produitD;
    @ManyToOne
    private facture facture;
}

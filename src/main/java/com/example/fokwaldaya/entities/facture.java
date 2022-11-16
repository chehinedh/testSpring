package com.example.fokwaldaya.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFacture;
    private float montantRemise;
    private boolean archive;
    @Temporal(TemporalType.DATE)
    private Date dateCreationFacture;
    @Temporal(TemporalType.DATE)
    private Date dateDerniereModification;
    @OneToMany(mappedBy = "facture")
    private Set<DetailFacture> detailFactures;
    @OneToMany(mappedBy = "factureR")
    private Set<Reglement> reglements;
    @ManyToOne
    private Fournisseur fournisseur;
}

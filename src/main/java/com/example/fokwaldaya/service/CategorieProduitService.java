package com.example.fokwaldaya.service;

import com.example.fokwaldaya.entities.CategorieProduit;

import java.util.List;

public interface CategorieProduitService {
    public List<CategorieProduit> retrieveAllCategorieProduits();

    public CategorieProduit addCategorieProduit(CategorieProduit cp);

    public CategorieProduit updateCategorieProduit(CategorieProduit cp);

    public CategorieProduit retrieveCategorieProduit(Long id);

    public void removeCategorieProduit(Long id);
}

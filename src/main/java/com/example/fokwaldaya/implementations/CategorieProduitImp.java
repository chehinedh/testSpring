package com.example.fokwaldaya.implementations;

import com.example.fokwaldaya.entities.CategorieProduit;
import com.example.fokwaldaya.repositories.CategorieProduitRepo;
import com.example.fokwaldaya.service.CategorieProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieProduitImp implements CategorieProduitService {

    @Autowired
    CategorieProduitRepo categorieProduitRepo;
    @Override
    public List<CategorieProduit> retrieveAllCategorieProduits() {
        return categorieProduitRepo.findAll();
    }

    @Override
    public CategorieProduit addCategorieProduit(CategorieProduit cp) {
        return categorieProduitRepo.save(cp);
    }

    @Override
    public CategorieProduit updateCategorieProduit(CategorieProduit cp) {
        return categorieProduitRepo.save(cp);
    }

    @Override
    public CategorieProduit retrieveCategorieProduit(Long id) {
        return categorieProduitRepo.findById(id).orElse(null);
    }

    @Override
    public void removeCategorieProduit(Long id) {
        if (categorieProduitRepo.findById(id).isPresent())
            categorieProduitRepo.deleteById(id);
    }
}

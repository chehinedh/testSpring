package com.example.fokwaldaya.controllers;


import com.example.fokwaldaya.entities.CategorieProduit;
import com.example.fokwaldaya.service.CategorieProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/cp")
@RestController
public class CategorieProduitController {
    @Autowired
    CategorieProduitService categorieProduitService;

    @PostMapping("/addCP")
    public CategorieProduit add(@RequestBody CategorieProduit cp){
        return categorieProduitService.addCategorieProduit(cp);
    }

    @GetMapping("/getCP")
    public List<CategorieProduit> retrieveAll(){
        return categorieProduitService.retrieveAllCategorieProduits();
    }

    @GetMapping("/retrievebyidCP/{id}")
    public CategorieProduit retrieveById(@PathVariable(value="id") Long idContratProduit){
        return categorieProduitService.retrieveCategorieProduit(idContratProduit);
    }

    @PutMapping("/updateCP")
    public CategorieProduit updateContrat(@RequestBody CategorieProduit cp){
        return categorieProduitService.updateCategorieProduit(cp);
    }

    @DeleteMapping("/deleteCP/{id}")
    public void removeCategorieProduit(@PathVariable(value = "id") Long id){
        categorieProduitService.removeCategorieProduit(id);
    }
}

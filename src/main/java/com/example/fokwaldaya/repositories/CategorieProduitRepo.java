package com.example.fokwaldaya.repositories;

import com.example.fokwaldaya.entities.CategorieProduit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieProduitRepo extends JpaRepository<CategorieProduit,Long>{
}

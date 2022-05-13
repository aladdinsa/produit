package com.aladdin.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aladdin.produits.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}

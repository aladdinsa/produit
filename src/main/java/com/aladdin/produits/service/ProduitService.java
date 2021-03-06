package com.aladdin.produits.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.aladdin.produits.entities.Categorie;
import com.aladdin.produits.entities.Produit;

public interface ProduitService {
	
	 Produit saveProduit(Produit p);
	 Produit updateProduit(Produit p);
	 void deleteProduit(Produit p);
	 void deleteProduitById(Long id);
	 Produit getProduit(Long id);
	 List<Produit> getAllProduits();
	 
	 List<Categorie> getAllCategories();
	 
	 List<Produit> findByNomProduit(String nom);
	 List<Produit> findByNomProduitLike(String nom);
	 List<Produit> findByNomPrix (String nom, Double prix);
	 List<Produit> findByCategorie (Categorie categorie);
	 List<Produit> findByCategorieIdCat(Long id);
	 List<Produit> findByOrderByNomProduitAsc();
	 List<Produit> trierProduitsNomsPrix ();
	 
	 Page<Produit> getAllProduitsParPage(int page, int size);
}

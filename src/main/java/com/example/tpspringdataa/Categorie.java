package com.example.tpspringdataa;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Categorie {

    @Id @GeneratedValue
    private Long idCat;
    @Column(length = 30)
    private String nameCat;
    @OneToMany(mappedBy = "categorie",fetch = FetchType.LAZY)
    private Collection<Produit>produits;

    public Categorie() {
    }

    public Categorie(String nameCat ) {
        this.nameCat = nameCat;
        this.produits = produits;
    }

    public Long getIdCat() {
        return idCat;
    }

    public void setIdCat(Long idCat) {
        this.idCat = idCat;
    }

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

    public Collection<Produit> getProduits() {
        return produits;
    }

    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
    }
}

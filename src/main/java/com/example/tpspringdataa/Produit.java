package com.example.tpspringdataa;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Produit implements Serializable {
    @Id @GeneratedValue
    private Long id;
    @Column(length = 50)
    private String designation;
    private Double prix;
    private Integer quantite;

    @JoinColumn(name ="id_cat")
    @ManyToOne
    private Categorie categorie;

    public Produit() {
    }

    public Produit( String designation, Double prix, Integer quantite, Categorie categorie) {
        this.designation = designation;
        this.prix = prix;
        this.quantite = quantite;
        this.categorie = categorie;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }
}

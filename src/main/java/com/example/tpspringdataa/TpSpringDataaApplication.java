package com.example.tpspringdataa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class TpSpringDataaApplication {

    public static void main(String[] args) {

       ApplicationContext context= SpringApplication.run(TpSpringDataaApplication.class, args);
       CategorieRepository categorieRepository=context.getBean(CategorieRepository.class);
       ProduitRepository produitRepository=context.getBean(ProduitRepository.class);

        Categorie c1= categorieRepository.save(new Categorie("Ordinateurs"));
        Categorie c2= categorieRepository.save(new Categorie("Haut Parleurs"));
        Categorie c3= categorieRepository.save(new Categorie("Logiciel"));

        produitRepository.save(new Produit("ord1",200.0,12,c1));
        produitRepository.save(new Produit("ord2",100.0,42,c1));
        produitRepository.save(new Produit("HP",500.0,8,c2));



   }

}

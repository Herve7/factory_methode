/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstract_factory_exercice;

/**
 *
 * @author patrick
 */
public class Abstract_factory_exercice {

    public static void main(String[] args) {
        ProduitFactory1 produitFactory1 = new ProduitFactory1();
        ProduitFactory2 produitFactory2 = new ProduitFactory2();
        ProduitFactory3 produitFactory3 = new ProduitFactory3();
        
        ProduitA produitA = null;
        ProduitB produitB = null;
        
        System.out.println("Utilisation de la premiere fabrique");
        produitA = produitFactory1.getProduitA();
        produitB = produitFactory1.getProduitB();
        produitA.methodeA();
        produitB.methodeB();

        System.out.println("Utilisation de la seconde fabrique");
        produitA = produitFactory2.getProduitA();
        produitB = produitFactory2.getProduitB();
        produitA.methodeA();
        produitB.methodeB();
        
        System.out.println("Utilisation de la troisieme fabrique");
        produitA = produitFactory3.getProduitA();
        produitB = produitFactory3.getProduitB();
        produitA.methodeA();
        produitB.methodeB();
    }
}

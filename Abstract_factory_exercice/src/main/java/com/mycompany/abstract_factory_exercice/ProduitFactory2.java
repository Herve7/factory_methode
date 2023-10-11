/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstract_factory_exercice;

/**
 *
 * @author patrick
 */
public class ProduitFactory2 implements IProduitFactory{

    @Override
    public ProduitA getProduitA() {
        
        return new ProduitA2();
    }

    @Override
    public ProduitB getProduitB() {
       
        return new ProduitB2();
    }
    
}

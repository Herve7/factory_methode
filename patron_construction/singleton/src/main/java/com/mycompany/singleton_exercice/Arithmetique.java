/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton_exercice;

/**
 *
 * @author patrick
 */
public final class Arithmetique {
    
    private static Arithmetique instance = null;
    
    private int x;
    private int y;
    private String nom = "";
    
    private Arithmetique(){
    
        super();
    }
    
    private Arithmetique(int x,int y){
    
        this.x = x;
        this.y = y;
    }
    
    private Arithmetique(String nom){
        
       this.nom = nom;
    }
    
    public static Arithmetique getInstance(){
    
        if(instance == null){
            instance = new Arithmetique();
        }
        
        return instance;
    }
    
    
    public static Arithmetique getInstance(int x, int y){
        if (instance == null)
            {
                instance = new Arithmetique(x, y);
            }
        return instance;
        }
    
    
    public static Arithmetique getInstance(String nom){
        if (instance == null)
            {
                instance = new Arithmetique(nom);
            }
        return instance;
        }
    
    
    public int somme(int x, int y){
    
        return x+y;
    }
    
    public float moyenne(int x,int y){
    
        return somme(x,y)/2;
    }
    
    public int soustraction(int x, int y){
    
    return x-y;
    }
    
    public int multiplication(int x,int y){
    
        return x*y;
    }
    
    
    
    public void affiche(){
        System.out.println("\nJe suis une instance mes valeurs sont : x = " + this.x + " et y = " + this.y);
    }
    
    public void affiche1(){
        System.out.println("\nJe suis une instance mon nom est :  " + this.nom);
    }
    
    @Override
public Object clone() throws CloneNotSupportedException {
    
    throw new CloneNotSupportedException();
}


}

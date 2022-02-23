/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.staticvalues;

/**
 *
 * @author khali
 */
public class UserStatic {
    static int id=0;
    String nom,prenom;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        UserStatic.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public UserStatic() {
        //this.id; incorrecte
        id++;
    }

    public UserStatic(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        id++;
    }
    
    
    
    
    
}

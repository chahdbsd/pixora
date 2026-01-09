package com.pixora.domain.entities;

public class Utilisateur {

    private Long id;
    private String email;
    private String nom;

    public Utilisateur(Long id, String email, String nom) {
        this.id = id;
        this.email = email;
        this.nom = nom;
    }

    public Utilisateur(String email, String nom) {
        this(null, email, nom);
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getNom() {
        return nom;
    }
}

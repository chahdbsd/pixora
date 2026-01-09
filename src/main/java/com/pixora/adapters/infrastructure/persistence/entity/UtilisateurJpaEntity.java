package com.pixora.adapters.infrastructure.persistence.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "utilisateurs")
public class UtilisateurJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String nom;

    public Long getId() { return id; }
    public String getEmail() { return email; }
    public String getNom() { return nom; }

    public void setId(Long id) { this.id = id; }
    public void setEmail(String email) { this.email = email; }
    public void setNom(String nom) { this.nom = nom; }
}

package com.pixora.domain.entities;

import java.util.Objects;
import java.util.UUID;

public class Utilisateur {
    private final UUID id;
    private String email;
    private String username;
    private String passwordHash;

    public Utilisateur(UUID id, String email, String username, String passwordHash) {
        this.id = Objects.requireNonNull(id);
        this.email = Objects.requireNonNull(email);
        this.username = Objects.requireNonNull(username);
        this.passwordHash = Objects.requireNonNull(passwordHash);
    }

    public UUID getId() { return id; }
    public String getEmail() { return email; }
    public String getUsername() { return username; }
    public String getPasswordHash() { return passwordHash; }

    public void setEmail(String email) { this.email = Objects.requireNonNull(email); }
    public void setUsername(String username) { this.username = Objects.requireNonNull(username); }
    public void setPasswordHash(String passwordHash) { this.passwordHash = Objects.requireNonNull(passwordHash); }
}

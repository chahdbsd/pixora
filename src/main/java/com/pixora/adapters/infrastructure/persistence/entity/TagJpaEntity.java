package com.pixora.adapters.infrastructure.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tags")
public class TagJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String label;

    public Long getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}

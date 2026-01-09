package com.pixora.usecase.mapper;

import com.pixora.domain.entities.Utilisateur;
import com.pixora.usecase.dto.UtilisateurDTO;
import org.springframework.stereotype.Component;

@Component
public class UtilisateurUseCaseMapper {

    public UtilisateurDTO toDTO(Utilisateur u) {
        UtilisateurDTO dto = new UtilisateurDTO();
        dto.id = u.getId();
        dto.email = u.getEmail();
        dto.nom = u.getNom();
        return dto;
    }
}

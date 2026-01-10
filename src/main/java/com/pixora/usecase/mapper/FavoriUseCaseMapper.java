package com.pixora.usecase.mapper;

import com.pixora.domain.entities.Favori;
import com.pixora.usecase.dto.FavoriDTO;
import org.springframework.stereotype.Component;

@Component
public class FavoriUseCaseMapper {

    public FavoriDTO toDTO(Favori f) {
        FavoriDTO dto = new FavoriDTO();
        dto.id = f.getId();
        dto.userId = f.getUserId();
        dto.photoId = f.getPhotoId();
        dto.createdAt = f.getCreatedAt();
        return dto;
    }
}

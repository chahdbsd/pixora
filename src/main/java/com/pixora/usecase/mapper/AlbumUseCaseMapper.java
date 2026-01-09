package com.pixora.usecase.mapper;

import com.pixora.domain.entities.Album;
import com.pixora.usecase.dto.AlbumDTO;

public class AlbumUseCaseMapper {

    public AlbumDTO toDTO(Album album) {
        return new AlbumDTO(
                album.getId(),
                album.getOwnerUserId(),
                album.getTitre(),
                album.getCreatedAt()
        );
    }
}

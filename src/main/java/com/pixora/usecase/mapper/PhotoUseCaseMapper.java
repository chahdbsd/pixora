package com.pixora.usecase.mapper;

import com.pixora.domain.entities.Photo;
import com.pixora.usecase.dto.PhotoDTO;

public class PhotoUseCaseMapper {

    public PhotoDTO toDTO(Photo photo) {
        return new PhotoDTO(
                photo.getId(),
                photo.getAlbumId(),
                photo.getUploaderUserId(),
                photo.getUrl(),
                photo.getUploadedAt()
        );
    }
}

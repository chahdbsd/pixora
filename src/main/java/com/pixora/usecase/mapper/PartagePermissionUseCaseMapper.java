package com.pixora.usecase.mapper;

import com.pixora.domain.entities.PartagePermission;
import com.pixora.usecase.dto.PartagePermissionDTO;

public class PartagePermissionUseCaseMapper {

    public PartagePermissionDTO toDTO(PartagePermission p) {
        PartagePermissionDTO dto = new PartagePermissionDTO();
        dto.id = p.getId();
        dto.albumId = p.getAlbumId();
        dto.grantedToUserId = p.getGrantedToUserId();
        dto.permission = p.getPermission();
        return dto;
    }
}

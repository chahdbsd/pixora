package com.pixora.domain.service;

import com.pixora.domain.entities.PartagePermission;

public final class PartagePermissionValidator {
    private PartagePermissionValidator() {}

    public static void validateForCreate(PartagePermission p) {
        if (p == null) throw new IllegalArgumentException("Permission null");
        if (p.getAlbumId() == null || p.getAlbumId() <= 0)
            throw new IllegalArgumentException("albumId invalide");
        if (p.getGrantedToUserId() == null || p.getGrantedToUserId() <= 0)
            throw new IllegalArgumentException("grantedToUserId invalide");
        if (p.getPermission() == null)
            throw new IllegalArgumentException("permission obligatoire");
        String perm = p.getPermission().trim().toUpperCase();
        if (!perm.equals("READ") && !perm.equals("WRITE"))
            throw new IllegalArgumentException("permission doit être READ ou WRITE");
    }
}

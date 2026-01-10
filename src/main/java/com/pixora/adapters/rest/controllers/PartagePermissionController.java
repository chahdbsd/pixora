package com.pixora.adapters.rest.controllers;

import com.pixora.usecase.dto.PartagePermissionDTO;
import com.pixora.usecase.mapper.PartagePermissionUseCaseMapper;
import com.pixora.usecase.service.PartagerAlbumUseCase;
import com.pixora.usecase.service.ListerPartagesAlbumUseCase;
import com.pixora.usecase.service.RetirerPartageUseCase;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partages")
public class PartagePermissionController {

    private final PartagerAlbumUseCase partager;
    private final ListerPartagesAlbumUseCase lister;
    private final RetirerPartageUseCase retirer;
    private final PartagePermissionUseCaseMapper mapper;

    public PartagePermissionController(
            PartagerAlbumUseCase partager,
            ListerPartagesAlbumUseCase lister,
            RetirerPartageUseCase retirer,
            PartagePermissionUseCaseMapper mapper
    ) {
        this.partager = partager;
        this.lister = lister;
        this.retirer = retirer;
        this.mapper = mapper;
    }

    @PostMapping
    public PartagePermissionDTO partager(
            @RequestParam Long albumId,
            @RequestParam Long userId,
            @RequestParam String permission
    ) {
        return mapper.toDTO(
                partager.execute(albumId, userId, permission)
        );
    }

    @GetMapping
    public List<PartagePermissionDTO> list(@RequestParam Long albumId) {
        return lister.execute(albumId)
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        retirer.execute(id);
    }
}

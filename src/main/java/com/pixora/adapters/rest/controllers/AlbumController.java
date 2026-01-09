package com.pixora.adapters.rest.controllers;

import com.pixora.usecase.dto.AlbumDTO;
import com.pixora.usecase.mapper.AlbumUseCaseMapper;
import com.pixora.usecase.service.CreerAlbumUseCase;
import com.pixora.usecase.service.ListerAlbumsUseCase;
import com.pixora.usecase.service.RecupererAlbumParIdUseCase;
import com.pixora.usecase.service.SupprimerAlbumUseCase;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/albums")
public class AlbumController {

    private final CreerAlbumUseCase creerAlbumUseCase;
    private final ListerAlbumsUseCase listerAlbumsUseCase;
    private final RecupererAlbumParIdUseCase recupererAlbumParIdUseCase;
    private final SupprimerAlbumUseCase supprimerAlbumUseCase;
    private final AlbumUseCaseMapper mapper;

    public AlbumController(
            CreerAlbumUseCase creerAlbumUseCase,
            ListerAlbumsUseCase listerAlbumsUseCase,
            RecupererAlbumParIdUseCase recupererAlbumParIdUseCase,
            SupprimerAlbumUseCase supprimerAlbumUseCase,
            AlbumUseCaseMapper mapper
    ) {
        this.creerAlbumUseCase = creerAlbumUseCase;
        this.listerAlbumsUseCase = listerAlbumsUseCase;
        this.recupererAlbumParIdUseCase = recupererAlbumParIdUseCase;
        this.supprimerAlbumUseCase = supprimerAlbumUseCase;
        this.mapper = mapper;
    }

    @PostMapping
    public AlbumDTO create(
            @RequestParam Long ownerUserId,
            @RequestParam String titre
    ) {
        return mapper.toDTO(
                creerAlbumUseCase.execute(ownerUserId, titre)
        );
    }

    @GetMapping("/{id}")
    public AlbumDTO getById(@PathVariable Long id) {
        return mapper.toDTO(
                recupererAlbumParIdUseCase.execute(id)
        );
    }

    @GetMapping
    public List<AlbumDTO> list(@RequestParam Long ownerUserId) {
        return listerAlbumsUseCase.execute(ownerUserId)
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        supprimerAlbumUseCase.execute(id);
    }
}

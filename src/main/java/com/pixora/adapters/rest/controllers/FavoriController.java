package com.pixora.adapters.rest.controllers;

import com.pixora.usecase.dto.FavoriDTO;
import com.pixora.usecase.mapper.FavoriUseCaseMapper;
import com.pixora.usecase.service.AjouterFavoriUseCase;
import com.pixora.usecase.service.ListerFavorisUseCase;
import com.pixora.usecase.service.RetirerFavoriUseCase;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/favoris")
public class FavoriController {

    private final AjouterFavoriUseCase ajouter;
    private final RetirerFavoriUseCase retirer;
    private final ListerFavorisUseCase lister;
    private final FavoriUseCaseMapper mapper;

    public FavoriController(
            AjouterFavoriUseCase ajouter,
            RetirerFavoriUseCase retirer,
            ListerFavorisUseCase lister,
            FavoriUseCaseMapper mapper
    ) {
        this.ajouter = ajouter;
        this.retirer = retirer;
        this.lister = lister;
        this.mapper = mapper;
    }

    @PostMapping
    public FavoriDTO add(@RequestParam Long userId,
                         @RequestParam Long photoId) {
        return mapper.toDTO(
                ajouter.execute(userId, photoId)
        );
    }

    @GetMapping
    public List<FavoriDTO> list(@RequestParam Long userId) {
        return lister.execute(userId)
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    @DeleteMapping
    public void remove(@RequestParam Long userId,
                       @RequestParam Long photoId) {
        retirer.execute(userId, photoId);
    }
}

package com.pixora.adapters.rest.controllers;

import com.pixora.usecase.dto.UtilisateurDTO;
import com.pixora.usecase.mapper.UtilisateurUseCaseMapper;
import com.pixora.usecase.service.CreerUtilisateurUseCase;
import com.pixora.usecase.service.ListerUtilisateursUseCase;
import com.pixora.usecase.service.RecupererUtilisateurParIdUseCase;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final CreerUtilisateurUseCase creer;
    private final ListerUtilisateursUseCase lister;
    private final RecupererUtilisateurParIdUseCase recuperer;
    private final UtilisateurUseCaseMapper mapper;

    public UserController(
            CreerUtilisateurUseCase creer,
            ListerUtilisateursUseCase lister,
            RecupererUtilisateurParIdUseCase recuperer,
            UtilisateurUseCaseMapper mapper
    ) {
        this.creer = creer;
        this.lister = lister;
        this.recuperer = recuperer;
        this.mapper = mapper;
    }

    @PostMapping
    public UtilisateurDTO create(@RequestParam String email,
                                 @RequestParam String nom) {
        return mapper.toDTO(creer.execute(email, nom));
    }

    @GetMapping
    public List<UtilisateurDTO> list() {
        return lister.execute().stream()
                .map(mapper::toDTO)
                .toList();
    }

    @GetMapping("/{id}")
    public UtilisateurDTO get(@PathVariable Long id) {
        return mapper.toDTO(recuperer.execute(id));
    }
}

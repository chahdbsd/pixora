package com.pixora.adapters.rest.controllers;

import com.pixora.usecase.dto.TagDTO;
import com.pixora.usecase.mapper.TagUseCaseMapper;
import com.pixora.usecase.service.CreerTagUseCase;
import com.pixora.usecase.service.ListerTagsUseCase;
import com.pixora.usecase.service.SupprimerTagUseCase;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tags")
public class TagController {

    private final CreerTagUseCase creer;
    private final ListerTagsUseCase lister;
    private final SupprimerTagUseCase supprimer;
    private final TagUseCaseMapper mapper;

    public TagController(
            CreerTagUseCase creer,
            ListerTagsUseCase lister,
            SupprimerTagUseCase supprimer,
            TagUseCaseMapper mapper
    ) {
        this.creer = creer;
        this.lister = lister;
        this.supprimer = supprimer;
        this.mapper = mapper;
    }

    @PostMapping
    public TagDTO create(@RequestParam String label) {
        return mapper.toDTO(creer.execute(label));
    }

    @GetMapping
    public List<TagDTO> list() {
        return lister.execute().stream().map(mapper::toDTO).toList();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        supprimer.execute(id);
    }
}

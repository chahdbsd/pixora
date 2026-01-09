package com.pixora.adapters.rest.controllers;

import com.pixora.usecase.dto.PhotoDTO;
import com.pixora.usecase.mapper.PhotoUseCaseMapper;
import com.pixora.usecase.service.ImporterPhotoUseCase;
import com.pixora.usecase.service.RechercherPhotosUseCase;
import com.pixora.usecase.service.SupprimerPhotoUseCase;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/photos")
public class PhotoController {

    private final ImporterPhotoUseCase importerPhotoUseCase;
    private final RechercherPhotosUseCase rechercherPhotosUseCase;
    private final SupprimerPhotoUseCase supprimerPhotoUseCase;
    private final PhotoUseCaseMapper mapper;

    public PhotoController(
            ImporterPhotoUseCase importerPhotoUseCase,
            RechercherPhotosUseCase rechercherPhotosUseCase,
            SupprimerPhotoUseCase supprimerPhotoUseCase,
            PhotoUseCaseMapper mapper
    ) {
        this.importerPhotoUseCase = importerPhotoUseCase;
        this.rechercherPhotosUseCase = rechercherPhotosUseCase;
        this.supprimerPhotoUseCase = supprimerPhotoUseCase;
        this.mapper = mapper;
    }

    @PostMapping
    public PhotoDTO upload(@RequestParam Long albumId,
                           @RequestParam Long uploaderUserId,
                           @RequestParam String url) {
        return mapper.toDTO(
                importerPhotoUseCase.execute(albumId, uploaderUserId, url)
        );
    }

    @GetMapping
    public List<PhotoDTO> list(@RequestParam Long albumId) {
        return rechercherPhotosUseCase.execute(albumId)
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        supprimerPhotoUseCase.execute(id);
    }
}

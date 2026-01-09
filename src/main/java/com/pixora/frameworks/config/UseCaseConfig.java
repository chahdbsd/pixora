package com.pixora.frameworks.config;

import com.pixora.adapters.infrastructure.persistence.mapper.AlbumJpaMapper;
import com.pixora.adapters.infrastructure.persistence.mapper.PhotoJpaMapper;
import com.pixora.adapters.infrastructure.persistence.repository.JpaAlbumRepository;
import com.pixora.adapters.infrastructure.persistence.repository.JpaPhotoRepository;
import com.pixora.adapters.infrastructure.persistence.repository.SpringDataAlbumRepository;
import com.pixora.adapters.infrastructure.persistence.repository.SpringDataPhotoRepository;
import com.pixora.domain.repository.AlbumRepository;
import com.pixora.domain.repository.PhotoRepository;
import com.pixora.domain.service.AlbumValidator;
import com.pixora.domain.service.PhotoValidator;
import com.pixora.usecase.mapper.AlbumUseCaseMapper;
import com.pixora.usecase.mapper.PhotoUseCaseMapper;
import com.pixora.usecase.service.*;
import com.pixora.adapters.infrastructure.persistence.mapper.UtilisateurJpaMapper;
import com.pixora.adapters.infrastructure.persistence.repository.JpaUtilisateurRepository;
import com.pixora.adapters.infrastructure.persistence.repository.SpringDataUtilisateurRepository;
import com.pixora.domain.repository.UtilisateurRepository;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public AlbumUseCaseMapper albumUseCaseMapper() {
        return new AlbumUseCaseMapper();
    }

    @Bean
    public PhotoUseCaseMapper photoUseCaseMapper() {
        return new PhotoUseCaseMapper();
    }

    @Bean
    public AlbumValidator albumValidator() {
        return new AlbumValidator();
    }

    @Bean
    public PhotoValidator photoValidator() {
        return new PhotoValidator();
    }

    @Bean
    public AlbumJpaMapper albumJpaMapper() {
        return new AlbumJpaMapper();
    }

    @Bean
    public PhotoJpaMapper photoJpaMapper() {
        return new PhotoJpaMapper();
    }

    @Bean
    public AlbumRepository albumRepository(
            SpringDataAlbumRepository springRepo,
            AlbumJpaMapper mapper
    ) {
        return new JpaAlbumRepository(springRepo, mapper);
    }

    @Bean
    public PhotoRepository photoRepository(
            SpringDataPhotoRepository springRepo,
            PhotoJpaMapper mapper
    ) {
        return new JpaPhotoRepository(springRepo, mapper);
    }

    @Bean
    public CreerAlbumUseCase creerAlbumUseCase(
            AlbumRepository repo,
            AlbumValidator validator
    ) {
        return new CreerAlbumUseCase(repo, validator);
    }

    @Bean
    public ListerAlbumsUseCase listerAlbumsUseCase(
            AlbumRepository repo
    ) {
        return new ListerAlbumsUseCase(repo);
    }

    @Bean
    public RecupererAlbumParIdUseCase recupererAlbumParIdUseCase(
            AlbumRepository repo
    ) {
        return new RecupererAlbumParIdUseCase(repo);
    }

    @Bean
    public SupprimerAlbumUseCase supprimerAlbumUseCase(
            AlbumRepository repo
    ) {
        return new SupprimerAlbumUseCase(repo);
    }

    @Bean
    public RechercherPhotosUseCase rechercherPhotosUseCase(
            PhotoRepository repo
    ) {
        return new RechercherPhotosUseCase(repo);
    }

    @Bean
    public ImporterPhotoUseCase importerPhotoUseCase(
            PhotoRepository repo
    ) {
        return new ImporterPhotoUseCase(repo);
    }

    @Bean
    public SupprimerPhotoUseCase supprimerPhotoUseCase(
            PhotoRepository repo
    ) {
        return new SupprimerPhotoUseCase(repo);
    }

    @Bean
    public UtilisateurJpaMapper utilisateurJpaMapper() {
        return new UtilisateurJpaMapper();
    }

    @Bean
    public UtilisateurRepository utilisateurRepository(
            SpringDataUtilisateurRepository springRepo,
            UtilisateurJpaMapper mapper
    ) {
        return new JpaUtilisateurRepository(springRepo, mapper);
    }


    @Bean
    public CreerUtilisateurUseCase creerUtilisateurUseCase(UtilisateurRepository repo) {
        return new CreerUtilisateurUseCase(repo);
    }

    @Bean
    public ListerUtilisateursUseCase listerUtilisateursUseCase(UtilisateurRepository repo) {
        return new ListerUtilisateursUseCase(repo);
    }

    @Bean
    public RecupererUtilisateurParIdUseCase recupererUtilisateurParIdUseCase(UtilisateurRepository repo) {
        return new RecupererUtilisateurParIdUseCase(repo);
    }

}

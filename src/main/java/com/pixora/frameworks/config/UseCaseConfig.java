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
import com.pixora.domain.service.TagValidator;
import com.pixora.usecase.mapper.AlbumUseCaseMapper;
import com.pixora.usecase.mapper.PhotoUseCaseMapper;
import com.pixora.usecase.service.*;
import com.pixora.adapters.infrastructure.persistence.mapper.UtilisateurJpaMapper;
import com.pixora.adapters.infrastructure.persistence.repository.JpaUtilisateurRepository;
import com.pixora.adapters.infrastructure.persistence.repository.SpringDataUtilisateurRepository;
import com.pixora.domain.repository.UtilisateurRepository;
import com.pixora.usecase.service.AjouterFavoriUseCase;
import com.pixora.usecase.service.RetirerFavoriUseCase;
import com.pixora.usecase.service.ListerFavorisUseCase;
import com.pixora.domain.repository.FavoriRepository;
import com.pixora.adapters.infrastructure.persistence.mapper.FavoriJpaMapper;
import com.pixora.adapters.infrastructure.persistence.repository.SpringDataFavoriRepository;
import com.pixora.adapters.infrastructure.persistence.repository.JpaFavoriRepository;
import com.pixora.domain.repository.FavoriRepository;
import com.pixora.adapters.infrastructure.persistence.mapper.PartagePermissionJpaMapper;
import com.pixora.adapters.infrastructure.persistence.repository.JpaPartagePermissionRepository;
import com.pixora.adapters.infrastructure.persistence.repository.SpringDataPartagePermissionRepository;
import com.pixora.domain.repository.PartagePermissionRepository;
import com.pixora.usecase.mapper.PartagePermissionUseCaseMapper;
import com.pixora.adapters.infrastructure.persistence.mapper.TagJpaMapper;
import com.pixora.adapters.infrastructure.persistence.repository.JpaTagRepository;
import com.pixora.adapters.infrastructure.persistence.repository.SpringDataTagRepository;
import com.pixora.domain.repository.TagRepository;
import com.pixora.usecase.service.CreerTagUseCase;
import com.pixora.usecase.service.ListerTagsUseCase;
import com.pixora.usecase.service.SupprimerTagUseCase;

import com.pixora.usecase.mapper.TagUseCaseMapper;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.pixora.usecase.port.out.PhotoEventPublisher; // à ajouter en haut

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
            PhotoRepository repo,
            PhotoEventPublisher photoEventPublisher
    ) {
        return new ImporterPhotoUseCase(repo, photoEventPublisher);
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

    @Bean
    public AjouterFavoriUseCase ajouterFavoriUseCase(FavoriRepository repo) {
        return new AjouterFavoriUseCase(repo);
    }

    @Bean
    public RetirerFavoriUseCase retirerFavoriUseCase(FavoriRepository repo) {
        return new RetirerFavoriUseCase(repo);
    }

    @Bean
    public ListerFavorisUseCase listerFavorisUseCase(FavoriRepository repo) {
        return new ListerFavorisUseCase(repo);
    }


    @Bean
    public FavoriJpaMapper favoriJpaMapper() {
        return new FavoriJpaMapper();
    }

    @Bean
    public FavoriRepository favoriRepository(
            SpringDataFavoriRepository springRepo,
            FavoriJpaMapper mapper
    ) {
        return new JpaFavoriRepository(springRepo, mapper);
    }

    @Bean
    public PartagePermissionJpaMapper partagePermissionJpaMapper() {
        return new PartagePermissionJpaMapper();
    }

    @Bean
    public PartagePermissionRepository partagePermissionRepository(
            SpringDataPartagePermissionRepository springRepo,
            PartagePermissionJpaMapper mapper
    ) {
        return new JpaPartagePermissionRepository(springRepo, mapper);
    }

    @Bean
    public PartagerAlbumUseCase partagerAlbumUseCase(PartagePermissionRepository repo) {
        return new PartagerAlbumUseCase(repo);
    }

    @Bean
    public ListerPartagesAlbumUseCase listerPartagesAlbumUseCase(PartagePermissionRepository repo) {
        return new ListerPartagesAlbumUseCase(repo);
    }

    @Bean
    public RetirerPartageUseCase retirerPartageUseCase(PartagePermissionRepository repo) {
        return new RetirerPartageUseCase(repo);
    }

    @Bean
    public PartagePermissionUseCaseMapper partagePermissionUseCaseMapper() {
        return new PartagePermissionUseCaseMapper();
    }
    @Bean
    public TagJpaMapper tagJpaMapper() {
        return new TagJpaMapper();
    }

    @Bean
    public TagRepository tagRepository(
            SpringDataTagRepository repo,
            TagJpaMapper mapper
    ) {
        return new JpaTagRepository(repo, mapper);
    }

    @Bean
    public TagValidator tagValidator() {
        return new TagValidator();
    }

    @Bean
    public CreerTagUseCase creerTagUseCase(
            TagRepository repo,
            TagValidator validator
    ) {
        return new CreerTagUseCase(repo, validator);
    }

    @Bean
    public ListerTagsUseCase listerTagsUseCase(TagRepository repo) {
        return new ListerTagsUseCase(repo);
    }

    @Bean
    public SupprimerTagUseCase supprimerTagUseCase(TagRepository repo) {
        return new SupprimerTagUseCase(repo);
    }

    @Bean
    public TagUseCaseMapper tagUseCaseMapper() {
        return new TagUseCaseMapper();
    }

    @Bean
    public HandlePhotoUploadedEventUseCase handlePhotoUploadedEventUseCase() {
        return new HandlePhotoUploadedEventUseCase();
    }


}


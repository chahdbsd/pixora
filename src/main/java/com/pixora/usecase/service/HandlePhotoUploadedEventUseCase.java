package com.pixora.usecase.service;

import com.pixora.usecase.event.PhotoUploadedEvent;

public class HandlePhotoUploadedEventUseCase {

    public void handle(PhotoUploadedEvent event) {
        // Traitement métier (fake pour le TD)
        System.out.println(
                "Traitement métier après upload photo : photoId=" + event.getPhotoId()
        );
    }
}

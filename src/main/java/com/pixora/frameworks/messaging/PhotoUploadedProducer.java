package com.pixora.frameworks.messaging;

import com.pixora.usecase.event.PhotoUploadedEvent;

public class PhotoUploadedProducer {

    public void publish(PhotoUploadedEvent event) {
        // Envoi Kafka (sera implémenté plus tard)
        System.out.println("Photo uploaded event sent: " + event.getPhotoId());
    }
}

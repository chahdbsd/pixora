package com.pixora.frameworks.messaging;

public class PhotoUploadedConsumer {

    public void consume(String message) {
        System.out.println("Photo uploaded event received: " + message);
    }
}

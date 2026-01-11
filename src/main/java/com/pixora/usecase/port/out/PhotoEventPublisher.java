package com.pixora.usecase.port.out;

import com.pixora.usecase.event.PhotoUploadedEvent;

public interface PhotoEventPublisher {
    void publishPhotoUploaded(PhotoUploadedEvent event);
}

package com.pixora.frameworks.messaging;

import com.pixora.usecase.event.PhotoUploadedEvent;
import com.pixora.usecase.port.out.PhotoEventPublisher;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(
        name = "KAFKA_ENABLED",
        havingValue = "false",
        matchIfMissing = true
)
public class NoOpPhotoEventPublisher implements PhotoEventPublisher {

    @Override
    public void publishPhotoUploaded(PhotoUploadedEvent event) {
        // intentionally empty (Kafka disabled)
    }
}

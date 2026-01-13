package com.pixora.frameworks.messaging;

import com.pixora.usecase.event.PhotoUploadedEvent;
import com.pixora.usecase.service.HandlePhotoUploadedEventUseCase;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@ConditionalOnProperty(
        name = "KAFKA_ENABLED",
        havingValue = "true",
        matchIfMissing = true
)
@Component
public class PhotoUploadedConsumer {

    private final HandlePhotoUploadedEventUseCase useCase;

    public PhotoUploadedConsumer(HandlePhotoUploadedEventUseCase useCase) {
        this.useCase = useCase;
    }

    @KafkaListener(
            topics = "${pixora.kafka.topics.photo-uploaded:photo-uploaded}",
            groupId = "pixora"
    )
    public void consume(PhotoUploadedEvent event) {
        useCase.handle(event);
    }
}

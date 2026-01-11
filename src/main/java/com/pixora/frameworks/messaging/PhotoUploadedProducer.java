package com.pixora.frameworks.messaging;

import com.pixora.usecase.event.PhotoUploadedEvent;
import com.pixora.usecase.port.out.PhotoEventPublisher;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class PhotoUploadedProducer implements PhotoEventPublisher {

    private final KafkaTemplate<String, PhotoUploadedEvent> kafkaTemplate;
    private final String topic;

    public PhotoUploadedProducer(
            KafkaTemplate<String, PhotoUploadedEvent> kafkaTemplate,
            @Value("${pixora.kafka.topics.photo-uploaded:photo-uploaded}") String topic
    ) {
        this.kafkaTemplate = kafkaTemplate;
        this.topic = topic;
    }

    @Override
    public void publishPhotoUploaded(PhotoUploadedEvent event) {
        String key = event.getPhotoId() != null ? event.getPhotoId().toString() : null;
        kafkaTemplate.send(topic, key, event);
    }
}

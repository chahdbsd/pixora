package com.pixora.adapters.infrastructure.persistence.mapper;

import com.pixora.adapters.infrastructure.persistence.entity.TagJpaEntity;
import com.pixora.domain.entities.Tag;

public class TagJpaMapper {

    public TagJpaEntity toEntity(Tag tag) {
        TagJpaEntity e = new TagJpaEntity();
        e.setId(tag.getId());
        e.setLabel(tag.getLabel());
        return e;
    }

    public Tag toDomain(TagJpaEntity e) {
        return new Tag(e.getId(), e.getLabel());
    }
}

package com.example.tagletagle.src.tag.repository;

import com.example.tagletagle.src.tag.entity.TagEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TagRepository extends JpaRepository<TagEntity, Long> {
    List<TagEntity> findTop10ByOrderbyLastUsedDesc();
}

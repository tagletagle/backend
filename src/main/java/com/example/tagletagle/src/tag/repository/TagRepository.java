package com.example.tagletagle.src.tag.repository;

import com.example.tagletagle.config.Status;
import com.example.tagletagle.src.tag.DTO.TagDTO;
import com.example.tagletagle.src.tag.entity.TagEntity;
import com.example.tagletagle.src.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TagRepository extends JpaRepository<TagEntity, Long> {

    List<TagDTO> findTagEntitiesById(Long id);




}

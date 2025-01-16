package com.example.tagletagle.src.tag.service;

import com.example.tagletagle.src.tag.dto.TagResponse;
import com.example.tagletagle.src.tag.entity.TagEntity;
import com.example.tagletagle.src.tag.repository.TagRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TagService {
    private final TagRepository tagRepository;

    /**
     * 최근 사용한 태그 목록 조회
     * @return List<TagResponse> 최근 사용한 태그 목록
     */
    public List<TagResponse> getRecentTags(){
        List<TagEntity> recentTags = tagRepository.findTop10ByOrderbyLastUsedDesc();

        // Entity를 DTO로 변환
        return recentTags.stream()
                .map(tag->new TagResponse(tag.getId(), tag.getName()))
                .collect(Collectors.toList());
    }

}

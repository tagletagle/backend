package com.example.tagletagle.src.tag.controller;

import com.example.tagletagle.src.tag.dto.TagResponse;
import com.example.tagletagle.src.tag.entity.TagRequestEntity;
import com.example.tagletagle.src.tag.service.TagService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequestMapping("/api/user/tag")
@RestController
@RequiredArgsConstructor
public class TagController {
    private final TagService tagService;

    //최근 사용한 태그 목록 불러오기
    @GetMapping("/recent")
    public ResponseEntity<List<TagResponse>> getRecentTags(){
        List<TagResponse> recentTags = tagService.getRecentTags();
        return ResponseEntity.ok(recentTags);
    }
}

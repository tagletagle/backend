package com.example.tagletagle.src.tag.controller;

import ch.qos.logback.core.model.Model;
import com.example.tagletagle.base.BaseException;
import com.example.tagletagle.base.BaseResponse;
import com.example.tagletagle.src.board.repository.BoardRepository;
import com.example.tagletagle.src.tag.DTO.TagDTO;
import com.example.tagletagle.src.tag.entity.TagEntity;
import com.example.tagletagle.src.tag.repository.TagRepository;
import com.example.tagletagle.src.tag.service.TagService;
import com.example.tagletagle.src.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import javax.swing.text.html.HTML;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class TagController {

    private final TagService tagService;

    @GetMapping("/api/user/tag/fullList")
    public List<TagDTO> getFullTagList() {
        return tagService.findAllTag();

    }


}

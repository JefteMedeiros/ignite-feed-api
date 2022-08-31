package com.ignitefeed.controller;

import com.ignitefeed.entities.ContentEntity;
import com.ignitefeed.services.ContentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/content")
public class ContentController {
    private final ContentService contentService;

    public ContentController (ContentService contentService) {
        this.contentService = contentService;
    }

    @PostMapping
    public ContentEntity addContent(@RequestBody ContentEntity content) {
        return contentService.addContent(content);
    }

    @DeleteMapping("/{id}")
    public void deleteContent(@PathVariable("id") Long id) {
        contentService.deleteContent(id);
    }
}

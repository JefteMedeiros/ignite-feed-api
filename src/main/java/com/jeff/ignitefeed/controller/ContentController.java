package com.jeff.ignitefeed.controller;

import com.jeff.ignitefeed.entities.Content;
import com.jeff.ignitefeed.services.ContentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/content")
public class ContentController {
    private final ContentService contentService;

    public ContentController (ContentService contentService) {
        this.contentService = contentService;
    }

    @PostMapping
    public Content addContent(@RequestBody Content content) {
        return contentService.addContent(content);
    }

    @DeleteMapping("/{id}")
    public void deleteContent(@PathVariable("id") Long id) {
        contentService.deleteContent(id);
    }
}

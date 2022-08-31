package com.ignitefeed.services.impl;

import com.ignitefeed.entities.ContentEntity;
import com.ignitefeed.repository.ContentRepository;
import com.ignitefeed.services.ContentService;
import org.springframework.stereotype.Service;

@Service
public class ContentServiceImpl implements ContentService {
    private final ContentRepository contentRepository;

    public ContentServiceImpl (ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    @Override
    public ContentEntity addContent(ContentEntity content) {
        return contentRepository.save(content);
    }

    @Override
    public void deleteContent (Long id) {
        contentRepository.deleteById(id);
    }

    @Override
    public ContentEntity updateContent(ContentEntity content) {
        return contentRepository.save(content);
    }
}

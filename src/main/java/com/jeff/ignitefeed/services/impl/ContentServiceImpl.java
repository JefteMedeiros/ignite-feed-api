package com.jeff.ignitefeed.services.impl;

import com.jeff.ignitefeed.entities.Content;
import com.jeff.ignitefeed.repository.ContentRepository;
import com.jeff.ignitefeed.services.ContentService;
import org.springframework.stereotype.Service;

@Service
public class ContentServiceImpl implements ContentService {
    private final ContentRepository contentRepository;

    public ContentServiceImpl (ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    @Override
    public Content addContent(Content content) {
        return contentRepository.save(content);
    }

    @Override
    public void deleteContent (Long id) {
        contentRepository.deleteById(id);
    }

    @Override
    public Content updateContent(Content content) {
        return contentRepository.save(content);
    }
}

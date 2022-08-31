package com.ignitefeed.services;

import com.ignitefeed.entities.ContentEntity;

public interface ContentService {
    ContentEntity addContent (ContentEntity contentEntity);
    ContentEntity updateContent(ContentEntity contentEntity);
    void deleteContent (Long id);
}

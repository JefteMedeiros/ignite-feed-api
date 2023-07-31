package com.jeff.ignitefeed.services;

import com.jeff.ignitefeed.entities.Content;

public interface ContentService {
    Content addContent (Content content);
    Content updateContent(Content content);
    void deleteContent (Long id);
}

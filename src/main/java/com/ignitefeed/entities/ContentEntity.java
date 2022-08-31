package com.ignitefeed.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "content_table")
public class ContentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @Column(name = "paragraph")
    private String Paragraph;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "content_id")
    private PostsEntity postContent;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getParapgraph() {
        return Paragraph;
    }

    public void setParapgraph(String parapgraph) {
        Paragraph = parapgraph;
    }

    @JsonBackReference
    public PostsEntity getPostContent() {
        return postContent;
    }

    public void setPostContent(PostsEntity postContent) {
        this.postContent = postContent;
    }
}

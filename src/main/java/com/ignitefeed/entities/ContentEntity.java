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
    private String Parapgraph;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "content_id", nullable = false)
    private PostsEntity postContent;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getParapgraph() {
        return Parapgraph;
    }

    public void setParapgraph(String parapgraph) {
        Parapgraph = parapgraph;
    }

    @JsonBackReference
    public PostsEntity getPostContent() {
        return postContent;
    }

    public void setPostContent(PostsEntity postContent) {
        this.postContent = postContent;
    }
}

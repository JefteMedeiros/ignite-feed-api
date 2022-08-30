package com.ignitefeed.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.stream.events.Comment;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "posts")
public class PostsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @Column(name = "name")
    private String Name;

    @Column(name = "role")
    private String Role;

    @Column(name = "pic")
    private String Pic;

    @Column(name = "link")
    private String Link;

    @Column(name = "date")
    private String Date;

    @OneToMany(mappedBy = "postContent", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<ContentEntity> content;

    @OneToMany(mappedBy = "postComment", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<CommentEntity> comment;
}

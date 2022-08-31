package com.ignitefeed.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "posts")
public class PostsEntity {

    @JsonManagedReference
    public Set<ContentEntity> getContent() {
        return content;
    }

    public void setContent(Set<ContentEntity> content) {
        this.content = content;
    }

    public Set<CommentEntity> getComment() {
        return comment;
    }

    public void setComment(Set<CommentEntity> comment) {
        this.comment = comment;
    }

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
    @JsonManagedReference
    private Set<ContentEntity> content;

    @OneToMany(mappedBy = "postComment", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<CommentEntity> comment;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public String getPic() {
        return Pic;
    }

    public void setPic(String pic) {
        Pic = pic;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}

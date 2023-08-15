package com.jeff.ignitefeed.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;

    @OneToMany(mappedBy = "post")
    private List<Comment> comment;

    @ManyToOne()
    @JoinColumn(name="user_id", referencedColumnName = "id", nullable = false)
    private User user;
}

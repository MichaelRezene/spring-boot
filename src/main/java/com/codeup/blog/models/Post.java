package com.codeup.blog.models;


import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    @NotBlank(message = "Posts must have a title")
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    @NotBlank(message = "Posts must have a title")
    private String body;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    public Post(){

    }

    // Use on the CREATE action
    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }

    // use when the post is retrieved from the database
    public Post(long id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {

        this.body = body;
    }

    public void setUser(User user) {

        this.user = user;
    }
}

package com.codeup.blog.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

//    @Column(nullable = false)
//    private String firstname;

//    @Column(nullable = false)
//    private String lastname;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Post> posts;

    public User(){

    }

    public User(User user){
        id = user.id;
        email = user.email;
        username = user.username;
        password = user.password;
//        firstname = user.firstname;
//        lastname = user.lastname;
    }
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
//        this.firstname = firstname;
//        this.lastname = lastname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

//    public String getFirstname(){
//        return firstname;
//    }
//    public void setFirstname(){
//        this.firstname = firstname;
//    }
//    public String getLastname(){
//        return lastname;
//    }
//    public void setLastname(){
//        this.lastname = lastname;
//    }
}



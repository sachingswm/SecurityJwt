package com.example.work1.entity;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

package com.example.blogproject.Models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user_table")
public class User {

    public User(@NonNull String user_id, @NonNull String email_id, @NonNull String username, @NonNull String password, int age, @NonNull String gender, @NonNull String city) {
        this.user_id = user_id;
        this.email_id = email_id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.gender = gender;
        this.city = city;
    }


    @PrimaryKey
    @NonNull
    private String user_id;

    @NonNull
    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(@NonNull String user_id) {
        this.user_id = user_id;
    }

    @NonNull
    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(@NonNull String email_id) {
        this.email_id = email_id;
    }

    @NonNull
    public String getUsername() {
        return username;
    }

    public void setUsername(@NonNull String username) {
        this.username = username;
    }

    @NonNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @NonNull
    public String getGender() {
        return gender;
    }

    public void setGender(@NonNull String gender) {
        this.gender = gender;
    }

    @NonNull
    public String getCity() {
        return city;
    }

    public void setCity(@NonNull String city) {
        this.city = city;
    }

    @NonNull
    private String email_id;


    @NonNull
    private String username;

    @NonNull
    private String password;

    @NonNull
    private int age;

    @NonNull
    private String gender;

    @NonNull
    private String city;
}

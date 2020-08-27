package com.example.blogproject.Models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import static androidx.room.ForeignKey.CASCADE;


@Entity(tableName = "blog_table",foreignKeys = @ForeignKey(entity = User.class,
        parentColumns = "user_id",
        childColumns = "userwriterid",
        onDelete = CASCADE))
public class blog {
    public blog(@NonNull String blogid, @NonNull String title, @NonNull String content, @NonNull String thumbnail, @NonNull String userwriterid) {
        this.blogid = blogid;
        this.title = title;
        this.content = content;
        this.thumbnail = thumbnail;
        this.userwriterid = userwriterid;
    }

    @PrimaryKey
    @NonNull
    private String blogid;

    @NonNull
    public String getBlogid() {
        return blogid;
    }

    public void setBlogid(@NonNull String blogid) {
        this.blogid = blogid;
    }

    @NonNull
    public String getTitle() {
        return title;
    }

    public void setTitle(@NonNull String title) {
        this.title = title;
    }

    @NonNull
    public String getContent() {
        return content;
    }

    public void setContent(@NonNull String content) {
        this.content = content;
    }

    @NonNull
    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(@NonNull String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @NonNull
    public String getUserwriterid() {
        return userwriterid;
    }

    public void setUserwriterid(@NonNull String userwriterid) {
        this.userwriterid = userwriterid;
    }

    @NonNull
    private String title;

    @NonNull
    private String content;

    @NonNull
    private String thumbnail;

    @NonNull
    private String userwriterid;
}

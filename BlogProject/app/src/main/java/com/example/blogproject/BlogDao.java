package com.example.blogproject;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.blogproject.Models.User;

import java.util.List;
@Dao
public interface BlogDao {

    @Insert
    void insert(User user);

//    @Query(" SELECT * FROM notes")
//    LiveData<List<Note>> getAllNotes();

//    @Query(" SELECT * FROM notes WHERE id =:noteId")
//    LiveData<Note> getNote(String noteId);
//
//    @Update
//    void update(Note note);
//
//    @Delete
//    int delete(Note note);

}

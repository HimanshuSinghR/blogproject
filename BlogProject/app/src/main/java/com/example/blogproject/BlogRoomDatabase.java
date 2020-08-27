package com.example.blogproject;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.blogproject.Models.User;
import com.example.blogproject.Models.blog;

@Database(entities = {User.class, blog.class},version =1)
public abstract class BlogRoomDatabase extends RoomDatabase {

    public abstract BlogDao BlogDao();

    private static volatile BlogRoomDatabase blogRoomInstance;

    static BlogRoomDatabase getDatabase(final Context context){
        if ( blogRoomInstance == null ) {
            synchronized (BlogRoomDatabase.class) {
                if ( blogRoomInstance == null ) {
                    blogRoomInstance = Room.databaseBuilder(context.getApplicationContext(),
                            BlogRoomDatabase.class,"blog_database").build();
                }
            }
        }
        return blogRoomInstance;
    }

}

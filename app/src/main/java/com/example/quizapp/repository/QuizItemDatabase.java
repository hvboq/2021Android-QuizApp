package com.example.quizapp.repository;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {QuizItem.class}, version = 1)
public abstract class QuizItemDatabase extends RoomDatabase {
    public abstract QuizItemDAO quizItemDAO();

    private static QuizItemDatabase instance;
    public static QuizItemDatabase getInstance(Context context){
        if(instance==null){
            instance = Room.databaseBuilder(
                    context,
                    QuizItemDatabase.class,
                    "db")
                    .build();
        }
        return instance;
    }
}

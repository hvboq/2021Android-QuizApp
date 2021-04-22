package com.example.quizapp.repository;


import androidx.room.*;

import java.util.List;

@Dao
public interface QuizItemDAO {
    @Insert
    long addItem(QuizItem item);

    @Query("select * from quiz")
    @TypeConverter
    List<QuizItem> getQuizs();

    @Query("select * from quiz where id=:id")
    QuizItem get(int id);

    @Update
    int update(QuizItem item);

    @Delete
    int delete(QuizItem item);
}

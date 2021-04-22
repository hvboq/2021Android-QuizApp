package com.example.quizapp.repository;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "quiz")
public class QuizItem {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;
    private boolean isImg;
    private int point;
    private String examples[] = new String[4];
    private int answerIdx;

    public QuizItem() {
    }

    public QuizItem(String title, boolean isImg, int point, String examples[], int answerIdx) {
        this.title = title;
        this.isImg = isImg;
        this.point = point;
        this.examples = examples;
        this.answerIdx = answerIdx;
    }
    public QuizItem(int id, String title, boolean isImg, int point, String examples[], int answerIdx) {
        this.id = id;
        this.title = title;
        this.isImg = isImg;
        this.point = point;
        this.examples = examples;
        this.answerIdx = answerIdx;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isImg() {
        return isImg;
    }

    public void setImg(boolean img) {
        isImg = img;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String[] getExamples() {
        return examples;
    }

    public void setExamples(String[] examples) {
        this.examples = examples;
    }

    public int getAnswerIdx() {
        return answerIdx;
    }

    public void setAnswerIdx(int answerIdx) {
        this.answerIdx = answerIdx;
    }
}

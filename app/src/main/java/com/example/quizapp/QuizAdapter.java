package com.example.quizapp;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import androidx.annotation.NonNull;

public class QuizAdapter {
    static class ItemViewHolder extends RecyclerView.ViewHolder{
        TextView textViewTitle;
        TextView textViewSavedTime;
        TextView textViewType;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewSavedTime = itemView.findViewById(R.id.textViewSavedTime);
            textViewType = itemView.findViewById(R.id.textViewType);
        }
        }
    }
}

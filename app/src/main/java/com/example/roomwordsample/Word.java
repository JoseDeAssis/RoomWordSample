package com.example.roomwordsample;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;

    @PrimaryKey(autoGenerate = true)
    private int id;

    public String getWord(){
        return this.mWord;
    }


    public int getId() {
        return id;
    }
}

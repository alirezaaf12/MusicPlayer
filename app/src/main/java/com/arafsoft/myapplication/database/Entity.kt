package com.arafsoft.myapplication.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "music_table")
class Music (@PrimaryKey val id: Int, var title: String, var path: String)
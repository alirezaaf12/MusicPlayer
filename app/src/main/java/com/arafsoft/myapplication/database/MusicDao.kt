package com.arafsoft.myapplication.database

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface MusicDao {
    @Query("SELECT * FROM music_table ORDER BY id ASC")
    fun getAllMusic(): Flow<List<Music>>

    @Query("SELECT * FROM music_table WHERE id = :id")
    suspend fun getMusicById(id: Int): Flow<Music>

    @Insert
    suspend fun insertMusic(vararg music: Music)

    @Delete
    suspend fun deleteMusic(music: Music)

    @Update
    suspend fun updateMusic(music: Music)
}
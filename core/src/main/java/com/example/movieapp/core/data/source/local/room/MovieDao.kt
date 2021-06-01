package com.example.movieapp.core.data.source.local.room

import androidx.room.*
import com.example.movieapp.core.data.source.local.entity.MovieEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MovieDao {

    @Query("SELECT * FROM movieentity")
    fun getAllMovies(): Flow<List<MovieEntity>>

    @Query("SELECT * FROM movieentity WHERE favorite = 1")
    fun getFavoriteMovie(): Flow<List<MovieEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovie(movieEntity: List<MovieEntity>)

    @Update
    fun updateMovie(movieEntity: MovieEntity)
}

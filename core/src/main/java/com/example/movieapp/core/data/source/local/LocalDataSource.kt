package com.example.movieapp.core.data.source.local

import com.example.movieapp.core.data.source.local.entity.MovieEntity
import com.example.movieapp.core.data.source.local.room.MovieDao
import kotlinx.coroutines.flow.Flow

class LocalDataSource(private val movieDao: MovieDao){

    fun getAllMovies() : Flow<List<MovieEntity>> = movieDao.getAllMovies()

    fun getFavoriteMovies() : Flow<List<MovieEntity>> = movieDao.getFavoriteMovie()

    suspend fun insertMovie(movieList: List<MovieEntity>) = movieDao.insertMovie(movieList)

    fun setFavoriteMovie(movieEntity: MovieEntity, newState: Boolean) {
        movieEntity.favorite = newState
        movieDao.updateMovie(movieEntity)
    }
}
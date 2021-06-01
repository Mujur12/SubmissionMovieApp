package com.example.movieapp.core.utils

import com.example.movieapp.core.data.source.local.entity.MovieEntity
import com.example.movieapp.core.data.source.remote.response.MovieResponse
import com.example.movieapp.core.domain.model.Movie

object DataMapper {

    fun mapResponsesToEntities(input: List<MovieResponse>): List<MovieEntity> {
        val tourismList = ArrayList<MovieEntity>()
        input.map {
            val movie = MovieEntity(
                idMovie = it.id,
                title = it.title,
                overview = it.overview,
                releaseDate = it.releaseDate,
                poster = it.posterPath,
                false
            )
            tourismList.add(movie)
        }
        return tourismList
    }

    fun mapEntitiesToDomain(input: List<MovieEntity>): List<Movie> =
        input.map {
            Movie(
                it.idMovie,
                it.title,
                it.overview,
                it.releaseDate,
                it.poster,
                it.favorite
            )
        }

    fun mapDomainToEntity(input: Movie) = MovieEntity(
        idMovie = input.idMovie,
        title = input.title,
        overview = input.overview,
        releaseDate = input.releaseDate,
        poster = input.poster,
        favorite = input.favorite
    )
}
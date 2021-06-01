package com.example.movieapp.core.data.source.remote.network

import com.example.movieapp.core.BuildConfig
import com.example.movieapp.core.data.source.remote.response.ListMovieResponse
import retrofit2.http.GET

interface ApiService {
    @GET("movie/now_playing?api_key=${BuildConfig.GITHUB_TOKEN}")
    suspend fun getListMovie(): ListMovieResponse

}

package com.example.movieapp.core.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    var idMovie: Int,
    var title: String,
    var overview: String,
    var releaseDate: String,
    var poster: String,
    var favorite: Boolean
) : Parcelable
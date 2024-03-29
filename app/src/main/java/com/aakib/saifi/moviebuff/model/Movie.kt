package com.aakib.saifi.moviebuff.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by Aakib
 * Date : 21/May/2021
 * Project : MovieBuff
 */

data class Movie(

    @SerializedName("popularity")
    var popularity: Double,

    @SerializedName("vote_count")
    val voteCount: Int,

    @SerializedName("video")
    val video: Boolean,

    @SerializedName("poster_path")
    val posterPath: String,

    @SerializedName("id")
    val id: Int,

    @SerializedName("adult")
    val adult: Boolean,

    @SerializedName("backdrop_path")
    val backdropPath: String,

    @SerializedName("original_language")
    val originalLanguage: String,

    @SerializedName("original_title")
    val originalTitle: String,

    @SerializedName("genre_ids")
    val genreIds: List<Int>,

    @SerializedName("title")
    val title: String,

    @SerializedName("vote_average")
    val voteAverage: Double,

    @SerializedName("overview")
    val overview: String,

    @SerializedName("release_date")
    val releaseDate: String
):Serializable
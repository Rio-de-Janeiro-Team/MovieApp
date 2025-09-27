package com.karrar.movieapp.data.remote.response.actor

import com.google.gson.annotations.SerializedName

data class ActorExternalIdsDto(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("imdb_id")
    val imdbId: String? = null,
    @SerializedName("facebook_id")
    val facebookId: String? = null,
    @SerializedName("instagram_id")
    val instagramId: String? = null,
    @SerializedName("twitter_id")
    val twitterId: String? = null,
    @SerializedName("tiktok_id")
    val tiktokId: String? = null,
    @SerializedName("youtube_id")
    val youtubeId: String? = null
)
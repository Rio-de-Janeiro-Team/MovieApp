package com.karrar.movieapp.data.remote.response.review


import com.google.gson.annotations.SerializedName
import com.karrar.movieapp.data.utils.ImageBaseUrlsConstant.BASE_IMAGE_URL_W500

data class AuthorDetailsDto(
    @SerializedName("avatar_path")
    val avatarPath: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("rating")
    val rating: Double? = null,
    @SerializedName("username")
    val username: String? = null
){
    val fullAvatarPath: String?
        get() = avatarPath.let { BASE_IMAGE_URL_W500 + it }
}
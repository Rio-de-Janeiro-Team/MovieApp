package com.karrar.movieapp.ui.models

import com.karrar.movieapp.domain.enums.MediaType

data class MediaUiState(
    val id: Int = 0,
    val imageUrl: String = "",
    val rating: String = "",
    val name: String = "",
    val mediaType: MediaType = MediaType.MOVIE
)
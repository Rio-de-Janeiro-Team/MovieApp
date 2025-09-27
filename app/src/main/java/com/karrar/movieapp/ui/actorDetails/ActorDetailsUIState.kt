package com.karrar.movieapp.ui.actorDetails

data class ActorDetailsUIState(
    val name: String = "",
    val imageUrl: String = "",
    val gender: String = "",
    val birthday: String = "",
    val placeOfBirth: String = "",
    val knownFor: String = "",
    val biography: String = "",
    val isLoading: Boolean = false,
    val isSuccess: Boolean = true,
    val error: List<Error> = emptyList(),
    val actorMovies: List<ActorMoviesUIState> = emptyList(),
    val socialMedia: List<SocialMediaItemUiState> = emptyList()
)
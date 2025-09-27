package com.karrar.movieapp.ui.actorDetails

sealed interface ActorDetailsUIEvent {
    object BackEvent : ActorDetailsUIEvent
    object SeeAllMovies : ActorDetailsUIEvent
    data class ClickMovieEvent(val movieID: Int) : ActorDetailsUIEvent
    data class ClickSocialMedia(val socialMediaUrl: String) : ActorDetailsUIEvent
}
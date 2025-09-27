package com.karrar.movieapp.domain.usecases

import android.util.Log
import com.karrar.movieapp.data.repository.MovieRepository
import com.karrar.movieapp.domain.mappers.MovieMappersContainer
import com.karrar.movieapp.ui.actorDetails.SocialMediaItemUiState
import javax.inject.Inject

class GetActorExternalIds @Inject constructor(
    private val movieRepository: MovieRepository,
    private val mappersContainer: MovieMappersContainer

    ) {
    suspend operator fun invoke(actorId: Int) : List<SocialMediaItemUiState> {
        val response = movieRepository.getActorExternalIds(actorId = actorId)
        return if (response != null) {
            mappersContainer.actorExternalIdsMapper.map(response)
        } else {
            emptyList()
        }
        }

    }

package com.karrar.movieapp.domain.mappers.movie

import com.karrar.movieapp.BuildConfig
import com.karrar.movieapp.data.local.database.entity.movie.TrendingMovieEntity
import com.karrar.movieapp.domain.enums.MediaType
import com.karrar.movieapp.domain.mappers.Mapper
import com.karrar.movieapp.domain.models.Media
import javax.inject.Inject

class TrendingMovieMapper @Inject constructor() : Mapper<TrendingMovieEntity, Media> {
    override fun map(input: TrendingMovieEntity): Media {
        return Media(
            mediaID = input.id,
            mediaName = input.name,
            mediaImage = BuildConfig.IMAGE_BASE_PATH + input.imageUrl,
            mediaRate = input.rating.toFloat(),
            mediaDate = "",
            mediaType = MediaType.MOVIE.value,
        )
    }
}
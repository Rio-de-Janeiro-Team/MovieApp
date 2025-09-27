package com.karrar.movieapp.domain.mappers.series

import com.karrar.movieapp.BuildConfig
import com.karrar.movieapp.data.local.database.entity.series.OnTheAirSeriesEntity
import com.karrar.movieapp.domain.enums.MediaType
import com.karrar.movieapp.domain.mappers.Mapper
import com.karrar.movieapp.domain.models.Media
import javax.inject.Inject

class OnTheAirSeriesMapper @Inject constructor() : Mapper<OnTheAirSeriesEntity, Media> {
    override fun map(input: OnTheAirSeriesEntity): Media {
        return Media(
            mediaID = input.id,
            mediaName = input.name,
            mediaImage = BuildConfig.IMAGE_BASE_PATH + input.imageUrl,
            mediaRate = input.rating.toFloat(),
            mediaDate = "",
            mediaType = MediaType.TV_SHOW.value,
        )
    }
}
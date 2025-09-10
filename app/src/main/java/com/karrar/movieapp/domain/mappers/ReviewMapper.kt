package com.karrar.movieapp.domain.mappers

import com.karrar.movieapp.data.remote.response.review.ReviewsDto
import com.karrar.movieapp.domain.models.Review
import javax.inject.Inject

class ReviewMapper @Inject constructor() : Mapper<ReviewsDto, Review> {
    override fun map(input: ReviewsDto): Review {
        return Review(
            content = input.content.orEmpty(),
            createDate = input.createdAt?.take(10).orEmpty(),
            userImage = input.authorDetails?.fullAvatarPath.orEmpty(),
            name = input.author ?: "GUEST",
            userName = input.authorDetails?.username.orEmpty(),
            rating = input.authorDetails?.rating?.toFloat() ?: 0f
        )
    }
}
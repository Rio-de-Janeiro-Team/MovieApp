package com.karrar.movieapp.ui.actorDetails


import com.karrar.movieapp.R
import com.karrar.movieapp.data.remote.response.actor.ActorExternalIdsDto
import com.karrar.movieapp.domain.mappers.Mapper
import javax.inject.Inject

class ActorExternalIdsMapper @Inject constructor() :
    Mapper<ActorExternalIdsDto, List<SocialMediaItemUiState>> {
    override fun map(input: ActorExternalIdsDto): List<SocialMediaItemUiState> {
        val items = mutableListOf<SocialMediaItemUiState>()

        input.facebookId?.let {
            items.add(
                SocialMediaItemUiState(
                    name = "Facebook",
                    iconRes = R.drawable.ic_facebook,
                    url = "https://www.facebook.com/$it"
                )
            )
        }

        input.instagramId?.let {
            items.add(
                SocialMediaItemUiState(
                    name = "Instagram",
                    iconRes = R.drawable.ic_insta,
                    url = "https://www.instagram.com/$it"
                )
            )
        }

        input.twitterId?.let {
            items.add(
                SocialMediaItemUiState(
                    name = "Twitter",
                    iconRes = R.drawable.ic_twitter,
                    url = "https://twitter.com/$it"
                )
            )
        }

        input.tiktokId?.let {
            items.add(
                SocialMediaItemUiState(
                    name = "TikTok",
                    iconRes = R.drawable.ic_tiktok,
                    url = "https://www.tiktok.com/@$it"
                )
            )
        }

        input.youtubeId?.let {
            items.add(
                SocialMediaItemUiState(
                    name = "YouTube",
                    iconRes = R.drawable.ic_youtube,
                    url = "https://www.youtube.com/$it"
                )
            )
        }

        return items
    }
}

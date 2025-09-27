package com.karrar.movieapp.ui.actorDetails

import com.karrar.movieapp.R
import com.karrar.movieapp.ui.adapters.MovieInteractionListener

import com.karrar.movieapp.ui.base.BaseAdapter

class ActorSocialMediaAdapter(items: List<SocialMediaItemUiState>, val listener: MovieInteractionListener) :
    BaseAdapter<SocialMediaItemUiState>(items, listener) {
    override val layoutID: Int = R.layout.item_social_media
}
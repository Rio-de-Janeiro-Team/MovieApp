package com.karrar.movieapp.domain.enums

enum class MediaType(val value :String) {
    MOVIE("movie"),
    TV_SHOW("tv");

    companion object {
        fun parse(value: String): MediaType {
            return entries.firstOrNull { it.value.equals(value, ignoreCase = true) } ?: MOVIE
        }
    }
}
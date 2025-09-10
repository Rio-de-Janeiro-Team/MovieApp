package com.karrar.movieapp.utilities

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.LinearLayout
import com.karrar.movieapp.R

class CustomRatingView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private var starCount: Int = 5
    private var rating: Float = 0f
    private var starSpacing: Int = 0
    private var starSize: Int = 0
    private var starFilled: Drawable? = null
    private var starEmpty: Drawable? = null

    init {
        orientation = HORIZONTAL

        context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.CustomRatingView,
            0, 0
        ).apply {
            try {
                starCount = getInt(R.styleable.CustomRatingView_starCount, 5)
                rating = getFloat(R.styleable.CustomRatingView_rating, 0f)
                starSpacing = getDimensionPixelSize(R.styleable.CustomRatingView_starSpacing, 0)
                starSize = getDimensionPixelSize(R.styleable.CustomRatingView_starSize, 0) // ⭐
                starFilled = getDrawable(R.styleable.CustomRatingView_starFilled)
                starEmpty = getDrawable(R.styleable.CustomRatingView_starEmpty)
            } finally {
                recycle()
            }
        }

        refreshStars()
    }

    private fun refreshStars() {
        removeAllViews()

        for (i in 0 until starCount) {
            val starView = ImageView(context)

            val params = LayoutParams(
                if (starSize > 0) starSize else LayoutParams.WRAP_CONTENT,
                if (starSize > 0) starSize else LayoutParams.WRAP_CONTENT
            )

            if (i > 0) params.marginStart = starSpacing
            starView.layoutParams = params

            val isFull = i + 1 <= rating

            starView.setImageDrawable(
                when {
                    isFull -> starFilled
                    else -> starEmpty
                }
            )

            addView(starView)
        }
    }

    fun setRating(value: Float) {
        rating = value
        refreshStars()
    }
}

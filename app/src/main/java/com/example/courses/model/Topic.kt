package com.example.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic (
    @StringRes val Toptitle: Int ,
    val number : Int,
    @DrawableRes val image : Int
)
package com.example.latihan13_juaraandroid.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResourceId: Int,
    val mModelVersion: Int,
    @DrawableRes val imageResourceId: Int
)

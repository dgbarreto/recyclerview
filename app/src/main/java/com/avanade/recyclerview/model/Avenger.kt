package com.avanade.recyclerview.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Avenger (
    @StringRes val stringResourceId : Int,
    @DrawableRes val imageResourceId : Int)
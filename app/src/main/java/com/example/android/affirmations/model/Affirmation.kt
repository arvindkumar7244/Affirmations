package com.example.android.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(@StringRes val stringResource: Int, @DrawableRes val drawableResource: Int)

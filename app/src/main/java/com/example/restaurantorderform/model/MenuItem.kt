package com.example.restaurantorderform.model

import androidx.annotation.StringRes

data class MenuItem (
    @StringRes val name: Int,
    val price: Double,
    @StringRes val description: Int,
    val image: Int,
    @StringRes val category: Int
)
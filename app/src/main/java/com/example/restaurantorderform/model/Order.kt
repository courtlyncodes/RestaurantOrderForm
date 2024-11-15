package com.example.restaurantorderform.model

import androidx.annotation.StringRes

data class Order (
    val items: List<MenuItem>,
    val total: Double,
    @StringRes val status: Int
)
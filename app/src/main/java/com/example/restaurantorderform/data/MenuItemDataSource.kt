package com.example.restaurantorderform.data

import com.example.restaurantorderform.R
import com.example.restaurantorderform.model.MenuItem

class MenuItemDataSource {
    val menuItems = listOf(
        MenuItem(
            name = R.string.cheeseburger,
            price = 8.99,
            description = R.string.cheesburger_des,
            image = R.mipmap.cheeseburger,
            category = R.string.entree
        ),
        MenuItem(
            name = R.string.grilled_chicken_sandwich,
            price = 7.99,
            description = R.string.grilled_chicken_sandwich_des,
            image = R.mipmap.grilled_chicken_sandwich,
            category = R.string.entree
        ),
        MenuItem(
            name = R.string.veggie_wrap,
            price = 6.99,
            description = R.string.veggie_wrap_des,
            image = R.mipmap.veggie_wrap,
            category = R.string.entree
        ),
        MenuItem(
            name = R.string.spaghetti_bolognese,
            price = 10.99,
            description = R.string.spaghetti_bolognese_des,
            image = R.mipmap.spaghetti_bolognese,
            category = R.string.entree
        ),
        MenuItem(
            name = R.string.caesar_salad,
            price = 9.99,
            description = R.string.caesar_salad_des,
            image = R.mipmap.caesar_salad,
            category = R.string.appetizer
        ),
        MenuItem(
            name = R.string.garden_salad,
            price = 8.99,
            description = R.string.garden_salad_des,
            image = R.mipmap.garden_salad,
            category = R.string.appetizer
        ),
        MenuItem(
            name = R.string.fries,
            price = 2.99,
            description = R.string.fries_des,
            image = R.mipmap.fries,
            category = R.string.side_dish
        ),
        MenuItem(
            name = R.string.sweet_potato_fries,
            price = 3.99,
            description = R.string.sweet_potato_fries_des,
            image = R.mipmap.sweet_potato_fries,
            category = R.string.side_dish
        ),
        MenuItem(
            name = R.string.onion_rings,
            price = 4.49,
            description = R.string.onion_rings_des,
            image = R.mipmap.onion_rings,
            category = R.string.side_dish
        ),
        MenuItem(
            name = R.string.mozzarella_sticks,
            price = 5.99,
            description = R.string.mozzarella_sticks_des,
            image = R.mipmap.mozzarella_sticks,
            category = R.string.side_dish
        ),
        MenuItem(
            name = R.string.chocolate_cake,
            price = 4.99,
            description = R.string.chocolate_cake_des,
            image = R.mipmap.chocolate_cake,
            category = R.string.dessert
        ),
        MenuItem(
            name = R.string.cheesecake,
            price = 5.99,
            description = R.string.cheesecake_des,
            image = R.mipmap.cheesecake,
            category = R.string.dessert
        ),
        MenuItem(
            name = R.string.ice_cream_sundae,
            price = 3.99,
            description = R.string.ice_cream_sundae_des,
            image = R.mipmap.ice_cream_sundae,
            category = R.string.dessert
        ),
        MenuItem(
            name = R.string.apple_pie,
            price = 4.49,
            description = R.string.apple_pie_des,
            image = R.mipmap.apple_pie,
            category = R.string.dessert
        ),
        MenuItem(
            name = R.string.soda,
            price = 1.99,
            description = R.string.soda_des,
            image = R.mipmap.soda,
            category = R.string.drink
        ),
        MenuItem(
            name = R.string.iced_tea,
            price = 2.49,
            description = R.string.iced_tea_des,
            image = R.mipmap.iced_tea,
            category = R.string.drink
        ),
        MenuItem(
            name = R.string.lemonade,
            price = 2.99,
            description = R.string.lemonade_des,
            image = R.mipmap.lemonade,
            category = R.string.drink
        ),
        MenuItem(
            name = R.string.coffee,
            price = 1.99,
            description = R.string.coffee_des,
            image = R.mipmap.coffee,
            category = R.string.drink
        ),
        MenuItem(
            name = R.string.hot_chocolate,
            price = 2.99,
            description = R.string.hot_chocolate_des,
            image = R.mipmap.hot_chocolate,
            category = R.string.drink
        ),
        MenuItem(
            name = R.string.milkshake,
            price = 4.99,
            description = R.string.milkshake_des,
            image = R.mipmap.milkshake,
            category = R.string.drink
        )
    )
}


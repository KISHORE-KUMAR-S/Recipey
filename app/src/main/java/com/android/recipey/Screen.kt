package com.android.recipey

sealed class Screen(val route : String) {
    object RecipeScreen : Screen("recipescreen")
    object DetailsScreen : Screen("detailscreen")
}
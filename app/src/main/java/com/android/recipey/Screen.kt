package com.android.recipey

sealed class Screen(val route : String) {
    data object RecipeScreen : Screen("recipescreen")
    data object DetailsScreen : Screen("detailscreen")
}
package com.example.foodyapp.models

/**
 * @author Mingaleev D. 15.07.2022
 **/
data class Result(
    val aggregateLikes: Int,
    val cheap: Boolean,
    val dairyFree: Boolean,
    val extendedIngredients:List<ExtendedIngredient>,
    val glutenFree: Boolean,
    val id: Int,
    val image: String,
    val readyInMinutes: Int,
    val sourceName: String,
    val sourceUrl: String,
    val summary: String,
    val title: String,
    val vegan: String,
    val vegetarian: Boolean,
    val veryHealthy: Boolean
)

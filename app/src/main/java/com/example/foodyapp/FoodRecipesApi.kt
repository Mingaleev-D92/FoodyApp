package com.example.foodyapp

import com.example.foodyapp.models.FoodRecipe
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

/**
 * @author Mingaleev D. 15.07.2022
 **/
interface FoodRecipesApi {

    @GET("/recipes/complexSearch")
    suspend fun getRecipes(
        @QueryMap queries:Map<String,String>
    ): Response<FoodRecipe>
}
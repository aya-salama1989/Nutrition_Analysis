package com.misr.nutritionanalysis.modules.analyse.data

import com.misr.nutritionanalysis.modules.analyse.data.model.AnalysePostResponse
import com.misr.nutritionanalysis.modules.analyse.data.model.Ingredients
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface AnalyseAPI {
//
//    @GET("api/nutrition-data")
//    suspend fun getIngredientAnalysis(
//        @Query("app_id") appId: String = "47379841",
//        @Query("app_key") appKey: String = "d28718060b8adfd39783ead254df7f92",
//        @Query("ingr") ingredients : String
//    ): AnalyseAPIResponse


    @POST("api/nutrition-details")
    suspend fun postIngredientAnalysis(
        @Query("app_id") appId: String = "47379841",
        @Query("app_key") appKey: String = "d28718060b8adfd39783ead254df7f92",
        @Body ingredients : Ingredients
    ): AnalysePostResponse

}
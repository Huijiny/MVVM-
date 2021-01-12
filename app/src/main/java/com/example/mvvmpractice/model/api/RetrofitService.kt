package com.example.mvvmpractice.model.api

import com.example.mvvmpractice.model.data.WeatherData
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {
    @GET("/data/2.5/weather")
    fun requestWeather(
        @Query("q") cityName: String,
        @Query("appid") apiKey: String
    ): Single<WeatherData>
}
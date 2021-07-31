package com.xx1196.doglist

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {
    @GET
    suspend fun getDogsByBreed(@Url url: String): Response<DogsResponse>
}
package com.odhiambopaul.movies.network

import com.revolve44.rxjavaretrofit.network.PopularMovies
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface TmdbEndpoints {

    @GET("/3/movie/popular")
    fun getMovies(@Query("api_key") key: String): Observable<PopularMovies>

//    @GET("/3/movie/popular")
//    fun getMovies(@Query("api_key") key: String): Call<PopularMovies>

}
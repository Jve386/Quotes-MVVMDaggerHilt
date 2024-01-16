/**
 * This file defines a singleton object `RetrofitHelper` responsible for creating and providing a configured
 * Retrofit instance for the MVVM sample application.
 *
 * @property getRetrofit A function to obtain a Retrofit instance with a specific base URL and Gson converter factory.
 */
package com.jve386.mvvmsample.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

    /**
     * Function to obtain a Retrofit instance with a specific base URL and Gson converter factory.
     *
     * @return Configured Retrofit instance.
     */
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://drawsomething-59328-default-rtdb.europe-west1.firebasedatabase.app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}

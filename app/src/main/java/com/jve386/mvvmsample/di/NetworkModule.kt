/**
 * This file defines a Dagger Hilt module `NetworkModule` that provides dependencies related to network operations,
 * such as Retrofit instances and the implementation of the `QuoteApiClient`.
 */
package com.jve386.mvvmsample.di

import com.jve386.mvvmsample.data.network.QuoteApiClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    /**
     * Provides a singleton Retrofit instance with a specific base URL and Gson converter factory.
     *
     * @return Configured Retrofit instance.
     */
    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://randomquotes-50254-default-rtdb.europe-west1.firebasedatabase.app//")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    /**
     * Provides a singleton instance of the `QuoteApiClient` implementation using the provided Retrofit instance.
     *
     * @param retrofit Configured Retrofit instance.
     * @return Implementation of the `QuoteApiClient`.
     */
    @Singleton
    @Provides
    fun provideQuoteApiClient(retrofit: Retrofit): QuoteApiClient {
        return retrofit.create(QuoteApiClient::class.java)
    }

}

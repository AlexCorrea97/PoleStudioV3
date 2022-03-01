package com.example.polestudiov3.di

import androidx.navigation.Navigator
import com.example.polestudiov3.provider.LoginProvider
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.*
import okhttp3.HttpUrl.Companion.toHttpUrl
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ProviderModule {
    @Provides
    @Named("BaseUrl")
    fun provideBaseUrl() = "https://idaxmx.com/Projects/PoleStudio/v2/".toHttpUrl()

    @Provides
    @Named("CalendarFormat")
    fun provideCalendarFormat() = "yyyy-MM-dd"

    @Singleton
    @Provides
    fun provideRetrofit(@Named("BaseUrl") baseUrl: HttpUrl,
                        @Named("CalendarFormat") calendarFormat: String):Retrofit {
        val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        val client =
            OkHttpClient.Builder().addInterceptor(BasicAuthInterceptor())
                .build()
        val gson = GsonBuilder().setDateFormat(calendarFormat).create()
        val retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(client)
            .build()
        return retrofit
    }
    @Provides
    @Singleton
    fun providerLoginProvider(retrofit: Retrofit): LoginProvider =
        retrofit.create(LoginProvider::class.java)


}
class BasicAuthInterceptor : Interceptor {

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val request: Request = chain.request()
        val authenticatedRequest: Request = request.newBuilder()
            .header("Authorization", "Authorization").build()
        return chain.proceed(authenticatedRequest)
    }
}
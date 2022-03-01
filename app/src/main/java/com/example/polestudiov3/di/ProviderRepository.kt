package com.example.polestudiov3.di

import com.example.polestudiov3.provider.LoginProvider
import com.example.polestudiov3.repository.LoginRepository
import com.example.polestudiov3.repository.LoginRepositoryImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ProviderRepository {
    @Provides
    @Singleton
    fun providerLoginRepository(loginProvider: LoginProvider): LoginRepository =
        LoginRepositoryImp(loginProvider)
}
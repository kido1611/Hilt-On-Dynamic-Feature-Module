package id.kido1611.example.hiltfeature.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import id.kido1611.example.hiltfeature.AppConfig
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    fun provinceAppConfig(): AppConfig {
        return AppConfig()
    }
}
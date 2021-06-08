package id.kido1611.example.hiltfeature.feature.view.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import id.kido1611.example.hiltfeature.AppConfig
import id.kido1611.example.hiltfeature.credential.Credential
import id.kido1611.example.hiltfeature.feature.view.ViewModelFactory

@Module
@InstallIn(SingletonComponent::class)
class ViewModule {

    @Provides
    fun provideViewModelFactory(credential: Credential, appConfig: AppConfig): ViewModelFactory {
        return ViewModelFactory(credential, appConfig)
    }
}
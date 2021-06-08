package id.kido1611.example.hiltfeature.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import id.kido1611.example.hiltfeature.credential.Credential
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class CredentialModule {

    @Singleton
    @Provides
    fun provideCredential(): Credential {
        return Credential()
    }
}